package AdapterPruebas.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//
//public class User {
//    @JacksonXmlProperty(localName = "name")
//    private String name;
//
//    @JacksonXmlProperty(localName = "age")
//    private int age;
//
//}

public record UserDTO (
   @JacksonXmlProperty(localName = "name") String name,
   @JacksonXmlProperty(localName = "age") int age
) {}
