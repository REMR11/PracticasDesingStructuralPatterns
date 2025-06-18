package adapter.external;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExpediaReserva {
    private String nombre;
    private String fechaIngreso;
    private String fechaSalida;
    private String tipoCuarto;
}
