package decorator.decorator;

import decorator.core.Jugador;

public class LiderVestuarioDecorator extends  JugadorDecorator{

    public LiderVestuarioDecorator(Jugador jugador) {
        super(jugador);
    }

    @Override
    public String obtenerHabilidades() {
        return jugador.obtenerHabilidades() + " Y es un lider en el vestuario";
    }
}
