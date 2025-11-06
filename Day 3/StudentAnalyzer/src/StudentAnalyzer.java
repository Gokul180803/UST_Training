import java.util.Scanner;

public class StudentAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter score for Mathematics: ");
        double mathScore = scanner.nextDouble();

        System.out.print("Enter score for Science: ");
        double scienceScore = scanner.nextDouble();

        System.out.print("Enter score for English: ");
        double englishScore = scanner.nextDouble();

        double totalScore = mathScore + scienceScore + englishScore;
        double averageScore = totalScore / 3;

      
        boolean passed = averageScore >= 60.0;
        char grade;

        if (averageScore >= 90.0 && averageScore <= 100.0) {
            grade = 'A';
        } else if (averageScore >= 80.0 && averageScore < 90.0) {
            grade = 'B';
        } else if (averageScore >= 70.0 && averageScore < 80.0) {
            grade = 'C';
        } else if (averageScore >= 60.0 && averageScore < 70.0) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        
        int studentAttempts = 1;
        studentAttempts++;

        double bonusPoints = 5.0;
        if (grade == 'A') {
            bonusPoints += 2.5;
        }

      
        System.out.println("\n--- Student Performance Report ---");
        System.out.println("Mathematics Score: "+ mathScore);
        System.out.println("Science Score: "+ scienceScore);
        System.out.println("English Score: "+ englishScore);
        System.out.println("Total Score: "+ totalScore);
        System.out.println("Average Score: "+ averageScore);
        System.out.println("Status: " + (passed ? "Passed" : "Failed"));
        System.out.println("Grade: " + grade);
        System.out.println("Student Attempts: " + studentAttempts);
        System.out.println("Bonus Points: "+ bonusPoints);

     
    }
}
