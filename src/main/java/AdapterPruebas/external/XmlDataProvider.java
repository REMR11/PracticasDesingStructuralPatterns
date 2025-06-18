package AdapterPruebas.external;

import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlDataProvider {
    private String path;

    public XmlDataProvider(String path) {
        this.path = path;
    }

    public String getXml() throws Exception {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
