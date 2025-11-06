class CircleCalculator{
	static final double PI=3.14159;
	public double calculateArea(double radius) {
		return PI*radius*radius;
		
	}
	public double calculateCircumference(double radius) {
		return 2*PI*radius;
	}
}
public class FinalClass {
	public static void main(String[]args) {
		CircleCalculator c=new CircleCalculator();
		
		System.out.println("Area of circle with radius : "+c.calculateArea(5.0));
		System.out.println("Circumference of circle with radius : "+c.calculateCircumference(5.0));

	}

}
