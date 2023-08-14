package Day3;

 

import java.util.Scanner;

 

public class SumOfDigits {

 

    public static void main(String[] args) {

        

                Scanner scanner = new Scanner(System.in);

 

                System.out.print("Enter a number: ");

                long number = scanner.nextLong();

 

                long originalNumber = number;

                long sum = 0;

 

                while (number != 0) {

                    long digit = number % 10;

                    sum += digit;

                    number /= 10;

                }

 

                System.out.println("The sum of digits of " + originalNumber + " is: " + sum);

                scanner.close();

            }

        

 

 

    }

 

 