// Solution for Learner Hands-on Task: Creating POJOs
class Product {
   private  String productId;
    private String Name;
 
  private  double price;
    private int quantityInStock;

    public Product() {
        this.productId = "N/A";
        this.Name = "Unknown";
        this.price = 0.0;
        this.quantityInStock = 0;
    }

    public Product(String productId, String Name, double price, int quantityInStock) {
        this.productId = productId;
        this.Name = Name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "ProductId=" + productId + ", Name=" + Name + ", price=" + price + ", quantityInStock=" + quantityInStock ;
    }
}
public class POJO{
	public static void main(String[]args) {
		 Product defaultProduct = new Product();  // starts with default values
	        defaultProduct.setName("Smartphone");
	        defaultProduct.setPrice(25000.0);
	        defaultProduct.setQuantityInStock(50);

	        // 2. Product using parameterized constructor
	       Product laptop = new Product("P001", "Laptop", 75000.0, 10);

	        // 3. Print details using toString()
	        System.out.println(defaultProduct);
	        System.out.println(laptop);
	}
}