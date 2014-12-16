import java.util.Random;

/**
 * 
 * @author Derek Wider
 *Programming Assignment 5
 */
public class Elimination {
	private boolean[] tabs;
	private Random rand;
	private int diceA;
	private int diceB;
	private int finalScore; //instance fields of game
	public Elimination(){
		tabs = new boolean[12]; //create game with default fields
		rand = new Random();
		diceA = 0;
		diceB = 0;
		finalScore = 0;
		clearBoard(); 
	}
	public void clearBoard(){ //sets all array members to false
		for(int i = 0; i < tabs.length; i++){
			tabs[i] = false;
		}
		finalScore = 0;
	}
	public void rollDice(){
		diceA = rand.nextInt(6) + 1; //generates 2 random dice rolls
		diceB = rand.nextInt(6) + 1;
	}
	public String getNewDiceRolls(){
		String rolls = "";
		rollDice(); //prints a string containing the 2 dice rolls
		rolls += "DiceA is: " + diceA + " and DiceB is: " + diceB;
		return rolls;
	}
	public int getFinalScore(){
		calculateScore();
		return finalScore; //calculate and print final score
	}
	public String printDoubleResponse(){
		return "Can only sum with doubles, sum added to board"; //prints if dice are equal and user inputs D, dual
	}
	public int changeArray(String input){
		int isEmpty = 0; //holds change output
		if(input.equalsIgnoreCase("d")){ //if dual selected
			if(diceA != diceB){//check to see if the dice are not equal
				if(tabs[diceA - 1] || tabs[diceB - 1]){ //check if positions are filled
					isEmpty = 1; 
				}
				else{
					tabs[diceA - 1] = true;
					tabs[diceB - 1] = true; //set positions to filled
				}
			}
			else if(diceA == diceB && !tabs[(diceA - 1) + (diceB)]){
				tabs[(diceA - 1) + (diceB)] = true; //if they are equal, print double reponse and fill sum
				isEmpty = 4;
			}
			else{
				isEmpty = 1; //return 1 if not possible
			}
		}
		else if(input.equalsIgnoreCase("s")){
			if(tabs[(diceA - 1) + (diceB)]){
				isEmpty = 1;
			} //if possible, fill the sum
			else{
				tabs[(diceA - 1) + (diceB)] = true;
			}
		}
		else if(input.equalsIgnoreCase("q")){
			isEmpty = 2;
		} //quit out (2)
		else{
			isEmpty = 3; //for invalid response
		}
		return isEmpty;
	}
	private void calculateScore(){
		for(int i = 0; i < tabs.length; i++){
			if(!tabs[i]){ //interates and adds up index if array member is false
				finalScore += (i + 1);
			}
		}
	}
	public String toString(){ //prints formatted game board
		String arrayString = "\n";
		for(int i = 0; i < (tabs.length - 2); i++){
			if(tabs[i]){
				arrayString += " X";
			}
			else{
				arrayString += " -";
			}
		}
		for(int i = 10; i < tabs.length; i++){ //additional loop handles double digits for neat spacing
			if(tabs[i]){
				arrayString += "  X";
			}
			else{
				arrayString += "  -";
			}
		}
		arrayString += "\n";
		for(int i = 0; i < tabs.length; i++){
			arrayString += " " + (i + 1) ; //add the numbers underneath
		}
		return arrayString;
	}
}
