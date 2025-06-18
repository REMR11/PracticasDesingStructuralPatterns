package adapter.adapters;

import adapter.core.ReservaHotel;
import adapter.external.ExpediaReserva;
import adapter.ports.PlataformaReserva;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlataformaExpediaAdapter implements PlataformaReserva {
    private ExpediaReserva expediaReserva;


    @Override
    public ReservaHotel obtenerReserva() {
        String nombreHuesped = expediaReserva.getNombre();
        String fechaEntrada = expediaReserva.getFechaIngreso();
        String fechaSalida = expediaReserva.getFechaSalida();
        String tipoHabitacion = expediaReserva.getTipoCuarto();

        return new ReservaHotel(nombreHuesped, fechaEntrada, fechaSalida, tipoHabitacion);
    }
}
