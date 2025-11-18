import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Product{
	private int id;
	private String  name;
	private double price;
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Price: " + price ;
	}
	
	
}
public class HashMaps {

	public static void main(String[] args) {
            HashMap<Integer ,Product> productCatalog=new HashMap<>();
            productCatalog.put(101, new Product(101, "Laptop", 75000.00));
            productCatalog.put(102, new Product(102, "Smartphone", 25000.00));
            productCatalog.put(103, new Product(103, "Headphones", 3000.00));
            
            
            
            System.out.println("Retrieve product with ID 101:");
            System.out.println(productCatalog.get(101));
            int existingId = 101;
            int nonExistingId = 200;
            System.out.println("\nDoes product ID " + existingId + " exist? " + productCatalog.containsKey(existingId));
            System.out.println("Does product ID " + nonExistingId + " exist? " + productCatalog.containsKey(nonExistingId));

            // Step 5: Remove one product using its ID
            System.out.println("\nRemoving product with ID 103...");
            productCatalog.remove(103);

            // Step 6: Iterate through productCatalog and print all remaining products
            System.out.println("\nRemaining products in catalog:");
            for (Map.Entry<Integer, Product> entry : productCatalog.entrySet()) {
                System.out.println(entry.getValue());
            }
            
            
            
            
           TreeMap<Integer,Integer> inventoryLevels=new TreeMap<>();
           
           inventoryLevels.put(101,30);
           inventoryLevels.put(102,60);
           inventoryLevels.put(103,80);

           
           
           //updating exiting one
           inventoryLevels.put(102,70);

           
           System.out.println(inventoryLevels.get(103));

           for(Map.Entry<Integer, Integer> K:inventoryLevels.entrySet()) {
        	   System.out.printf(" Product: %d  Quality: %d\n", K.getKey(),K.getValue());
           }
           
           System.out.println("\nLowest Product ID: " + inventoryLevels.firstKey());
           System.out.println("Highest Product ID: " + inventoryLevels.lastKey());
           
           
           
           
           
	}

}
