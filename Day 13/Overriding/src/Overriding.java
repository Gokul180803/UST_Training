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
public class Overriding {

	public static void main(String[] args) {
	
		
		

	}

}
