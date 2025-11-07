class Product{
	private String productId;
	private String productName;
	private double price;
	private boolean inStock;
	Product(){
		this.productId="N/A";
		this.productName= "Unknown Product";
		this.price=0.0;
		this.inStock=false;
	}
	Product(String productId,String productName,double price,boolean inStock){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.inStock=inStock;
	}
	Product(String productId,String productName,double price){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		inStock=true;
		
	}
	public void displayProductDetails()
	{
		System.out.println("productId :"+productId);
		System.out.println("productName :"+productName);
		System.out.println("price :"+price);
		System.out.println("inStock :"+inStock);
	}
}
public class Constructors {

	public static void main(String[] args) {
		System.out.println("----------- No-Argument Constructor -----------");
        Product p=new Product();
        p.displayProductDetails();
		System.out.println("----------- Full Parameterized Constructor -----------");
        Product p1=new Product("1234","nithin",3.97656,true);
        p1.displayProductDetails();

		System.out.println("----------- Basic Parameterized Constructor -----------");
		Product p2=new Product("5678","Gokul",6543.9);
        p2.displayProductDetails();


        
	}

}
