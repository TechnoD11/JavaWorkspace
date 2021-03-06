/**
 * @author Derek Wider
 * Programming Assignment 6
 */
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameOfLifeDriver {

	public static void main(String[] args) 
	{		
		Scanner in = new Scanner(System.in);
		boolean isFinished = false;
		boolean startGame = true;
		int rows = 0;
		final int defaultRows = 20; //used with prebuilt grid
		int columns = 0;
		final int defaultColumns = 20; //used with prebuilt grid
		int generations = 0; //create all necessary variables
		String input = "";
		
		//Change directory and file name here:
		String directory = "C:\\Users\\Derek\\workspace\\JavaWorkspace\\ProgramAssign6\\src";
		String fileName = "FileOne.txt";
		//construct a new life game
		Life aGame = new Life();
		System.out.println("Welcome to the Game of Life."); //welcome message
		while(!isFinished){ 
			startGame = true;
			System.out.println("Your choices for building the initial grid are as follows:");
			System.out.println("\t(R)andom Grid\n\t(F)ile Input\n\t(P)rebuilt Grid\n\t(U)ser Input");
			System.out.println("\nPlease input your choice:");
			input = in.next(); //prompt for user choice
			if(input.equalsIgnoreCase("R")){ //if random build, ask for rows, columns, and then create the grid with the inputed data
				System.out.println("Please input the number of rows for the board:");
				rows = in.nextInt();
				System.out.println("Please input the number of columns for the board:");
				columns = in.nextInt();
				aGame.createGrid(rows, columns);
				aGame.randomBuild();
			}
			else if(input.equalsIgnoreCase("F")){ //if fileInput, try inputing the file, if file not found, inform user to use correct directory
				try{
					aGame.fileInput(directory, fileName);
				}catch (FileNotFoundException e) {
					System.out.println("Please input a correct directory or file name");
					startGame = false; //don't start the game
				}
			}
			else if(input.equalsIgnoreCase("P")){ //if prebuilt, use the default grid 
				aGame.createGrid(defaultRows, defaultColumns);
				aGame.initialGrid(); 
			}
			else if(input.equalsIgnoreCase("U")){ //lets users input a row and column to create a live cell
				System.out.println("Please input the number of rows for the board:");
				rows = in.nextInt();
				System.out.println("Please input the number of columns for the board:");
				columns = in.nextInt();//creates the grid at the rows and columns
				aGame.createGrid(rows, columns);
				boolean finished = false;
				while(!finished){ //while the user wants to put more cells in
					System.out.println("Please input the row to create a live cell in:");
					int row = in.nextInt();
					System.out.println("Please input the column to create a live cell in:");
					int column = in.nextInt(); //prompt for rows and columns
					if((row >= rows || column >= columns) || (row < 0 || column < 0)){
						System.out.println("Please input a row/column within the grid bounds");
					} //check to make sure user input is within the grid
					else{
						aGame.userInput(row, column);
					} //add to grid if not
					System.out.println(aGame.toString());
					System.out.println("(A)dd another cell or (q)uit out?");
					String resp = in.next(); //prompt for more cells
					if(resp.equalsIgnoreCase("a")){
						finished = false;
					}
					else{
						finished = true; //quit out if finished
					}
				}
			}
			else{
				System.out.println("Please input a valid response");
				startGame = false;
			}	
			if(startGame){ //if the user has inputed viable data to create a grid from, prompt for generations to build
				System.out.println("Please input the number of generations to build");
				generations = in.nextInt();
			}
			for(int i = 0; i <= generations && startGame; i++){ //iterate through generations, print result
				System.out.println(i + ":");
				System.out.println(aGame.toString());
				aGame.next();
			}
			System.out.println("Would you like to play again? (Y)es or (N)o"); //prompt user for repeat
			input = in.next();
			if(input.equalsIgnoreCase("y")){
				isFinished = false;
			}
			else{
				isFinished = true;
			}			
		}
		in.close(); //close input stream when finished
	}
}