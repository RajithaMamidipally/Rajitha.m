package Day2;

import java.util.Scanner;

public class TaskOnReadData {

	public static void main(String[] args) {
		int pizzaUnitPrice = 100;
		int puffUnitPrice = 20;
		int collDrinkUnitPrice = 10;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no of pizzas bought: ");
		int noP = sc.nextInt();
		System.out.print("enter the no of puffs bought: ");
		int noPf = sc.nextInt();
		System.out.print("enter the no of cool drinks bought: ");
		int noD = sc.nextInt();
		sc.close();		
		int pizza = noP * pizzaUnitPrice;
		int puff = noPf * puffUnitPrice ;
		int coolDrink = noD * collDrinkUnitPrice;
	    float totalPrice = pizza + puff + coolDrink ;
		
		System.out.println();
		
		System.out.println(" \t Bill Details\n");
		System.out.printf("No of Pizzas     : %d \t cost: %d \n" , noP , pizza);
		System.out.printf("No of Puffs      : %d \t cost: %d \n", noPf , puff);
		System.out.printf("No of cool drinks: %d \t cost: %d \n" , noD, coolDrink);
		System.out.println();
		
		System.out.printf("Total price = %.2f\n " , totalPrice);
		System.out.println("ENJOY THE SHOW!!!");
		
	}
}

