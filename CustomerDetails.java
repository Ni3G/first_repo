package com.company;
import java.util.*;
public class CustomerDetails {
    public String passengerName,passengerEmail,passengerMobile,passengerStreet,passengerCity,passengerState;
    public void getPassengerDetails(){   //Taking Details of passenger

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Passenger Details...");

        System.out.print("Passenger's Full Name: ");
        passengerName = input.nextLine();

        System.out.print("Enter Email: ");
        passengerEmail = input.nextLine();

        System.out.print("Enter Mobile: ");
        passengerMobile = input.nextLine();

        System.out.print("Enter Street: ");
        passengerStreet = input.nextLine();

        System.out.print("Enter City: ");
        passengerCity = input.nextLine();

        System.out.print("Enter State : ");
        passengerState = input.nextLine();


    }
}
