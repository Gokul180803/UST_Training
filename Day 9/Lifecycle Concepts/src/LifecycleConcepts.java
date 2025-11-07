class Product{
	private String productID;
	private String name;
	private double price;
	Product(String productID,String name,	double price){
		this.productID=productID;
		this.name=name;
		this.price=price;
		System.out.println("Product "+name+" (ID: ["+productID+"]) has been created.");
	}
	public void displayProductDetails() {
		System.out.println("ProductID : "+productID);
		System.out.println("ProductName : "+name);
		System.out.println("ProductPrice : "+price);
	}
	
}
public class LifecycleConcepts {

	public static void main(String[] args) {
		Product laptop = new Product("P101", "Laptop", 1200.00);
		laptop.displayProductDetails();
		System.out.println("-------------------------------------------");
		Product mouse = new Product("P102", "Wireless Mouse", 25.50);
		mouse.displayProductDetails();
		System.out.println("-------------------------------------------");
		Product keyboard = new Product("P103", "Mechanical Keyboard", 80.00);
		keyboard.displayProductDetails();
		laptop=null;
		System.out.println("Laptop reference set to null." );
		System.out.println("-------------------------------------------");

		try {
            laptop.displayProductDetails(); 
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to use a null reference.");
        }
	}

}
