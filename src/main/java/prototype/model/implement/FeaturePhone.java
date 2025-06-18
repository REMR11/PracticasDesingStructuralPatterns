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
public class FeaturePhone implements Telefono {
    private String marca;
    private String modelo;
    private int capacidadBateria;

    @Override
    public Telefono clonar() {
        try {
            return (FeaturePhone) super.clone();
        }
        catch (CloneNotSupportedException e){
            return null;
        }
    }
}
