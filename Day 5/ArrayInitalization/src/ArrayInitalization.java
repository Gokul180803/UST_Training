
public class ArrayInitalization {

	public static void main(String[] args) {
		
         String teamNames[]= {"Mumbai Indians", "Chennai Super Kings", "Royal Challengers Bangalore", "Kolkata Knight Riders", "Sunrisers Hyderabad", "Delhi Capitals", "Punjab Kings", "Rajasthan Royals"};
         int teamWins[]= new int[8];
         teamWins[0]=10;teamWins[1]=9;teamWins[2]=7;teamWins[3]=8;teamWins[4]=6;teamWins[5]=9;teamWins[6]=5;teamWins[7]=7;
         for(int i=0;i<teamNames.length;i++) {
        	 System.out.println(teamNames[i]+": "+teamWins[i]+" Wins");
         }
         int playerScores[]= {45,82,15,0,67};
         int playerScore=0;
         for(int Max:playerScores) {
        	 playerScore+=Max;
         }
         System.out.println("Total Match Score : "+ playerScore);
	}

}
