package decorator.decorator;

import decorator.core.Jugador;

public class CapitanDecorator extends JugadorDecorator{
    public CapitanDecorator(Jugador jugador) {
        super(jugador);
    }

    @Override
    public String obtenerHabilidades() {
        return jugador.obtenerHabilidades() + " y es el capitan del equipo";
    }
}
