import java.util.Date;
import java.util.Scanner;

public class ImportPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Date d =new Date();
		System.out.print("Enter Your Name: ");
		String s=sc.nextLine();
		System.out.println("Hello, "+s+"! Today's date and time is:"+d);

	}

}
