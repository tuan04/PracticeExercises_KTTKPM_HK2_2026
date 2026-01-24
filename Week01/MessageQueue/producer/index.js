import express from "express";
import amqp from "amqplib";

const RABBITMQ_URL = "amqp://user:password@rabbitmq:5672";
const QUEUE = "queue";
const DLQ = "order_queue.dlq";

const app = express();
app.use(express.json());

let channel = null;

async function connectRabbit() {
  try {
    const conn = await amqp.connect(RABBITMQ_URL);
    channel = await conn.createChannel();

    await channel.assertQueue(DLQ, { durable: true });

    await channel.assertQueue(QUEUE, {
      durable: true,
      deadLetterExchange: "",
      deadLetterRoutingKey: DLQ,
    });

    console.log("Producer connected");
  } catch (err) {
    setTimeout(connectRabbit, 3000);
  }
}

connectRabbit();

app.post("/send", (req, res) => {
  const { message } = req.body;

  const data = {
    message,
    date: Date.now(),
  };

  channel.sendToQueue(QUEUE, Buffer.from(JSON.stringify(data)), {
    persistent: true,
  });

  res.json({ ok: true, data });
});

app.listen(3000, () => {
  console.log("Producer chạy port 3000");
});
