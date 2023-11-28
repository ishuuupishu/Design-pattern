class JSON {
    public JSON(String data) {
    }

    XML convertToXML() {
        return new XML("Stringified JSON data");
    }
}

class XML {
    public XML(String data) {
        System.out.println(data);
    }
}

interface IAdapter {
    XML convert(JSON json);
}

class JsonToXmlAdapter implements IAdapter {
    public JsonToXmlAdapter(JSON json) {
    }

    @Override
    public XML convert(JSON json) {
        return json.convertToXML();
    }
}

public class AdapterClient {
    public static void main(String[] args) {
        JSON json = new JSON("String data");
        IAdapter iAdapter = new JsonToXmlAdapter(json);
        iAdapter.convert(json);
    }
}