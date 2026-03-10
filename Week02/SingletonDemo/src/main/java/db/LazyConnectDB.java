package db;

public class LazyConnectDB {
    private static LazyConnectDB connection;

    private LazyConnectDB(){
        System.out.println("Bạn đã kết nối !");
    }

    public static LazyConnectDB getConnection() {
        if(connection == null){
            connection = new LazyConnectDB();
        }
        return connection;
    }
}
