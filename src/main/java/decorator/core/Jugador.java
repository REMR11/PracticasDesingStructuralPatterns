package decorator.core;

public abstract class Jugador {
    public String nombre;
    public String posicion;

    public Jugador(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public abstract String obtenerHabilidades();
}
