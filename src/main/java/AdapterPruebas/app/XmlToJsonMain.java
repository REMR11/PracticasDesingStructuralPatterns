package AdapterPruebas.app;

import AdapterPruebas.adapter.XmlToJsonAdapter;
import AdapterPruebas.external.XmlDataProvider;
import AdapterPruebas.interfaces.JsonData;

public class XmlToJsonMain {
    public static void main(String[] args) {
        try {
            XmlDataProvider provider = new XmlDataProvider("src/main/java/AdapterPruebas/sources/users.xml");
            JsonData adapter = new XmlToJsonAdapter(provider);

            System.out.println("JSON Output:");
            System.out.println(adapter.getJson());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
