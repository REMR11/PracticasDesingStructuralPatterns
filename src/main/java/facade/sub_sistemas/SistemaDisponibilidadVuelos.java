package facade.sub_sistemas;

import java.sql.SQLOutput;

public class SistemaDisponibilidadVuelos {
    public boolean verificarDisponibilidad(String destino, String fecha){
        System.out.println("Verificando disponibilidad de vuelos a " + destino + " en la fecha "  + fecha);
        return true;
    }
}
