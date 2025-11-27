import java.util.ArrayList;
import java.util.List;

class ShoppingCart{
	private List<String> items;
	private double totalPrice;
	public ShoppingCart() {
		items = new ArrayList<>();
        totalPrice = 0.0;	
        }
	public void addItem(String itemName, double price) {
		items.add(itemName);
		totalPrice+=price;
	}
	public void removeItem(String itemName, double price) {
		if(items.contains(itemName)) {
			items.remove(itemName);
			totalPrice-=price;
		}
	}
	public int getItemCount() {
		return this.items.size();
		
	}
	public double getTotalPrice() {
		return this.totalPrice;
	}
	
	
	
	
}
public class LifecycleAnnotations {

	public static void main(String[] args) {

	}

}
