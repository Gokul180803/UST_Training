import java.util.*;
abstract class Vehicle{
	protected String name;

	 Vehicle(String name) {
		this.name = name;
	}
	 public String getName() {
		 return name;
	 }
	 public abstract void move();
	
}
class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The " + getName() + " is driving on the road.");
    }
}
class Bicycle extends Vehicle {
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The " + getName() + " is pedaling on the path.");
    }
}
class Airplane extends Vehicle {
    public Airplane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The " + getName() + " is flying in the sky.");
    }
}


public class PolymorphicSystems {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Honda Civic"));
        vehicles.add(new Bicycle("Mountain Bike"));
        vehicles.add(new Airplane("Boeing 747"));

        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}

