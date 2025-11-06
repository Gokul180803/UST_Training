package LocalInstance;
class Vehicle{
	static int totalVehiclesCreated=0;
	String brand;
	int year;
	Vehicle(String brand, int year){
		this.brand=brand;
		this.year=year;
		totalVehiclesCreated++;
		
		
		
	}
	public void displayVehicleDetails() {
		 String message = "--- Vehicle Information ---";
	        System.out.println(message);
	        System.out.println("Brand: " + brand);
	        System.out.println("Year: " + year);
	}
	
	public void changeBrand(String newBrand) {
		this.brand=newBrand;
		
	}
}
public class LocalInstance {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle("TATA",2021);
		Vehicle v2=new Vehicle("FORD",2021);
		Vehicle v3=new Vehicle("BYD",2021);
		v1.displayVehicleDetails();
		v2.displayVehicleDetails();
		v3.displayVehicleDetails();
	System.out.println("After Changing the Brand");
		v2.changeBrand("HONDA");
		v2.displayVehicleDetails();
		System.out.println("TotalVehiclesCreated : "+Vehicle.totalVehiclesCreated);
		
	}
	

}
