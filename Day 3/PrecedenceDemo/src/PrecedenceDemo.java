
public class PrecedenceDemo {

	public static void main(String[] args) {
		int result1=10+5*2-3;
		System.out.println("Expression 1: 10 + 5 * 2 - 3 = "+result1);
		boolean result2 = (15 > 10) && (8 < 12) || (6 == 7);
		System.out.println("Expression 2: (15 > 10) && (8 < 12) || (6 == 7) = "+result2);
		double result3 = 20 / 4 + 3.0 * 2 - 1;
		System.out.println("Expression 3:  20 / 4 + 3.0 * 2 - 1 = "+result3);
		int result4 = 10 % 3 + 4 * 2 - 1;
		
		System.out.println("Expression 4: 10 % 3 + 4 * 2 - 1 = "+result4);
		int a = 5; int b = 3; 
		int result5 = a++ * 2 + --b;
		System.out.println("Expression 5: a++ * 2 + --b = "+result5);
		
		boolean result6 = !(5 < 3) && (10 >= 10);
		System.out.println("Expression 6:!(5 < 3) && (10 >= 10) = "+result6);
		
	}

}









//
//Expressions to Evaluate:**
//
//* **Expression 1:** `int result1 = 10 + 5 * 2 - 3;`
//* **Expression 2:** ``
//* **Expression 3:** `double result3 = 20 / 4 + 3.0 * 2 - 1;`
//* **Expression 4:** `;`
//* **Expression 5:** `` (Pay attention to pre/post increment/decrement)
//* **Expression 6:** ``
//
//**Example Output Format:**
//
//Expression 1: 10 + 5 * 2 - 3 = [Calculated Value]
//Expression 2: (15 > 10) && (8 < 12) || (6 == 7) = [Calculated Value]