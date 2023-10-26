package Airline;

import java.util.ArrayList;

public class Flight {

    private String destination;
    private ArrayList<Passenger> passengers;
    private int flightID;
    private int gateNumber;

    public Flight(String destination, int flightID){
        this.destination = destination;
        this.passengers = new ArrayList<Passenger>();
        this.flightID = flightID;
        this.gateNumber = 0;
    }

    public boolean checkStatus(){
        if (gateNumber==0) {
            return false;
        } else { return true;}
    }

    public void addPassenger(Passenger Going){
        this.passengers.add(Going);
    }

    public void removePassenger(Passenger notGoing){
        this.passengers.remove(notGoing);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }
}
