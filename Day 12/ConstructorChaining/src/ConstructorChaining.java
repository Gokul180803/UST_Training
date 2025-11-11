class Vehicle{
	private  String make;
	private String model;
	private  int year;
	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayVehicleInfo() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year :"+year);

	}
}
class Car extends Vehicle{
	private int numberOfDoors;
	Car(String make, String model, int year,int numberOfDoors){
	super(make,model,year);
	this.numberOfDoors=numberOfDoors;
		
	}
	public void displayVehicleInfo() {
super.displayVehicleInfo();
System.out.println("Number of Door: "+numberOfDoors);

	}
}
class ElectricCar extends Car{
	private int batteryCapacityKWh;

	public ElectricCar(String make, String model, int year, int numberOfDoors, int batteryCapacityKWh) {
		super(make, model, year, numberOfDoors);
		this.batteryCapacityKWh = batteryCapacityKWh;
	}
	public void displayVehicleInfo() {
		super.displayVehicleInfo();
		System.out.println("BatteryCapacity: "+batteryCapacityKWh);

			}
	
}
public class ConstructorChaining {

	public static void main(String[] args) {
	Vehicle V=new Vehicle("india","land rover",2025);
	V.displayVehicleInfo();
	Car C=new Car("italy","porche",2025, 3);
	C.displayVehicleInfo();
	ElectricCar E=new ElectricCar("india","kia",2022,5,50);
	E.displayVehicleInfo();

	}

}
