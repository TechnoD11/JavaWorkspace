/********************************************************************
 *
 * Name: Nick Napior
 * Date: 12/23/14
 * Function:
 * A grid game that will simulate a cell either a live cell or a
 * dead cell and then calculate different outcomes based on cells
 * next to it.
 *
 *******************************************************************/
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GameOfLifeDriver {
	public static void main(String[] args) {
		System.out.println("Welcome to the Game of Life.");
		Scanner in = new Scanner(System.in);
		// Asks the player if they want to play again after
		boolean playAgain = true;
		while (playAgain) {
			int totalRows = 25; // default rows amount
			int totalCols = 25; // default columns amount
			Life aGame = new Life(totalRows, totalCols);
			// Used to check valid input
			boolean passed = false;
			while (!passed) {
				System.out
						.println("Your choices for building the initial grid is as follows:");
				System.out
						.println("\t(R)andom Grid\n\t(F)ile Input\n\t(P)rebuilt Grid\n\t(U)ser Input");
				System.out.println("\nPlease input your choice:");
				String choice = in.next();
				if (choice.equalsIgnoreCase("r")) {
					aGame.randomBuild();
					passed = true;
				} else if (choice.equalsIgnoreCase("f")) {
					aGame.fileInput();
					passed = true;
				} else if (choice.equalsIgnoreCase("p")) {
					aGame.initialGrid();
					passed = true;
				} else if (choice.equalsIgnoreCase("u")) {
					// Allows the user to make a blank grid then enter their own
					// points
					aGame.userInput();
					passed = true;
				} else
					System.out.println("please enter a valid value.");
			}
			int input = 0;
			int steps = 0;
			// Loops in case input is invalid
			boolean tryAgain = true;
			while (tryAgain) {
				System.out.println("How many generations would you like to simulate?");
				try{
				input = in.nextInt();
				}
				catch (NoSuchElementException e){}
				if (input >= 0) {
					steps = input;
					tryAgain = false;
				} else
					System.out.println("please enter a valid value.");
			}
			// Does the generations based on previous questions
			for (int i = 0; i < steps; i++) {
				aGame.generate();
				System.out.println(aGame.toString());
			}
			// Asks the play to play again.
			System.out.println("Would you like to play again? (y)es or (n)o");
			String answer = in.next();
			if (answer.equalsIgnoreCase("y"));
			else {
				System.out.println("Thank you for playing!");
				playAgain = false;
			}
		}
	}
}
