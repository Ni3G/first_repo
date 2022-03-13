package com.company;

import java.util.Scanner;

public class BookingAndConfirmation<business> {



        public int confirmation() {
            Scanner input = new Scanner(System.in);
            System.out.println("Press 1 for confirmation\nPress 2 to cancellation");
            int num = input.nextInt();
            return num;
        }
        public void booking() {
            int economy = 1, business = 1;
            Scanner input1 = new Scanner(System.in);
            while (economy <= 10 || business <= 5) {
                System.out.println("1 for Economy class\n2 for Business class\n3 to Exit");
                int num1 = input1.nextInt();

                //for Economy Class
            int num = input1.nextInt();
                if (num == 1 && economy <= 10) {
                    int decision = confirmation();
                    //conforming
                    if (decision == 1) {
                        System.out.println("You are assigned to Economy class with seat number " + economy++);
                    } else if (decision == 2) {
                        System.out.println("Your request has been cancelled");
                    }

                }

                //for business class
                else if (num == 2 && business <= 5) {
                    int decision = confirmation();
                    //Conforming booking
                    if (decision == 1) {
                        System.out.println("You are assigned to Business class with seat number " + business++);
                    } else if (decision == 2) {
                        System.out.println("Your request has been cancelled");
                    }

                }

                //if economy class is full and customer want ticket
                else if (num == 1 && economy > 10) {
                    System.out.println("Sorry,Economy class is full");
                    if (business < 5) {
                        System.out.println("There is a ticket available in Business class...\nDo you want to buy that?");
                        int result = confirmation();
                        //conforming booking
                        if (result == 1) {
                            System.out.println("You are assigned to Business class with seat number " + business++);
                        }
                    }
                }

                //if business class is full and customer wants ticket
                else if (num == 2 && business > 5) {
                    System.out.println("Sorry,Business clas is full");
                    if (economy < 10) {
                        System.out.println("There is a ticket available in Economy class...\nDo you want to buy that?");
                        int result = confirmation();
                        //conforming booking
                        if (result == 1) {
                            System.out.println("You are assigned to Economy class with seat number " + economy++);
                        }
                    }
                }
                else if( num== 3){
                    System.out.println("Thank You");
                    break;
                }
                System.out.println("Do you want to Book another ticket? ");
                int result = confirmation();
                if (result == 2) {
                    System.out.println("Thank You");
                    break;
                }
            }
        }
    }

