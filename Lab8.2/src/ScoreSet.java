/**
 * @author Derek Wider
 * Lab 8.2
 */
import java.util.ArrayList;

public class ScoreSet {
	private ArrayList<Integer> scores; //declares an array of integers
	private ArrayList<Integer> scoresCopy;

	public ScoreSet() {
		scores = new ArrayList<Integer>(); //create a new arraylist of ints
		scoresCopy = new ArrayList<Integer>(); //create a second arraylist, for modification without removal of elements from original arraylist
	}

	public void add(int score) { //adds to the arraylist
		scores.add(score);
		scoresCopy.add(score);
	}
	private void removeLowest(){ //private method, removes the lowest value from the array list
		int index = 0;
		int lowest = scoresCopy.get(index);
		for(int i = 0; i < scoresCopy.size(); i++){ //iterate through the arraylist
			if(scoresCopy.get(i) < lowest){ //if its the lowest
				lowest = scoresCopy.get(i);
				index = i; //record index
			}
		}
		scoresCopy.remove(index); //delete lowest index
	}
	public double averageWithoutLowest2() {
		double sum = 0;
		double average = 0;
		if(scores.size() > 2){ //check to make sure there are more than 2 members in the arraylist. if not, return 0
			removeLowest();
			removeLowest();
			for(int i = 0; i < scoresCopy.size(); i++){
				sum += scoresCopy.get(i); //sum up the array list
			}
			average = sum / scoresCopy.size(); //create average
		}
		return average; //return the average
		
	}
	public String toString(){
		String stringArray = ""; //empty string
		for(int counter : scores){ //enhanced for loop
			stringArray += " " + counter; //add the arraylist member to the string
		}
		return stringArray; //return the string
	}

}
