import Airline.Flight;
import Airline.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

  @Test
  public void canAddPassenger(){
       flight.addPassenger(passenger);
     assertThat(flight.getPassengers().size()).isEqualTo(1);
   }

   @Test
    public void canRemovePassenger(){
        flight.addPassenger(passenger);
        flight.removePassenger(passenger);
        assertThat(flight.getPassengers()).size().isEqualTo(0);
    }

    @Test
    public void canCheckStatus(){
        flight.setGateNumber(5);
        assertThat(flight.checkStatus()).isEqualTo(true);
    }

}
