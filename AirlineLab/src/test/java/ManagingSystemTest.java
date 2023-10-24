import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ManagingSystemTest {

    Passenger passenger;

    Flight flight;

    ManagingSystem managingSystem;


    @BeforeEach
    public void setup(){
        passenger = new Passenger("Colin", "email",4545, true, 6);
        flight = new Flight("Poland", 340);
        managingSystem = new ManagingSystem();
    }


    /*@Test
    public void canSetFlightList(){
        managingSystem.FlightList(Flight flight);
        assertThat(managingSystem.getFlightList());
    }*/

    @Test
    public void canBookPassenger(Passenger passenger){
        managingSystem.setBookedList(passenger);
        assertThat(managingSystem.)
    }

    @Test
    public void canRemovePassenger(Passenger passenger){}

    @Test
    public void canCreateNewFlight(){}

    @Test
    public void canCancelFlights(){}

    @Test
    public void canDisplayAllFlights(){}

}
