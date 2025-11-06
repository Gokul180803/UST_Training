
public class ScoreAnalysis {

	public static void main(String[] args) {
	int matchScores[]= {65, 42, 10, 88, 30, 5};
	 int sum=0;
	for(int Total:matchScores) {
		sum+=Total;
		
	}
	System.out.println(sum);
	int greater=matchScores[0];
	for(int i=1;i<matchScores.length;i++) {
		if(matchScores[i]>greater) {
			greater =matchScores[i];
		}
	}
	System.out.println(greater);
	
	
	
	
	}

}
