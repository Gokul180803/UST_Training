import java.util.*;
class Shape{
	public void draw() {
		System.out.println("Drawing a generic shape.");
	}
	public double getArea() {
		return 0.0;
	}
}
class Circle extends Shape{
	private double radius;

	 Circle(double radius) {
		 this.radius=radius;
		 
	}
	 public void draw() {
		 System.out.println( "Drawing a Circle with radius :"+radius+".");
	 }
	 public double getArea() {
			return Math.PI*radius*radius;
		}
	}
class Rectangle extends Shape{
	private double width;
	private double length;

	 Rectangle(double width,double length) {
		 this.width=width;
		 this.length=length;
		 
	}
	 public void draw() {
		 System.out.println( "Drawing a Rectangle with length ["+length+"] and width ["+width+"].");
	 }
	 public double getArea() {
			return length*width;
		}
	}
 class AreaCalculator {
    double getArea(double side) {
        return side * side; // Square
    }

    double getArea(double length, double width) {
        return length * width; // Rectangle
    }

    double getArea(float radius) {
        return Math.PI * radius * radius; // Circle
    }
}
public class Overloading1 {

	public static void main(String[] args) {
		AreaCalculator calc= new AreaCalculator();
		 System.out.println("Area of Square: " + calc.getArea(5.765));
	        System.out.println("Area of Rectangle: " + calc.getArea(5, 10));
	        System.out.println("Area of Circle: " + calc.getArea(3.5f));

	        System.out.println("\n--- Demonstrating Overriding ---");

	        ArrayList<Shape> shapes = new ArrayList<>();
	        // Add Circle and Rectangle instances
	        shapes.add(new Circle(3.0));
	        shapes.add(new Rectangle(4.0, 5.0));

	        // Iterate and call overridden methods
	        for (Shape shape : shapes) {
	            shape.draw();
	            System.out.println("Area: " + shape.getArea());
	            System.out.println();
		
		

	}

}
}
