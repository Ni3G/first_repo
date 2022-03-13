package com.company;

import java.util.Scanner;

public class Ticket extends ConfirmationOfTicket {

    Scanner input1 = new Scanner(System.in);
    public int chooseTicket(){
        System.out.println("Choose Ticket type\n1-Tourist Ticket\n2-Regular Ticket");

        int choice = input1.nextInt();
        int decision = 0;
        if(choice == 1) {
            decision = 1;
        }
        else if(choice == 2) {
            decision = 2;
        }
        return decision;
    }
    //For Tourist Details
    public void touristTicketDetails(){
        System.out.println("Enter the Hotel Name: ");
        String hotelName = input1.next();
    }
    //for regular ticket
    public void regularTicketDetails(){
        System.out.println("Do you want meal in flight\n1-for Yes\n2-for No: ");
        int meal = input1.nextInt();

    }
}
