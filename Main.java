package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Ticket {
    public static void main(String[] args) {
      double price;
        Scanner input = new Scanner(System.in);
        CustomerDetails customerDetails = new CustomerDetails();
        ConfirmationOfTicket confirmationOfTicket = new ConfirmationOfTicket();


        ArrayList<String> flightList = new ArrayList<>();
        ArrayList<String> flightDateList = new ArrayList<>();
        ArrayList<String> flightDeparArriTime = new ArrayList<>();
        ArrayList<String> flightFares = new ArrayList<>();

        // adding Flights and timing in the arraylist
        flightList.add("\n 1-Mumbai-to-Delhi" + " Departure - 14.00 PM"+" 01-01-2022\n");
        flightList.add("2-Mumbai-to-Jaipur" + " Departure - 15.00 PM"+" 01-01-2022\n");
        flightList.add("3-Jaipur-to-Chennai" + " Departure -  16.30 PM"+" 01-01-2022\n");
        flightList.add("4-Jaipur-to-kolkata" + " Departure - 12.00 PM"+" 01-01-2022\n");
        flightList.add("5-Jaipur-to-Chennai" + " Departure- 12.00 AM"+" 01-01-2022\n");
        flightList.add("6-Kolkata-to-Chennai" + " Departure - 11.00 PM"+" 01-01-2022\n");
        flightList.add("7-Jaipur-to-Ranchi" + " Departure - 14.00 PM"+" 01-01-2022\n");
        flightList.add("8-Jaipur-to-Ranchi" + " Departure - 17.00 PM"+" 01-01-2022\n");
        flightList.add("9-Punjab-to-Haryana" + " Departure - 05.00 AM"+" 01-01-2022\n");
        flightList.add("10-Bangalore-to-Ooty" + " Departure - 13.45 PM"+" 01-01-2022\n");

        // adding dates of the flights in the list flightDateList
        flightDateList.add("01-01-2022");
        flightDateList.add("04-01-2022");
        flightDateList.add("11-01-2022");
        flightDateList.add("13-01-2022");
        flightDateList.add("13-01-2022");
        flightDateList.add("14-01-2022");
        flightDateList.add("18-01-2022");
        flightDateList.add("26-01-2022");
        flightDateList.add("29-01-2022");

        // adding arrival and departure time of flights in list
        flightDeparArriTime.add("Arrival- 11:00 AM, Departure- 14:00 PM\n");
        flightDeparArriTime.add("Arrival- 12:00 AM, Departure- 15:00 PM\n ");
        flightDeparArriTime.add("Arrival- 13:00 PM, Departure- 16:30 PM\n");
        flightDeparArriTime.add("Arrival- 14:00 PM, Departure- 12:00 PM\n");
        flightDeparArriTime.add("Arrival- 15:00 PM, Departure- 12:00 AM\n");
        flightDeparArriTime.add("Arrival- 07:35 AM, Departure- 11:00 PM\n");
        flightDeparArriTime.add("Arrival- 08:20 AM, Departure- 14:00 PM\n");
        flightDeparArriTime.add("Arrival- 11:00 AM, Departure- 17:00 PM\n");
        flightDeparArriTime.add("Arrival- 11:50 PM, Departure- 05:00 AM\n");
        flightDeparArriTime.add("Arrival- 17:08 AM, Departure- 13.45 PM\n");

        //adding flight fares to list
        flightFares.add("12342.75 Rs");
        flightFares.add("52342.75 Rs");
        flightFares.add("12929.75 Rs");
        flightFares.add("14428.75 Rs");
        flightFares.add("22342.75 Rs");
        flightFares.add("19342.75 Rs");
        flightFares.add("12342.75 Rs");
        flightFares.add("12442.75 Rs");
        flightFares.add("12342.75 Rs");
        flightFares.add("10000.00 Rs");

        while (confirmationOfTicket.economy <= 10 && confirmationOfTicket.business <= 5) {
            customerDetails.getPassengerDetails();   //passenger details taken...


            System.out.println("Available Flights for This Month.." + flightList + flightDateList);
            int enterFlightNumber = input.nextInt();


            if (enterFlightNumber <= 10 && enterFlightNumber >= 1) {
                System.out.println("You have chosen this Flight " + flightList.get(enterFlightNumber - 1));
            } else {
                System.out.println("This flight is not available\nPlease select According to the Available Flights Numbers...");
            }


                //calling method from Ticket
            Ticket ticket = new Ticket();
            int makingChoice = ticket.chooseTicket();   //checking ticket type
            if (makingChoice == 1) {
                ticket.touristTicketDetails();
            } else if (makingChoice == 2) {
                ticket.regularTicketDetails();
            } else {
                System.out.println("Inappropriate input");
                System.exit(0);
            }


            confirmationOfTicket.confirmationTicket(); //confirming ticket status
            System.out.println("Do you want to book another ticket\npress 1- for yes\npress 2- for No");

            //printing ticket
            System.out.println("             Your Ticket           \n"+customerDetails.passengerName+"\n"+customerDetails.passengerEmail+"\n"+customerDetails.passengerMobile+"\n"+customerDetails.passengerStreet+"\n"+customerDetails.passengerCity+"\n"+customerDetails.passengerState);
            System.out.println("Flight Name = "+ flightList.get(enterFlightNumber)+flightDateList.get(enterFlightNumber));
            System.out.println(flightDeparArriTime.get(enterFlightNumber));
            System.out.println("Price =" + flightFares.get(enterFlightNumber) );

            //asking whether they want to book another ticket
            System.out.println("Do you want to book another Ticket?\npress 1-for yes\npress 2-for No");
            int choice = input.nextInt();
            if(choice != 1){
                System.out.println("Thank You!!!");
                break;
            }

        }
    }
}
