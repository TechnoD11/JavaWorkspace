/**
 * @author Derek Wider
 * Lab 8.2
 */
import java.util.ArrayList;

public class ScoreSet {
	private ArrayList<Integer> scores; //declares an array of integers

	public ScoreSet() {
		scores = new ArrayList<Integer>(); //create a new arraylist of ints
	}

	public void add(int score) { //adds to the arraylist
		scores.add(score);
	}

	public double averageWithoutLowest2() {
		double sum = 0;
		int lowestVal = scores.get(0); 
		int secondLowestVal = scores.get(0); //creates local variables to store lowest and second lowest values
		for(int i = 0; i < scores.size(); i++){ //iterate through the array list
			if(scores.get(i) < lowestVal){
				lowestVal = scores.get(i); //if its the lowest value, put it in the lowest value variable
			}
		}
		for(int i = 0; i < scores.size(); i++){
			if(scores.get(i) < secondLowestVal && scores.get(i) > lowestVal){ // if its the second lowest, assign it to the second lowest variable
				secondLowestVal = scores.get(i);
			}
		}
		for(int i = 0; i < scores.size(); i++){
			sum += scores.get(i); //sum up the array list
		}
		double average = sum / scores.size(); //create average
		System.out.println(average);
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