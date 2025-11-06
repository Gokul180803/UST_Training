
public class RecursiveMethods {
	public static long factorial(int n) {
		 if (n < 0) {
	            throw new IllegalArgumentException("Factorial is undefined for negative numbers: " + n);
	        }
		if(n==0||n==1) {
			return 1;
		}else {
		return	n*factorial(n-1);
		}
	}
	public static long fibonacci(int n1) {
		 if (n1 < 0) {
	            throw new IllegalArgumentException("Fibonnacci is undefined for negative numbers: " + n1);
	        }
		if(n1==0) {
			return 0;
		}else if(n1==1) {
			return 1;
		}else {
			return fibonacci(n1-1)+fibonacci(n1-2);
		}
	}
	public static void main(String[] args) {
		System.out.println("Factorial of 5: " + factorial(5)); // Expected: 120
		System.out.println("Fibonacci of 10: " + fibonacci(10)); // Expected: 55

		try {
		System.out.println("Factorial of -3: " + factorial(-3));
		} catch (IllegalArgumentException e) {
		System.out.println("Error calculating factorial: " + e.getMessage());
		}

		try {
		System.out.println("Fibonacci of -2: " + fibonacci(-2));
		} catch (IllegalArgumentException e) {
		System.out.println("Error calculating fibonacci: " + e.getMessage());
		}
}
}
