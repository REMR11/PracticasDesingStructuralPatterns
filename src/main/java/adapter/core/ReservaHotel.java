package adapter.core;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReservaHotel {
    private String nombreHuesped;
    private String fechaEntrada;
    private String fechaSalida;
    private String tipoHabitacion;


    @Override
    public String toString() {
        return String.format(
            "Reserva de hotel para:  "+ nombreHuesped+ "\n"
                + "Fecha de entrada: \t\t" + fechaEntrada +"\n"
                + "Fecha de salida: \t\t" + fechaSalida +"\n"
                + "Tipo de habitacion: \t"+ tipoHabitacion+ "\n"
        );
    }
}
