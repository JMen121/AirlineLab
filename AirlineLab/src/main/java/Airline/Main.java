package Airline;

import Airline.Flight;
import Airline.Passenger;
import Airline.ManagingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   private ArrayList<Flight>flights = new ArrayList<>();
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private ArrayList<Flight> flightList = new ArrayList<>();
   private  ArrayList<Passenger> bookedList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to BAFA Airline, the no.1 Airline for comfort!");
        System.out.println("What is your name?");

        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine(); // This allows the computer to read the next line of the user
        System.out.println("Welcome " + username);

        System.out.println("Where would you like to explore today " + username + "?");


        System.out.println(" 1. Add Your Existing FLight");
        System.out.println(" 2. ");
        System.out.println(" 3. Book a Flight");
        System.out.println(" 4. Book a Flight");
        System.out.println(" 5. Book a Flight");
        System.out.println("Menu");





    }



















}



