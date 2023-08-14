

package Day3;

 

import java.util.Scanner;

 

public class FirstNOddNumbers {

 

     public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

 

            System.out.print("Enter how many odd numbers to be generated: ");

            int n = sc.nextInt();

 

//            if (n <= 0) {

//                System.out.println("Please enter a positive number greater than zero.");

//               

//                return;

//     }

 

            int num = 0;

            int i = 1 ;

            while (num < n) {

                if (i % 2 != 0) {

                    System.out.print(i + " ");

                    num++;

                }

                i++;

            }

 

            System.out.println(); // To move to the next line after displaying the numbers.

            sc.close();

        }

 

}

 