package bridge.model;

import bridge.interfaces.Dispositivo;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ControlRemoto {
    protected Dispositivo dispositivo;

    public void encender(){
        dispositivo.encender();
    }



}
