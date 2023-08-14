package Day4;
import java.util.Scanner;
public class LeastOffer {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of items: ");
	        int n = scanner.nextInt();

	        String[] itemDetails = new String[n];
	        scanner.nextLine(); // Consume the newline character left by nextInt()

	        System.out.println("Enter the item name, price, and discount percentage separated by comma(,): ");
	        for (int i = 0; i < n; i++) {
	            itemDetails[i] = scanner.nextLine();
	        }

	        String[] itemsWithMinDiscount = findItemsWithMinDiscount(itemDetails);
	        System.out.println("Items with Minimum Discount: " + String.join(", ", itemsWithMinDiscount));

	        scanner.close();
	    }

	    public static String[] findItemsWithMinDiscount(String[] itemDetails) {
	        int minDiscount = Integer.MAX_VALUE;
	        String[] itemsWithMinDiscount = new String[itemDetails.length];
	        int itemCount = 0;

	        for (String item : itemDetails) {
	            String[] details = item.split(",");
	            String itemName = details[0].trim();
	            int price = Integer.parseInt(details[1].trim());
	            int discountPercentage = Integer.parseInt(details[2].trim());

	            int discount = (price * discountPercentage) / 100;

	            if (discount < minDiscount) {
	                minDiscount = discount;
	                itemCount = 0;
	                itemsWithMinDiscount[itemCount++] = itemName;
	            } else if (discount == minDiscount) {
	                itemsWithMinDiscount[itemCount++] = itemName;
	            }
	        }

	        
	        String[] result = new String[itemCount];
	        System.arraycopy(itemsWithMinDiscount, 0, result, 0, itemCount);
	        return result;
	    }
	}



