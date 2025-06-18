package bridge.model.implementation;

import bridge.interfaces.Dispositivo;

public class Radio implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 50;


    @Override
    public void encender() {
        this.encendido = true;
        System.out.println("Radio encendida");
    }

    @Override
    public void apagar() {
        this.encendido = false;
        System.out.println("Radio apagada");
    }

    @Override
    public void ajustarVolumen(int volumen) {
        this.volumen = volumen;
        System.out.println("Volumen de la radio ajutado a : " + volumen);
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
