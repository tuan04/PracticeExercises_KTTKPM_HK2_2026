const express = require("express");
const mysql = require("mysql2");
const app = express();

const router = express.Router();

const connect = mysql.createConnection({
  host: "mysql_db",
  user: "user",
  password: "password",
  database: "mydb",
});

connect.connect((err) => {
  if (err) {
    console.error("Lỗi kết nối MySQL: " + err.stack);
    return;
  }
  console.log("Đã kết nối MySQL thành công!");
});

router.get("/", (req, res) =>
  res.json({
    name: "HaThanhTuan",
  }),
);

app.use("/", router);

app.listen(3000, () => console.log("Ứng dụng đang chạy !"));
