package iuh.fit.AdapterDataTransfer;

import org.json.JSONObject;
import org.json.XML;

public class XmlAdapter implements DataAdapter {
    private SystemB_UseXml service;

    public XmlAdapter(SystemB_UseXml service) {
        this.service = service;
    }

    public String jsonToXml(String json) {
        JSONObject jsonObject = new JSONObject(json);
        return XML.toString(jsonObject);
    }


    @Override
    public void sendData(String json) {
        service.useData(jsonToXml(json));
    }
}
