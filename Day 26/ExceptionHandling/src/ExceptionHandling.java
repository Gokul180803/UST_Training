import java.util.Scanner;

class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String string) {

		super(string);
	}
	
}
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			int age =sc.nextInt();
			if(age<0) {
				throw new InvalidAgeException("enter the correct age");
			}else {
				System.out.print("Age is "+age);
			}
		}catch(InvalidAgeException e) {
			System.out.print("Error: "+e.getMessage());
		}
	}

}
