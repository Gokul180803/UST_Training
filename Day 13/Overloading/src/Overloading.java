class AreaCalculator{
	public  double calculateArea(double side) {
		return side*side;
	}
	public double calculateArea(double length, double width) {
		return length*width;
	}
	public double calculateArea(double radius, boolean isCircle) {
		if(isCircle) {
			return Math.PI*radius*radius;
		}
		return 0.0;
	}
}
public class Overloading {

	public static void main(String[] args) {

	}

}
