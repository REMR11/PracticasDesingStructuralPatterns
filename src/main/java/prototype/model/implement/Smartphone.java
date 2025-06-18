package prototype.model.implement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import prototype.interfaces.Telefono;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Smartphone implements Telefono {

    private String marcha;
    private String modelo;
    private String sistemaOperativo;
    private int almacenamiento;

    @Override
    public Telefono clonar() {
        try{
            return (Smartphone)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
