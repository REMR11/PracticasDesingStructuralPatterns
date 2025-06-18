package facade.sub_sistemas;

public class SistemaReservas {
    public void crearReserva(String nombreCliente, String destino, String fecha){
        System.out.println("Reserva creada para " + nombreCliente + " con destino " + destino + " dia " + fecha);
    }
}
