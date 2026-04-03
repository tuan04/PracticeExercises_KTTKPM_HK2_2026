package iuh.fit.AdapterDataTransfer;

public class Client {
    public static void main(String[] args) {
        SystemB_UseXml serviceB = new SystemB_UseXml();

        DataAdapter adapter = new XmlAdapter(serviceB);

        adapter.sendData("{\"name\":\"Tuan\", \"phone\":\"0367155132\"}");

    }
}
