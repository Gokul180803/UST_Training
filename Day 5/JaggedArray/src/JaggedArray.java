
public class JaggedArray {

	public static void main(String[] args) {
		
		int[][] studentScores=new int [3][];
		  
	        studentScores[0] = new int[]{85, 92, 78, 65};
	        studentScores[1] = new int[]{70, 95};
	        studentScores[2] = new int[]{88, 72, 90, 81, 75};
	        for (int i = 0; i < studentScores.length; i++) {
	            System.out.print("Student " + (i + 1) + " Scores: ");
	            for (int score : studentScores[i]) {
	                System.out.print(score + " ");
	            }
	            System.out.println();
	        }

	        System.out.println();

	        
	        for (int i = 0; i < studentScores.length; i++) {
	            int sum = 0;
	            for (int score : studentScores[i]) {
	                sum += score;
	            }
	            double average = (double) sum / studentScores[i].length;
	            System.out.printf("Student %d - Sum: %d, Average: %.1f%n", (i + 1), sum, average);
	        }
	    }
	}
		