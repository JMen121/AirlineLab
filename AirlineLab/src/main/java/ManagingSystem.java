import java.util.ArrayList;

public class ManagingSystem {

    private ArrayList<Flight>flightList;
    private ArrayList<Passenger> bookedList;


    public ManagingSystem(){
        this.flightList = new ArrayList<>();
        this.bookedList = new ArrayList<>();

    }

    public ArrayList<Passenger> getBookedList() {
        return bookedList;
    }

    public void setBookedList(ArrayList<Passenger> bookedList) {
        this.bookedList = bookedList;
    }
    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

    public void bookPassenger(Passenger passenger){
        this.bookedList.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        this.bookedList.remove(passenger);
    }

    public void createNewFlight(Flight flight){
        this.flightList.add(flight);
    }

    public void cancelFlight(Flight flight){
        this.flightList.remove(flight);
    }

    public ArrayList displayAllFlights(){
     return this.flightList
    ;}






















}
