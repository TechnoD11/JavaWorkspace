import java.io.IOException;
import java.util.Scanner;

public class LifeRunner {

	public static void main(String[] args) throws IOException {
		Scanner scanIt = new Scanner(System.in);
		int gameState = 1;
		String choice;

		while (gameState != 0) {

			System.out.println("Welcome to the Game of Life.");
			System.out.println("How many rows would you like?");
			int totalRows = scanIt.nextInt();
			System.out.println("How many columns would you like?");
			int totalColumns = scanIt.nextInt();
			System.out.println("How many generations would you like?");
			int totalGenerations = scanIt.nextInt();
			// initialize variables

			Life aGame = new Life(totalRows, totalColumns);

			System.out.println("Your choices for building the initial grid is as follows:");
			System.out.println("\t(R)andom Grid\n\t(F)ile Input\n\t(P)rebuilt Grid");
			System.out.println("\nPlease input your choice:");

			// gather input and assign to variables
			
			choice = scanIt.next();
			
			
			if (choice.equalsIgnoreCase("r")) 
			{
				aGame.randomBuild();
				for (int gen = 0; gen <= totalGenerations; gen++) 
				{
					System.out.println(aGame.printBoard());
					aGame.nextGen();
					//totalGenerations++;
					//System.out.println("\n\n\n");
				}
			} else if (choice.equalsIgnoreCase("f"))
			{
				aGame.fileInput("1", "2");
			}
			else if (choice.equalsIgnoreCase("p")) 
			{
				aGame.prebuiltGrid();
				for (int gen = 0; gen <= totalGenerations; gen++) 
				{
					System.out.println(aGame.printBoard());
					aGame.nextGen();
				}
			}
			System.out.println("Would you like to play again? Enter 1 for yes and 0 for no");
			gameState = scanIt.nextInt();
		}
	}
}