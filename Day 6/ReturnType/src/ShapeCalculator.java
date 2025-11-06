
public class ShapeCalculator {
 
	public static int calculateRectangleArea(int length, int width) {
		int Area=length*width;
		return Area;
	}
	public static double calculateCircleCircumference(double radius) {
		 double Circumference=2*Math.PI*radius;
		 return Circumference;
	}
	public static String getShapeName(int numberOfSides) {
		if(numberOfSides==3) {
			return "Triangle";
		}else if(numberOfSides==4) {
			return "Quadrilateral";
		}else {
			return "Unknown Shape";
		}
	}
	public static boolean isEven(int number) {
		if(number%2==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(calculateRectangleArea(3,6));
		System.out.println(calculateCircleCircumference(7.2));
		System.out.println(getShapeName(4));
		System.out.println(isEven(15));
	
	}

}
