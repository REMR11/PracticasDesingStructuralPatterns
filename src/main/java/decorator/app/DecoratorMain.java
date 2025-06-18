package decorator.app;

import decorator.core.Jugador;
import decorator.core.JugadorChelsea;
import decorator.decorator.CapitanDecorator;
import decorator.decorator.EspecialistaPenalesDecorator;
import decorator.decorator.LiderVestuarioDecorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Jugador jugador1 = new JugadorChelsea("Mason Mount", "MedioCampista");

        jugador1 = new CapitanDecorator(jugador1);
        jugador1 = new LiderVestuarioDecorator(jugador1);

        System.out.println(jugador1.obtenerHabilidades());

        Jugador  jugador2 = new JugadorChelsea("Jorginho", "MedioCampista");

        jugador2 = new EspecialistaPenalesDecorator(jugador2);
        System.out.println(jugador2.obtenerHabilidades());
    }
}
