class Vehicle{
	protected  String make;
	protected String model;
	protected  int year;
	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	} 
	public void displayInfo() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year :"+year);
	}
	public void startEngine() {
		System.out.println("The vehicle's engine starts.");
	}
}
class Car extends Vehicle{
	private int numberOfDoors;
	Car(String make, String model, int year,int numberOfDoors){
	super(make,model,year);
	this.numberOfDoors=numberOfDoors;
		
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Number of Door: "+numberOfDoors);

	}
	public void honk() {
		System.out.println("The car honks!");
	}
}
class Motorcycle extends Vehicle{
	private boolean hasSidecar;

	public Motorcycle(String make, String model, int year, boolean hasSidecar) {
		super(make, model, year);
		this.hasSidecar = hasSidecar;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("hasSidecar: "+hasSidecar);
	}
	public void wheelie() {
		System.out.println("The motorcycle performs a wheelie!");
	}
}
public class InheritanceHierarchies {
public static void main(String[] args) {
	Car car = new Car("Toyota", "Camry", 2022, 4);
    Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2021, false);

    System.out.println("Car Info:");
    car.displayInfo();
    car.startEngine();
    car.honk();

    System.out.println("\nMotorcycle Info:");
    motorcycle.displayInfo();
    motorcycle.startEngine();
    motorcycle.wheelie();
	
}
}
