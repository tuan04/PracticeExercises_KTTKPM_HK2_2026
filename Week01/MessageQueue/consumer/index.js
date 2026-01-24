import amqp from "amqplib";

const RABBITMQ_URL = "amqp://user:password@rabbitmq:5672";
const QUEUE = "queue";
const DLQ = "order_queue.dlq";

async function consumerConnect() {
  try {
    const conn = await amqp.connect(RABBITMQ_URL);
    const channel = await conn.createChannel();

    await channel.assertQueue(DLQ, { durable: true });

    await channel.assertQueue(QUEUE, {
      durable: true,
      deadLetterExchange: "",
      deadLetterRoutingKey: DLQ,
    });

    channel.consume(QUEUE, async (msg) => {
      if (!msg) return;

      try {
        const data = JSON.parse(msg.content.toString());

        if (!data.message) {
          throw new Error("Thiếu message");
        }

        await new Promise((r) => setTimeout(r, 3000));

        console.log("Process success");
        channel.ack(msg);
      } catch (err) {
        console.log("Đẩy vào DLQ:", err.message);
        channel.nack(msg, false, false);
      }
    });
  } catch (err) {
    setTimeout(consumerConnect, 3000);
  }
}

consumerConnect();
