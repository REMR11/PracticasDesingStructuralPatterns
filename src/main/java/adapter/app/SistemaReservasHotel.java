package adapter.app;

import adapter.adapters.PlataformaBookingAdapter;
import adapter.adapters.PlataformaExpediaAdapter;
import adapter.core.ReservaHotel;
import adapter.external.BookingReserva;
import adapter.external.ExpediaReserva;
import adapter.ports.PlataformaReserva;

public class SistemaReservasHotel {

    public static void main(String[] args) {
        // Simulamos una reserva en Booking
        BookingReserva bookingReserva = new BookingReserva("Juan Perez", "2024-10-20", "2024-10-25", "Suite");
        PlataformaReserva bookingAdapter = new PlataformaBookingAdapter(bookingReserva);
        ReservaHotel reservaHotel1 = bookingAdapter.obtenerReserva();
        System.out.println(reservaHotel1.toString());

        // Simulamos una reserva en Expedia
        ExpediaReserva expediaReserva = new ExpediaReserva("Ana Lopez", "2024-11-01", "2024-11-07", "Doble");
        PlataformaReserva expediaAdapter = new PlataformaExpediaAdapter(expediaReserva);
        ReservaHotel reservaHotel2 = expediaAdapter.obtenerReserva();
        System.out.println(reservaHotel2.toString());
    }
}
