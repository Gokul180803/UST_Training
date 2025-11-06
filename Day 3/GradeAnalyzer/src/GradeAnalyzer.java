import java.util.Scanner;
public class GradeAnalyzer {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the student's score (0-100):");
		int a=sc.nextInt();
		if(a>=90&&a<=100) {
			System.out.println("The grade is: A");
		}else if (a>=80&&a<=89) {
			System.out.println("The grade is: B");
		}else if (a>=70&&a<=79) {
			System.out.println("The grade is: C");
		}else if (a>=60&&a<=69) {
			System.out.println("The grade is: D");
		}else if (a>=0&&a<=59){
			System.out.println("The grade is: F");
		}else {
			System.out.println("Invalid score. Please enter a score between 0 and 100.");
		}
		sc.close();
	}

}





//
//Enter the student's score (0-100): 75
//The grade is: C

//**A**: 90 - 100
//* **B**: 80 - 89
//* **C**: 70 - 79
//* **D**: 60 - 69
//* **F**: Below 60