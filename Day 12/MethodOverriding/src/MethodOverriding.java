abstract class Shape{
	abstract double calculateArea(); 
	public void displayMessage()
	{
		System.out.println("This is a generic shape.");
	}
}
class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	public double calculateArea() {
		return (Math.PI*radius*radius);
	}
	
}
class Rectangle extends Shape{
	private Double width;
	private Double height;
	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}
	public double calculateArea() {
		return (width*height);
	}

}
public class MethodOverriding {

	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Display messages
        circle.displayMessage();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.displayMessage();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
	}

}
