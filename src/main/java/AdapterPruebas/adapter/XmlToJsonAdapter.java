package AdapterPruebas.adapter;

import AdapterPruebas.external.XmlDataProvider;
import AdapterPruebas.interfaces.JsonData;
import AdapterPruebas.model.UsersDTO;
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
            UsersDTO users = xmlMapper.readValue(xml, UsersDTO.class);

            ObjectMapper jsonMapper = new ObjectMapper();
//            return jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);
            return jsonMapper.writeValueAsString(users);


        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
    }
}
