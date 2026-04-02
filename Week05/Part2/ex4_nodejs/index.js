const express = require("express");

const app = express();

app.set("view engine", "ejs");
app.set("views", "./views");

const router = express.Router();

router.get("/", (req, res) => res.render("index"));

app.use("/", router);

app.listen(3000, () => console.log("Ứng dụng đang chạy !"));
