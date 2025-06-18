package composite.model.implementation;

import composite.interfaces.UnidadPolicial;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policia implements UnidadPolicial {
    private String nombre;
    private String rango;

    @Override
    public void mostrarDetalles() {
        System.out.println("Policia: " + nombre + ", Rango: " + rango);
    }
}
