import java.util.Scanner;
public class JavaYourProgram {
 
	public static void main(String[] args) {
		
        
		int a,b;

 if(args.length==2) {
	 a=Integer.parseInt(args[0]);
	 b=Integer.parseInt(args[1]); 
 }else {
	 Scanner sc = new Scanner(System.in);
System.out.println("Enter the First Number : ");
	 a=sc.nextInt();
	 System.out.println("Enter the Secound Number : ");
	 b=sc.nextInt();
 }
 int res=a+b;

 System.out.println("The Sum of "+ a +" and " + b+" is "+res);
	}
	}

 