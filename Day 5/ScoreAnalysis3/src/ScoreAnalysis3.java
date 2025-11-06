
public class ScoreAnalysis3 {

	public static void main(String[] args) {
		int matchScores[]= {65, 42, 10, 88, 30, 5};
		int seasonMatchScores[][]= {
				{180},
				{165},
				{205},
				{190}          };
		int singleMatchTotal=0;
		for(int Total:matchScores) {
			singleMatchTotal+=Total;
			
		}
		int highestScore=matchScores[0];
		for(int i=1;i<matchScores.length;i++) {
			if(matchScores[i]>highestScore) {
				highestScore =matchScores[i];
			}
		}
		int seasonTotalRuns=0;
		for (int i=0;i<seasonMatchScores.length;i++) {
			seasonTotalRuns+=seasonMatchScores[i][0];
		}
		double avg=(double)seasonTotalRuns/seasonMatchScores.length;
		
		System.out.println( "--- Single Match Analysis ---");
		
		System.out.println("Total runs in the match: "+singleMatchTotal);
		System.out.println("Highest individual score: "+highestScore);
		System.out.println("--- Season Performance Analysis ---");
		System.out.println("Average score over 4 matches: "+avg);
	    System.out.println("Total runs across 4 matches: "+seasonTotalRuns);
		
	}

}
