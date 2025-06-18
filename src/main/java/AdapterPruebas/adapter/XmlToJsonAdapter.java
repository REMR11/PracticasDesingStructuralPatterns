package AdapterPruebas.adapter;

import AdapterPruebas.external.XmlDataProvider;
import AdapterPruebas.interfaces.JsonData;
import AdapterPruebas.model.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class XmlToJsonAdapter implements JsonData {
    private XmlDataProvider xmlDataProvider;

    @Override
    public String getJson() {
        try {
            String xml = xmlDataProvider.getXml();

            XmlMapper xmlMapper = new XmlMapper();
            Users users = xmlMapper.readValue(xml, Users.class);

            ObjectMapper jsonMapper = new ObjectMapper();
            return jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
    }
}
