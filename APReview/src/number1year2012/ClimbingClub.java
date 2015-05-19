package number1year2012;

import java.util.ArrayList;

public class ClimbingClub {
	private ArrayList<ClimbInfo> climbList;
	//2012 #1 a)
	public void addClimb(String peakName, int climbTime){
		climbList.add(new ClimbInfo(peakName, climbTime));
	}
	//2012 #1 b) (check compareto and make sure it is supposed to be >
	public void addClimb2(String peakName, int climbTime){
		int pos = 0;
		for(int i = 0; i < climbList.size(); i++){
			if(climbList.get(i).getName().compareTo(peakName) > 0){
				break;
			}
			else{
				pos++;
			}
		}
		climbList.add(pos, new ClimbInfo(peakName, climbTime));
	}
	/*2012 #1 c)
	i) no, because they are not in alphabetical order, and the algorithm only checks between the current and last known names
	ii)yes, because the names are in alphabetical order, so it will work.
	*/
}
