
public class Demonstrate {

	public static void main(String[] args) {
	for(int i=1;i<=20;i++) {
		if(i==10) {
			 System.out.println("Reached 10, breaking the loop.");
             break;
		}
		System.out.println("Processing number: "+ i);
	}
	System.out.println("Loop 1 finished.");
	}

}
