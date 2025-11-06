
public class ArrayTraversal {

	public static void main(String[] args) {
		int[] studentScores = {85, 72, 90, 65, 50, 95, 78, 88, 60, 100};
		int MaxScore=Integer.MIN_VALUE;
		int MinScore=Integer.MAX_VALUE;
		int TotalScore=0;
		int CountPassing=0;
		for(int Scores:studentScores ) {
			if(Scores>=60) {
				CountPassing++;
			}
			TotalScore+=Scores;
			if(MaxScore<Scores) {
				MaxScore=Scores;
			}
			if(MinScore>Scores) {
				MinScore=Scores;
			}
			System.out.println(Scores);
		}
		System.out.println("Highest Score : "+MaxScore);
		System.out.println("Lowest Score : "+MinScore);
		System.out.println("Average Score : "+((double)TotalScore/studentScores.length));
		System.out.println("Count Passing Students : "+CountPassing);
		
	}

}
