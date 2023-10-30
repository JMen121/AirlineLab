package Airline;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.StrictMath.random;

public class Main {
   //private ArrayList<Flight>flights = new ArrayList<>();
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private static ArrayList<Flight> flightList = new ArrayList<>();
   private  ArrayList<Passenger> bookedList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Bright Airline App, the no.1 Airline for comfort!");
        System.out.println("What is your name?");

        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine(); // This allows the computer to read the next line of the user
        System.out.println("Welcome " + username);

        System.out.println("Where would you like to explore today " + username + "?");
        System.out.println("Select a number to get started");

           //I want users to be able to write the number and then be directed to the page
        System.out.println(" 1. Add a Flight");
        System.out.println(" 2. Check Flight Status");
        System.out.println(" 3. Display all Flights");
        System.out.println(" 4. Cancel a Flight");
        System.out.println(" 5. Create a passenger");
        System.out.println(" 6. Remove Passenger");
        System.out.println(" 7. View Passengers");
        System.out.println(" 8. Add Passenger to a Flight");
        System.out.println("Menu");

        int input = sc.nextInt();
        switch (input){
            case 1:
                addFlight();
                break;

            case 2 :
               // checkStatus();
                break;

            case 3 :
               // displayAllFlights();
                break;

            case 4:
               // cancelFlight();

        }

    }

    private static void addFlight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Destination");
        String destination = sc.nextLine();
        int flightID= random();
        Flight flight = new Flight(destination,flightID);
        System.out.println();






        // when user inputs the flight number make sure it is added to the list of array for flights


    }


}




