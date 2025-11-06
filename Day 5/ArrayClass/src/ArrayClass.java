
import java.util.Arrays;
public class ArrayClass {

	public static void main(String[] args) {

    
		        double[] productPrices = {12.99, 5.50, 89.95, 3.25, 50.00, 12.99, 7.75};

		       		        Arrays.sort(productPrices);
		        System.out.println("Sorted Product Prices: " + Arrays.toString(productPrices));

		       
		        double targetPrice = 50.00;
		        int index = Arrays.binarySearch(productPrices, targetPrice);
		        if (index >= 0) {
		            System.out.println("Price " + targetPrice + " found at index: " + index);
		        } else {
		            System.out.println("Price " + targetPrice + " not found in the array.");
		        }

		     
		        double[] promotionalPrices = Arrays.copyOf(productPrices, productPrices.length);
		        promotionalPrices[0] = 9.99;
		        boolean areEqual = Arrays.equals(productPrices, promotionalPrices);
		        System.out.println("Are productPrices and promotionalPrices equal after modification? " + areEqual);
		        promotionalPrices = Arrays.copyOf(productPrices, productPrices.length);
		        areEqual = Arrays.equals(productPrices, promotionalPrices);
		        System.out.println("Are productPrices and promotionalPrices equal after reset? " + areEqual);
		    }
		}
