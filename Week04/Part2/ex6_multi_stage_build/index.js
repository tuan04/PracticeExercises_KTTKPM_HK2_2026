const express = require("express");

const app = express();

const router = express.Router();

router.get("/", (req, res) => res.json("Hello, Docker !"));

app.use("/", router);

app.listen(3000, () => console.log("Ứng dụng đã chạy"));
