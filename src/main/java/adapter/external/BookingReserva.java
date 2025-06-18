package adapter.external;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingReserva {
    private String questName;
    private String checkInDate;
    private String checkOutDate;
    private String roomType;
}
