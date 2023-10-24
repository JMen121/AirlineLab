import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class FlightTest {

    Flight flight;
    Passenger passenger;
    Passenger passenger2;

    @BeforeEach
    public void setUp(){
        flight = new Flight("Split", 100);
        passenger = new Passenger("Collin", "email", 1, true, 2);
        passenger2 = new Passenger("Anna", "email2", 2, true, 3);

    }

//    @Test
//    public void canAddPassenger(){
//        flight.addPassenger(passenger);
//        assertThat(flight.getPassengers()).isEqualTo(passenger);
//    }

    @Test
    public void canRemovePassenger(){
        flight.addPassenger(passenger);
        flight.removePassenger(passenger);
        assertThat(flight.getPassengers()).isEqualTo(0);
    }

}
