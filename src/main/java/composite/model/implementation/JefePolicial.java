package composite.model.implementation;

import composite.interfaces.UnidadPolicial;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class JefePolicial implements UnidadPolicial {
    private String nombre;
    private String rango;
    private List<UnidadPolicial> subordinados;

    public JefePolicial(String nombre, String rango) {
        this.nombre = nombre;
        this.rango = rango;
        this.subordinados =new ArrayList<>();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Jefe policial: "+ this.nombre + ", Rango: " + this.rango + "\n");
        subordinados.stream()
                .forEach(subordinado ->  subordinado.mostrarDetalles());
    }

    public void agregarSubordinado(UnidadPolicial patrullero) {
        subordinados.add(patrullero);
    }
}
