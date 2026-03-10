package db;

//gia lap ket noi db
public class EagerConnectDB {
    private final static EagerConnectDB connection = new EagerConnectDB();

    private EagerConnectDB(){
        System.out.println("Đã kết nối csdl");
    }

    public static Object getConnection() {
        return connection;
    }
}
