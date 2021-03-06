import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *Programming Assignment 5
 */
public class EliminationRunner {

	public static void main(String[] args) {
		String resp = "";
		Scanner in = new Scanner(System.in);
		boolean playGame = true;
		boolean inGame = true;
		Elimination myGame = new Elimination();
		while(playGame){ //print welcome message
			System.out.println("Welcome to Elimination! Below is the simulated game board. "
					+ "\nDice A and B are your dice rolls"
					+ "\nPress (D) - Dual, to use both of these on the board"
					+ "\nPress (S) - Sum, to add up the sum for the board"
					+ "\nPress (Q) - Quit, to quit from the game\n");
			while(inGame){ //if in a game
				System.out.println(myGame.getNewDiceRolls());
				System.out.println(myGame.toString());
				System.out.println("What is your choice? (D)ual, (S)um, or (Q)uit?");
				resp = in.next(); //print and get response
				int changeOutcome = myGame.changeArray(resp); //make game move
				if(changeOutcome == 0){ //if game move worked
					inGame = true;
				}	
				else if(changeOutcome == 4){
					inGame = true; //if worked but with doubles 
					System.out.println(myGame.printDoubleResponse());
				}
				else if(changeOutcome == 1){
					inGame = false; //if user attempts illegal move
					System.out.println("You have lost the game (Illegal Move!). Your final score is: " + myGame.getFinalScore());
				}
				else if(changeOutcome == 2){
					inGame = false; //if user quits out
					System.out.println("You have lost the game (User Quit Out). Your final score is: " + myGame.getFinalScore());
				}
				else if(changeOutcome == 3){
					inGame = false; //if user input is illegal
					System.out.println("You have lost the game (Illegal Game Input!). Your final score is: " + myGame.getFinalScore());
				}
				
			}
			System.out.println("Would you like to play again? (y)es or (n)o");
			if(in.next().equalsIgnoreCase("y")){
				playGame = true; //reset game if yes
				inGame = true;
				myGame.clearBoard();
			}
			else{
				playGame = false; //quit out if no
			}
		}
	}

}
