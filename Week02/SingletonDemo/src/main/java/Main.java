import db.EagerConnectDB;
import db.LazyConnectDB;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //Kết nối database
//        EagerConnectDB.getConnection();
//        LazyConnectDB.getConnection();
        Class.forName("db.EagerConnectDB");
//        Class.forName("db.LazyConnectDB");
    }
}
