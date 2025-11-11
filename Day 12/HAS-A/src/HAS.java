class Vehicle{
	protected int speed;
	public void  accelerate() {
		System.out.println("Vehicle is accelerating!");
	}
}
class Car extends Vehicle {
    private int numDoors;
    private Engine engine; // HAS-A Engine

    public Car(int speed, int numDoors, Engine engine) {
        this.speed = speed;
        this.numDoors = numDoors;
        this.engine = engine;
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating with speed " + speed + "!");
    }

    public void startCar() {
        engine.start();
    }
}
class Engine {
 private int horsepower;

 public Engine(int horsepower) {
     this.horsepower = horsepower;
 }

 public void start() {
     System.out.println("Engine with " + horsepower + " HP started!");
 }
}
public class HAS {
 public static void main(String[] args) {
     Engine engine = new Engine(200); // Create Engine
     Car car = new Car(120, 4, engine); // Create Car with Engine

     car.accelerate(); 
     car.startCar();    
 }
}
