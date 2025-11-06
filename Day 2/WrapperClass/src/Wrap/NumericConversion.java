package Wrap;

public class NumericConversion {

	public static void main(String[] args) {
		String num="12345";
		int a=Integer.parseInt(num);
		System.out.println("Parse int from String "+a);
		String dou="98.76";
		double b=Double.valueOf(dou);
		System.out.println("Parse Double from String "+b);
	}

}
