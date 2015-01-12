/**
 * @author Derek Wider
 * Programming Assignment 6
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Life { 
	private int rows;
	private int columns; //instance variables of the life class
	private boolean theGrid[][];
	private Random rand;
	private Scanner inData;
	private File inFile;
	
	public Life(){ //constructor, only needed to create new instance of the random class
		rand = new Random();
	}
	public void createGrid(int rows, int columns){ //creates the grid and clears it
		theGrid = new boolean[rows][columns];
		this.rows = rows;
		this.columns = columns;
		clearGrid();
	}
	public void clearGrid(){ //iterates through the grid and sets all members to false
		for(int i = 0; i < rows; i++){//rows
			for(int j = 0; j < columns; j++){//columns
				theGrid[i][j] = false; //set to false
			}
		}
	}
	/*public boolean isOutOfBounds(int row, int column){
		boolean resp = false;
		try{
			if(lifeArray[row][column]){
				
			}
		}
		return resp;
	}
	*/
	/*public boolean subCheck(int row, int column){
		boolean resp = false;
		int counter = 0;
		for(int i = (row - 1); i <= (row + 1); i++){
			for(int j = (column - 1); j <= (column + 1); j++){
				try{
					if(lifeArray[i][j] && ((i != row) && (j != column))){
						counter++; //not sure if counter is still incremented when an exception is caught, you need to check
					}
				}
				catch (IndexOutOfBoundsException e){
					
				}
			}
		}
		if(counter == 3 || (counter == 2 && lifeArray[row][column])){
			resp = true;
		}
		return resp;
	}*/
	/*public void nextGen() {
		boolean[][] newBoard = new boolean[rows][columns]; //create a temporary board, same size as real game board
		for(int i = 0; i < lifeArray.length; i++){
			for(int j = 0; j < lifeArray[0].length; j++){
				newBoard[i][j] = false; //set all to false
			}
		}
		for (int i = 0; i < lifeArray.length; i++) {
			for (int j = 0; j < lifeArray[0].length; j++) {
				if(subCheck(i, j)){
					newBoard[i][j] = true;
				}
			}
		}
		for(int i = 0; i < lifeArray.length; i++){
			for(int j = 0; j < lifeArray[0].length; j++){
				if(newBoard[i][j]){ //read temp board, set temp board data on real game board
					lifeArray[i][j] = true;
				}
				else{
					lifeArray[i][j] = false;
				}
			}
		}
	}
	
				
			/*	if (lifeArray[i + 1][j] == true) {
					counter++;
				} else if (i < lifeArray.length + 1 && lifeArray[i - 1][j] == true) {
					counter++;
				} else if (lifeArray[i][j + 1] == true) {
					counter++;
				} else if (lifeArray[i][j - 1] == true) {
					counter++;
				} else if (lifeArray[i + 1][j + 1] == true) {
					counter++;
				} else if (lifeArray[i - 1][j - 1] == true) {
					counter++;
				}
				if (counter >= 4 || counter <= 1) {
					lifeArray[i][j] = false;
				} else if (counter == 3) {
					lifeArray[i][j] = true;
				}
				counter = 0;
			}
		}
	}*/

	public void randomBuild(){ //builds a random game of life grid using the random class
		clearGrid();//clear grid
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++)
				if(rand.nextInt(10) < 3){ //generate integer between 0-9, if less than 3, set array element to true
					theGrid[i][j] = true;
				}
		}
	}
	public void fileInput(String directory, String fileName) throws FileNotFoundException{ //reads in file to build game board from
		inFile = new File(directory, fileName); 
		inData = new Scanner(inFile); //read in file from parameter variables of directory and fileName
		String lineData = inData.next(); //get first data line
		columns = lineData.length();//set column size of grid
		rows = 0;
		while(inData.hasNext()){
			rows++;
			inData.next(); //go through grid, when end is reached, row count is reached
		}
		createGrid(rows, columns); //create the grid with the gathered data
		clearGrid();
		inData.close();
		inFile = new File(directory, fileName); 
		inData = new Scanner(inFile); //reset instance variables to the same file from the beginning
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){ //iterate through the file
				if(lineData.charAt(j) == '.'){
					theGrid[i][j] = false; //read the characters, if empty, set to false
				}
				else{ //else, true
					theGrid[i][j] = true;					
				}
			}
			lineData = inData.next(); //read the next line
		}
	}
	public void initialGrid(){
		int r = rows/3;					// Set up a third of the way down
		int c = columns/3;					// Set up a third of the way over
		clearGrid();
		theGrid[r][c + 3] = theGrid[r][c + 8] = true;		//top row
		theGrid[r + 1][c + 1] = theGrid[r + 1][c + 2] = true;	//middle 2 le.t
		theGrid[r + 1][c + 9] = theGrid[r + 1][c + 10] = true;	//middle 4
		theGrid[r + 1][c + 4] = theGrid[r + 1][c + 5] = true;	//middle 4
		theGrid[r + 1][c + 6] = theGrid[r + 1][c + 7] = true;	//middle 2 right
		theGrid[r + 2][c + 3] = theGrid[r + 2][c + 8] = true;	//bottom row
	}
	public void userInput(int row, int column){
		theGrid[row][column] = true;
	}
	public void next(){ //creates the next generation based on the game of life rules
		boolean[][] newBoard = new boolean[rows][columns]; //create a temporary board, same size as real game board
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				newBoard[i][j] = false; //set all to false
			}
		}
		int cellCounter = 0;
		for (int i = (rows - 1); i >= 0; i--) {
			for (int j = (columns - 1); j >= 0; j--) { //iterate through the game board
				for (int k = (i - 1); k < (i + 2); k++) {
					for (int m = (j - 1); m < (j + 2); m++) {//iterate around the testable element
						if (!(k == i && m == j)) {
							if (!((k < 0 || k > (rows - 1)) || (m < 0 || m > (columns - 1)))) { //if not out of bounds and not the original point
								if (theGrid[k][m]) {
									cellCounter++; //if a cell is alive at the surrounding point, increase the counter
								}
							}
						}
					}
				}
				if (cellCounter == 3 || cellCounter == 2 && theGrid[i][j]) { //if meets the criteria
					newBoard[i][j] = true; //create on new board
				}
				cellCounter = 0; //reset cell counter
			}
		}
		//transpose onto new grid
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				if(newBoard[i][j]){ //read temp board, set temp board data on real game board
					theGrid[i][j] = true;
				}
				else{
					theGrid[i][j] = false;
				}
			}
		}
	}
	public String toString(){ //creates a string representation of the board
		String board = "";
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				if(theGrid[i][j]){ //iterate through, if cell is alive, mark with *
					board += "*";
				}
				else{
					board += " "; //else, [space]
				}
			}
			board += "\n";//create a new line, to create the board
		}
		return board; //return the board
	}
}
