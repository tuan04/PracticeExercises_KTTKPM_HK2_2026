const express = require('express');
const cors = require('cors');
const Redis = require('ioredis');

const app = express();
app.use(cors());
app.use(express.json());

const redis = new Redis({ host: '172.16.35.149', port: 6379 });
redis.on('error', err => console.error('[Redis]', err.message));

app.get('/health', (req, res) => res.json({ status: 'ok', service: 'PU1-Product', source: 'Redis Data Grid' }));

// GET /products 
app.get('/products', async (req, res) => {
  try {
    const data = await redis.get('products');
    res.json(data ? JSON.parse(data) : []);
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
});

// GET /products/:id 
app.get('/products/:id', async (req, res) => {
  try {
    const data = await redis.get(`product:${req.params.id}`);
    if (!data) return res.status(404).json({ error: 'Product not found' });
    res.json(JSON.parse(data));
  } catch (err) {
    res.status(500).json({ error: err.message });
  }
});

app.listen(8081, () => console.log('product service đang chạy trên port 8081'));
