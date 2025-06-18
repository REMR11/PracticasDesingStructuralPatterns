package adapter.adapters;

import adapter.core.ReservaHotel;
import adapter.external.BookingReserva;
import adapter.ports.PlataformaReserva;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlataformaBookingAdapter implements PlataformaReserva {
    private BookingReserva bookingReserva;

    @Override
    public ReservaHotel obtenerReserva() {
        String nombre = bookingReserva.getQuestName();
        String fechaEntrada = bookingReserva.getCheckInDate();
        String fechaSalida = bookingReserva.getCheckOutDate();
        String tipoHabitacion = bookingReserva.getRoomType();

        return new ReservaHotel(nombre, fechaEntrada, fechaSalida, tipoHabitacion);
    }
}
