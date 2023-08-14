

package Day3;

 

import java.util.Scanner;

 

public class MovieTicketCalculation {

 

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

 

                System.out.print("Enter the no of ticket: ");

                int numberOfTickets = sc.nextInt();

 

                if (numberOfTickets < 5 || numberOfTickets > 40) {

                    System.err.println("Minimum of 5 and Maximum of 40 Tickets");

                   sc.close();

                    return;

                }

 

                System.out.print("Do you want refreshment (Y/N): ");

                char refreshmentChoice = sc.next().charAt(0);

 

                System.out.print("Do you have coupon code (Y/N): ");

                char couponChoice = sc.next().charAt(0);

 

                System.out.print("Enter the circle (K/Q): ");

                char circleChoice = sc.next().charAt(0);

 

                sc.close();

 

                float kingClassCost = 75.0f;

                float queenClassCost = 150.0f;

                float refreshmentCost = 50.0f;

 

                float totalCost = 0.0f ;

 

                if (circleChoice == 'K') {

                    totalCost = numberOfTickets * kingClassCost;

                } else if (circleChoice == 'Q') {

                    totalCost = numberOfTickets * queenClassCost;

                } else {

                    System.err.println("Invalid Input");

                    return;

                }

 

                if (refreshmentChoice == 'Y') {

                    totalCost += numberOfTickets * refreshmentCost;

                }

 

                if (couponChoice == 'Y') {

                    totalCost -= totalCost * 2/100; // Applying 2% discount

                }

 

                if (numberOfTickets > 20) {

                    totalCost -= totalCost * 10/100; // Applying 10% discount for bulk booking

                }

                System.out.println();

                System.out.printf("Total Cost: %.2f\n", totalCost);

            }

        

 

    }

 

 

 
