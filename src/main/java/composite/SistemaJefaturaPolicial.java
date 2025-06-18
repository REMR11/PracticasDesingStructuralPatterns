package composite;

import composite.model.implementation.JefePolicial;
import composite.model.implementation.Policia;

public class SistemaJefaturaPolicial {
    public static void main(String[] args) {
        // Crear policías individuales
        Policia patrullero1 = new Policia("Juan Pérez", "Patrullero");
        Policia oficial1 = new Policia("María López", "Oficial");
        Policia oficial2 = new Policia("Pedro González", "Oficial");

        // Crear jefes de policía
        JefePolicial jefe1 = new JefePolicial("Carlos Martínez", "Jefe de Distrito");
        JefePolicial jefeGeneral = new JefePolicial("Javier Torres", "Jefe General");

        // Agregar subordinados
        jefe1.agregarSubordinado(patrullero1);
        jefe1.agregarSubordinado(oficial1);

        jefeGeneral.agregarSubordinado(jefe1);
        jefeGeneral.agregarSubordinado(oficial2);

        // Mostrar la estructura jerárquica
        jefeGeneral.mostrarDetalles();
    }
}
