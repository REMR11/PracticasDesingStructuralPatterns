package facade.app;

import facade.facades.GestionVuelosFacade;

public class FacadeMain {
    public static void main(String[] args) {
        GestionVuelosFacade gestionVuelos = new GestionVuelosFacade();

        // Reservar un vuelo utilizando la fachada
        gestionVuelos.reservarVuelo("Oscar Romero", "Nueva York", "25-10-2024", 500.00);
    }
}
