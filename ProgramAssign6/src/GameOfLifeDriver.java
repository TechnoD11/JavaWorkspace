import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameOfLifeDriver {

	public static void main(String[] args) 
	{		
		/** @TODO
		 * handle all input errors
		 * confirm all 3 generations work
		 */
		System.out.println("Welcome to the Game of Life.");
		Scanner in = new Scanner(System.in);
		boolean isFinished = false;
		boolean startGame = true;
		int rows = 0;
		int columns = 0;
		int generations = 0;
		String input = "";
		String directory = "";
		String fileName = "";
		while(!isFinished){
			startGame = true;
			System.out.println("Please input the number of rows for the board:");
			rows = in.nextInt();
			System.out.println("Please input the number of columns for the board:");
			columns = in.nextInt();
			System.out.println("Please input the number of generations to build");
			generations = in.nextInt();
			Life aGame = new Life(rows, columns);
			System.out.println("Your choices for building the initial grid are as follows:");
			System.out.println("\t(R)andom Grid\n\t(F)ile Input\n\t(P)rebuilt Grid");
			System.out.println("\nPlease input your choice:");
			input = in.next();
			if(input.equalsIgnoreCase("R")){
				aGame.randomBuild();
			}
			else if(input.equalsIgnoreCase("F")){
				try {
					aGame.fileInput(directory, fileName);
				} catch (FileNotFoundException e) {
					System.out.println("Please input a correct directory or file name");
					e.printStackTrace();
				}
			}
			else if(input.equalsIgnoreCase("P")){
				aGame.initialGrid();
			}
			else{
				System.out.println("Please input a valid response");
				startGame = false;
			}	
			for(int i = 0; i <= generations && startGame; i++){
				System.out.println(i + ":");
				System.out.println(aGame.toString());
				aGame.next();
			}
			System.out.println("Would you like to play again? (Y)es or (N)o");
			input = in.next();
			if(input.equalsIgnoreCase("y")){
				isFinished = false;
			}
			else{
				isFinished = true;
			}
		}
		// gather input and assign to variables
		
		//Life aGame = new Life(30,30);
		//aGame.initialGrid();
		/*try {
			aGame.fileInput("C:\\Users\\Derek\\workspace\\JavaWorkspace\\ProgramAssign6\\src", "FileOne.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		*/
		//aGame.randomBuild();
	//	aGame.initialGrid();
	/*	for(int i = 0; i <= 15; i++){
			System.out.println(i + ":");
			System.out.println(aGame.toString());
			aGame.next();
		}*/
		
		//aGame.next();
		//System.out.println(aGame.toString());
		//System.out.println(aGame.toString());
	//	String directory = "C:\Users\Derek\workspace\JavaWorkspace\ProgramAssign6\src\";
	}
}
		/*if (choice.equalsIgnoreCase("r"))				
			aGame.randomBuild();
		else if (choice.equalsIgnoreCase("f"))	
				aGame.fileInput();
		else aGame.initialGrid();

		for (int gen = 0; gen <= totalGenerations; gen++)
		{
			// print generation # and grid
		}
	}
}*/
/*

==================================================================================================


	Here is a method that will initialize a grid .or the Game of Life
	The output for each generation is on the next page
	Note that after 15 generations the grid returns to its original values

	public void initialGrid()
	
	/***************************************************************************************
		This method will establish an initial grid:

				  *    *
				** **** **
				  *    *

		Assume that the initial grid is 30 x 30
	**************************************************************************************
	{
		int r = rows/3;					// Set up a third of the way down
		int c = cols/3;					// Set up a third of the way over
		for (int a = 0; a < rows; a++)
			for (int b = 0; b < cols; b++)
				theGrid[a][b] = false;		// initialize the array to false

		theGrid[r][c + 3] = theGrid[r][c + 8] = true;		//top row
		theGrid[r + 1][c + 1] = theGrid[r + 1][c + 2] = true;	//middle 2 le.t
		theGrid[r + 1][c + 9] = theGrid[r + 1][c + 10] = true;	//middle 4
		theGrid[r + 1][c + 4] = theGrid[r + 1][c + 5] = true;	//middle 4
		theGrid[r + 1][c + 6] = theGrid[r + 1][c + 7] = true;	//middle 2 right
		theGrid[r + 2][c + 3] = theGrid[r + 2][c + 8] = true;	//bottom row
	}*/