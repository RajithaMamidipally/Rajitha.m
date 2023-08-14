package Day3;

 

public class ElementsOfFollowinSequence {

        public static void main(String[] args) {

            int startingNumber = 1;

            int commonDifference = 3;

            int numberOfElements = 15;

 

            System.out.println("The first 15 elements of the sequence:");

 

            for (int i = 0; i < numberOfElements; i++) {

                int num = startingNumber + i * commonDifference;

                System.out.print(num + " ");

            }

        }

    }