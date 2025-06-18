package decorator.decorator;

import decorator.core.Jugador;

public abstract class JugadorDecorator extends Jugador {
    protected Jugador jugador;

    public JugadorDecorator(Jugador jugador) {
        super(jugador.nombre,  jugador.posicion);
        this.jugador = jugador;
    }

    @Override
    public abstract String obtenerHabilidades();
}
