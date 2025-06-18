package AdapterPruebas.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

//public class Users {
//    @JacksonXmlElementWrapper(useWrapping = false)
//    private List<User> user;
//
//    public List<User> getUser() {
//        return user;
//    }
//}

public record UsersDTO(
   @JacksonXmlElementWrapper(useWrapping = false)
   List<UserDTO> user
) {}