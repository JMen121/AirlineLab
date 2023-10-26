import Airline.Flight;
import Airline.ManagingSystem;
import Airline.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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


    @Test
    public void canSetFlightList(){
        managingSystem.createNewFlight(flight);
        managingSystem.createNewFlight(flight);
        managingSystem.getFlightList();
        assertThat(managingSystem.getFlightList().size()).isEqualTo(2);
    }

   @Test
    public void canBookPassenger(){
        managingSystem.bookPassenger(passenger);
        managingSystem.bookPassenger(passenger);
        managingSystem.bookPassenger(passenger);
       managingSystem.removePassenger(passenger);
      assertThat(managingSystem.getBookedList().size()).isEqualTo(2);}




    @Test
    public void canRemovePassenger(){
        managingSystem.bookPassenger(passenger);
        managingSystem.bookPassenger(passenger);
        managingSystem.removePassenger(passenger);
        assertThat(managingSystem.getBookedList().size()).isEqualTo(1);
    }

    @Test
    public void canCreateNewFlight(){
        managingSystem.createNewFlight(flight);
        managingSystem.createNewFlight(flight);
        managingSystem.createNewFlight(flight);
        managingSystem.cancelFlight(flight);
        assertThat(managingSystem.getFlightList().size()).isEqualTo(2);
    }

    @Test
    public void canCancelFlights(){
        managingSystem.createNewFlight(flight);
        managingSystem.createNewFlight(flight);
        managingSystem.cancelFlight(flight);
        assertThat(managingSystem.getFlightList().size()).isEqualTo(1);
    }

    @Test
    public void canDisplayAllFlights(){
        managingSystem.createNewFlight(flight);
        managingSystem.createNewFlight(flight);
        assertThat(managingSystem.getFlightList().size()).isEqualTo(2);
    }

}
