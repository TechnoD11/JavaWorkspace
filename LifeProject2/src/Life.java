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
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Life {
	private boolean[][] theGrid;
	private int rows;
	private int cols;
	private Scanner in;
	private File inFile;

	// Constructor for the life game
	public Life(int newRows, int newCols) {
		createGrid(newRows, newCols);
	}

	// Method to create grid
	private void createGrid(int newRows, int newCols) {
		theGrid = new boolean[newRows][newCols];
		rows = theGrid.length;
		cols = theGrid[0].length;
		setAllFalse(); // Clears the board out
	}

	// Method to generate a generic grid
	public void initialGrid() {
		int r = rows / 3; // Set up a third of the way down
		int c = cols / 3; // Set up a third of the way over
		for (int a = 0; a < rows; a++)
			for (int b = 0; b < cols; b++)
				theGrid[a][b] = false; // initialize the array to false
		theGrid[r][c + 3] = theGrid[r][c + 8] = true; // top row
		theGrid[r + 1][c + 1] = theGrid[r + 1][c + 2] = true; // middle 2 le.t
		theGrid[r + 1][c + 9] = theGrid[r + 1][c + 10] = true; // middle 4
		theGrid[r + 1][c + 4] = theGrid[r + 1][c + 5] = true; // middle 4
		theGrid[r + 1][c + 6] = theGrid[r + 1][c + 7] = true; // middle 2 right
		theGrid[r + 2][c + 3] = theGrid[r + 2][c + 8] = true; // bottom row
	}

	// Method to generate a random grid
	public void randomBuild() {
		in = new Scanner(System.in);
		// checks if the value they enter is in bounds
		boolean tryAgain = true;
		boolean tryAgain1 = true;
		int input = 0;
		// A default amount
		int newRows = 25;
		int newCols = 25;
		System.out.println("What size grid do you want?");
		// First while loop for rows
		while (tryAgain) {
			System.out.println("Please enter the number of rows or type 0 for default (25):");
			input = in.nextInt();
			// Updates value
			if (input > 0) {
				newRows = input;
				tryAgain = false;
			}
			// keeps default of 25
			else if (input == 0) {
				tryAgain = false;
			} else
				System.out.println("that value is out of bounds.");
		}
		// Second while loop for columns
		while (tryAgain1) {
			System.out.println("Please enter the number of Columns or type 0 for default (25):");
			input = in.nextInt();
			// Update value
			if (input > 0) {
				newCols = input;
				tryAgain1 = false;
			}
			// Keep default
			else if (input == 0) {
				tryAgain1 = false;
			} else
				System.out.println("That value is out of bounds.");
		}
		createGrid(newRows, newCols);
		Random numGen = new Random();
		// Makes random live cells based out of 10 then only use less than 3 so
		// not as clustered
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (numGen.nextInt(9) < 3) {
					theGrid[i][j] = true;
				} else
					theGrid[i][j] = false;
			}
		}
		in.close();
	}

	// Method to generate a grid based on the user and the cells they set alive
	public void userInput() {
		in = new Scanner(System.in);
		// checks if the value they enter is in bounds
		boolean tryAgain = true;
		boolean tryAgain1 = true;
		int input = 0;
		// A default amount
		int newRows = 25;
		int newCols = 25;
		System.out.println("What size grid do you want?");
		// First while loop for rows
		while (tryAgain) {
			System.out
					.println("Please enter the number of rows or type 0 for default (25):");
			input = in.nextInt();
			// Updates value
			if (input > 0) {
				newRows = input;
				tryAgain = false;
			}
			// keeps default of 25
			else if (input == 0) {
				tryAgain = false;
			} else
				System.out.println("that value is out of bounds.");
		}
		// Second while loop for columns
		while (tryAgain1) {
			System.out
					.println("Please enter the number of Columns or type 0 for default (25):");
			input = in.nextInt();
			// Update value
			if (input > 0) {
				newCols = input;
				tryAgain1 = false;
			}
			// Keep default
			else if (input == 0) {
				tryAgain1 = false;
			} else
				System.out.println("That value is out of bounds.");
		}
		createGrid(newRows, newCols);
		boolean enterPoints = true;
		Integer x = null;
		Integer y = null;
		Integer pointInput = null;
		while (enterPoints) {
			System.out.println("Please enter the x value or type -1 to quit:");
			pointInput = in.nextInt();
			if (pointInput < rows && pointInput >= 0)
				x = pointInput;
			else if (pointInput == -1) {
				enterPoints = false;
				break;
			}
			System.out.println("Now enter the y value:");
			input = in.nextInt();
			if (input < cols && input >= 0) {
				y = input;
				if (theGrid[x][y] == false) {
					theGrid[x][y] = true;
				} else
					System.out.println("that value is already alive.");
			} else
				System.out.println("That value is out of bounds.");
		}
		in.close();
	}

	// Method to get a grid layout from a file
	public void fileInput() {
		boolean again = true;
		while (again) {
			in = new Scanner(System.in);
			System.out
					.println("please enter the directory to the file (Ex. exFolder/folder/exFile.txt):");
			String file = in.nextLine();
			in.close();
			try {
				inFile = new File(file);
				inFile.isDirectory();
				if (!inFile.isDirectory()) {
					System.out
							.println("The DIRECTORY you enterd is invalid, try again.");
					again = true;
				} else
					again = false;
				in = new Scanner(inFile);
			} catch (Exception e) {
				// If there would be an error
				e.printStackTrace();
			}
		}
		String line1 = in.next();
		cols = line1.length();
		rows = 0;
		while (in.hasNext()) {
			rows++;
		}
		createGrid(rows, cols);
	}

	// Method to put the grid into a string
	public String toString() {
		String finalGrid = ""; // The string that will be final printed
		// For cool border
		finalGrid += "+";
		for (int i = 0; i < cols; i++) {
			finalGrid += "---";
		}
		finalGrid += "+\n";
		// Adds all the spaces for false and stars for true and has a border at
		// beginning and end
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (j == 0)
					finalGrid += "|"; // Border at beginning
				if (theGrid[i][j]) {
					finalGrid += " * ";
				} else
					finalGrid += " ";
				if (j == cols - 1)
					finalGrid += "|\n"; // Border at end
			}
		}
		// Cool border at end
		finalGrid += "+";
		for (int i = 0; i < cols; i++) {
			finalGrid += "---";
		}
		finalGrid += "+\n";
		return finalGrid;
	}

	// Sets the grid clear
	public void setAllFalse() {
		// Goes though seting all to false
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				theGrid[i][j] = false;
			}
		}
	}

	// Method to make the next generation of the board
	public void generate() {
		boolean[][] tempBoard = new boolean[rows][cols];
		// set all to false
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				tempBoard[i][j] = false;
			}
		}
		// Does all the checks
		int cellsAlive = 0;
		for (int i = (rows - 1); i >= 0; i--) {
			for (int j = (cols - 1); j >= 0; j--) {
				for (int k = (i - 1); k < (i + 2); k++) {
					for (int m = (j - 1); m < (j + 2); m++) {
						if (!(k == i && m == j)) {
							// Makes sure its not the actual point being checked
							// and make sure it doesn't go out of bounds
							if (!((k < 0 || k > (rows - 1)) || (m < 0 || m > (cols - 1)))) {
								if (theGrid[k][m]) {
									cellsAlive++; // if a cell is alive at the
													// surrounding point,
													// increase the counter
								}
							}
						}
					}
				}
				if (cellsAlive == 3 || cellsAlive == 2 && theGrid[i][j]) {
					tempBoard[i][j] = true; // create on new board
				}
				cellsAlive = 0; // reset cell counter
			}
		}
		// creates the new grid
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// reads the temp board
				if (tempBoard[i][j]) {
					theGrid[i][j] = true;
				} else {
					theGrid[i][j] = false;
				}
			}
		}
	}
}