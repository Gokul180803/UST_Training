class Printer{
	public static void print(int value) {
		System.out.println("Printing int: "+value);
	}
	public static void print(double value) {
		System.out.println("Printing double: "+value);
	}
	public static void print(String value) {
		System.out.println("Printing String: "+value);
}
	public static void print(boolean value) {
		System.out.println("Printing boolean: "+value);
}
}
class Calculator{
	public static int add(int a, int b) {
		return a+b;
	}
	public static double add(double a, double b) {
		return a+b;
	}
	public static double add(int a, double b) {
		return a+b;
}
}
public class MethodOver {
	
	public static void main(String[] args) {
		
		Printer myPrinter = new Printer();
		myPrinter.print(10);
		myPrinter.print(3.14);
		myPrinter.print("Hello Overloading!");
		myPrinter.print(true);
		
		Calculator myCalculator = new Calculator();
		System.out.println("Sum of ints: " + myCalculator.add(5, 7));
		System.out.println("Sum of doubles: " + myCalculator.add(10.5, 20.3));
		System.out.println("Sum of int and double: " + myCalculator.add(10, 5.5));
	}
}
