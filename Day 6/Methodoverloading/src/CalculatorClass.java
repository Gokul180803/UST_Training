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
public class CalculatorClass {

	public static void main(String[] args) {
		
		System.out.println(Calculator.add(1,2));
		System.out.println(Calculator.add(1432.44,223.433));
		System.out.println(Calculator.add(1,22.343));
	}

}
