package Day3;

import java.util.Scanner;

public class EvenNumBetweenXAndY {

 

    public static void main(String[] args) {

 

                Scanner sc = new Scanner(System.in);

 

                System.out.print("Enter the value of x: ");

                int x = sc.nextInt();

 

                System.out.print("Enter the value of y: ");

                int y = sc.nextInt();

 

                if (x > y) {

                    System.err.println("ERROR: Invalid Input:: second number should be greater than first number");

                    sc.close();

                    return;

                }

 

                System.out.print("Even numbers between " + x + " and " + y + ": ");

                for (int num = x; num <= y; num++) {

                    if (num % 2 == 0) {

                        System.out.print(num + " ");

                    }

                }

 

                System.out.println(); // To move to the next line after displaying the numbers.

                sc.close();

            }

        

 

    }