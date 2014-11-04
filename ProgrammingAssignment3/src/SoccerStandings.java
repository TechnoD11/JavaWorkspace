/**
 * 
 * @author Derek Wider
 *
 */
public class SoccerStandings {
	private int wins, losses, ties, scoredGoals, goalsAllowed;
	public SoccerStandings(){
		wins = 0; losses = 0; ties = 0; scoredGoals = 0; goalsAllowed = 0;
	}
	private double generateScore(){
		double result = (wins*30)+(8*ties)-(15*losses);
		if(scoredGoals > goalsAllowed){
			result = result + (.15 * (scoredGoals - goalsAllowed));
		}
		else{
			result = result + (.3 * (scoredGoals - goalsAllowed));
		}
		if(losses == 0){
			result += 10;
		}
		if(ties == 0){
			result += 5;
		}
		return result;
	} 
	public void printFormat(){
		System.out.println("Wins\tLosses\tTies\tGoals Scored\tGoals Against\tTeam Score");
	}
	public void printData(int wins, int losses, int ties, int scoredGoals, int goalsAllowed){
		this.wins = wins; this.losses = losses; this.ties = ties; this.scoredGoals = scoredGoals; this.goalsAllowed = goalsAllowed;
		double result = generateScore();
		System.out.println(wins + "\t" + losses + "\t" + ties + "\t" + scoredGoals + "\t\t" + goalsAllowed + "\t\t" + result);
	}
	
}
