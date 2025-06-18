package decorator.decorator;

import decorator.core.Jugador;

public class EspecialistaPenalesDecorator extends JugadorDecorator{
    public EspecialistaPenalesDecorator(Jugador jugador) {
        super(jugador);
    }

    @Override
    public String obtenerHabilidades() {
        return jugador.obtenerHabilidades() + " Y es especialista en penales";
    }
}
