package facade.facades;

import facade.sub_sistemas.SistemaAsignacionAsiento;
import facade.sub_sistemas.SistemaDisponibilidadVuelos;
import facade.sub_sistemas.SistemaPagos;
import facade.sub_sistemas.SistemaReservas;

public class GestionVuelosFacade {
    private SistemaDisponibilidadVuelos disponibilidadVuelos;
    private SistemaReservas sistemaReservas;
    private SistemaPagos sistemaPagos;
    private SistemaAsignacionAsiento sistemaAsignacionAsiento;


    public GestionVuelosFacade() {
        this.disponibilidadVuelos = new SistemaDisponibilidadVuelos();
        this.sistemaReservas = new SistemaReservas();
        this.sistemaPagos = new SistemaPagos();
        this.sistemaAsignacionAsiento = new SistemaAsignacionAsiento();
    }

    public void reservarVuelo(String nombreCliente, String destino, String fecha, double monto) {
        if (disponibilidadVuelos.verificarDisponibilidad(destino, fecha)) {
            sistemaReservas.crearReserva(nombreCliente, destino, fecha);
            sistemaPagos.procesoPago(nombreCliente, monto);
            sistemaAsignacionAsiento.asignarAsiento(nombreCliente);
            System.out.println("¡Reserva completada exitosamente para " + nombreCliente + "!");
        } else {
            System.out.println("Lo siento, no hay vuelos disponibles para " + destino + " en la fecha: " + fecha);
        }
    }
}
