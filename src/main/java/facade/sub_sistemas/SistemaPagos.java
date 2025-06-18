package facade.sub_sistemas;

public class SistemaPagos {
    public void procesoPago(String nombreCliente, double monto){
        System.out.println("Procesando pago de $ " + monto + " para " + nombreCliente);
    }
}
