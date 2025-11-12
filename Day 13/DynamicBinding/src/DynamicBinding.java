import java.util.*; 
class Vehicle{
	
	public void startEngine()
	{
		System.out.println("Vehicle engine starting...");
	}
	
}
 class Car extends Vehicle{
	
	public void startEngine()
	{
		System.out.println("Car engine starting with key ignition.");
	}
	
}
 class Motorcycle extends Vehicle{
		
		public void startEngine()
		{
			System.out.println("Motorcycle engine starting with kick-start.");
		}
		
	}
 
public class DynamicBinding {

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		  vehicles.add(new Vehicle());
	        vehicles.add(new Car());
	        vehicles.add(new Motorcycle());
	        for (Vehicle v : vehicles) {
	            v.startEngine();
	        }

	}

}
