import java.util.Scanner;
public class AtmApplication {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	double balance = 1000.0;
	OUTER: while(true) {
		System.out.println("1. Check Balance\r\n"
				+ "2. Deposit\r\n"
				+ "3. Withdraw\r\n"
				+ "4. Exit");
	System.out.print("Enter your choice : ");
	int a=sc.nextInt();
	switch(a) {
	case 1:{
		System.out.println(balance);
		break;
	}case 2:{
		System.out.print("Enter the Amount you wish to deposit :");
		double b=sc.nextDouble();
		balance+=b;
		System.out.println("Your New Balance is : "+ balance);
		break;
	}
	case 3:{
		System.out.print("Enter the Amount you wish to Withdraw :");
		double c=sc.nextDouble(); 
		if(balance>=c) {
			balance-=c;
			System.out.println("SuccessFully Withdrawn");
			System.out.println("Your current balance is : "+ balance);
		}else {
			System.out.println("Insufficent Fund");
		}
		break;
	}case 4:{
		System.out.println("Thank you for using our ATM!");
		 break OUTER;
	}default:{
		System.out.println("Invalid option. Please choose a valid option (1-4).");
	}
	}
	}
	sc.close();
	}

}






