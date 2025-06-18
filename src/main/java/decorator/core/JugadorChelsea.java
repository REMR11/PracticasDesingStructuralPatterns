package decorator.core;

public class JugadorChelsea extends Jugador{

    public JugadorChelsea(String nombre, String posicion) {
        super(nombre, posicion);
    }

    @Override
    public String obtenerHabilidades() {
        return nombre + " juega como "+ posicion;
    }
}
