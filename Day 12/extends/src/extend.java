 class Vehicle{
	 private String brand;
	public  Vehicle(String brand){
		 this.brand=brand;
	 }
	 public void start() {
		 System.out.println("The vehicle starts.");
	 }
	 public String getBrand() {
		 return brand;
	 }
 }
 class  Car extends Vehicle {
	 private String model;
	 Car(String brand,String model){
		 super(brand);
		this.model = model;
 }
	 public void start() {
		 System.out.println("The "+getBrand()+ " "+model+" car starts with a roar!");
	 }
	 public void drive() {
		 System.out.println("The "+getBrand()+" "+ model+" car is driving.");

 }
 }
	 public class extend{
	public static void main(String[] args) {
		Vehicle myBike = new Vehicle("Bicycle Brand");
		myBike.start();
		Car myCar = new Car("Toyota", "Camry");
		myCar.start();
		myCar.drive();

	}

}
