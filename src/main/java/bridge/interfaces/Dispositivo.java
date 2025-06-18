package bridge.interfaces;

public interface Dispositivo {
    void encender();
    void apagar();
    void ajustarVolumen(int volumen);
    boolean estaEncendido();
}
