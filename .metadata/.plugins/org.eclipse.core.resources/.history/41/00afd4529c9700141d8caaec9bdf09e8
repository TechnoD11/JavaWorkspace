import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;


public class Life {
	private int theRows;
	private int theColumns;
	private int rows;
	private int columns;
	private boolean theGrid[][];
	private Random rand;
	private Scanner inData;
	private File inFile;
	public Life(int rows, int columns){
		theGrid = new boolean[rows][columns];
		this.rows = rows;
		theRows = rows;
		theColumns = columns;
		this.columns = columns;
		rand = new Random();
		clearGrid();
	}
	public void clearGrid(){
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				theGrid[i][j] = false;
			}
		}
	}
	public void randomBuild(){
		clearGrid();
		for(int i = 0; i < theGrid.length; i++){
			for(int j = 0; j < theGrid[0].length; j++)
				if(rand.nextInt(10) < 3){
					theGrid[i][j] = true;
				}
		}
	}
	private void resetBounds(){
		rows = theRows;
		columns = theColumns;
	}
	public void fileInput(String directory, String fileName) throws FileNotFoundException{
		clearGrid();
		inFile = new File(directory, fileName); //scan in a paint data file
		inData = new Scanner(inFile);
		String lineData = inData.next();
		int columnCounter = 0;
		boolean contains = true;
		for(int i = 0; i < columns && contains; i++){
			for(int j = 0; j < lineData.length(); j++){
				if(lineData.charAt(j) == '.'){
					theGrid[i][j] = false;
				}
				else{
					theGrid[i][j] = true;					
				}
				columnCounter++;
			}
			try{
				lineData = inData.next();
			}catch (NoSuchElementException e){
				contains = false;
				columns = columnCounter;
				rows = i + 1;
			}
			columnCounter = 0;
		}
		inData.close();
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
	public void next(){
		boolean[][] newBoard = new boolean[rows][columns];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				newBoard[i][j] = false;
			}
		}
		int cellCounter = 0;
		for (int i = (rows - 1); i >= 0; i--) {
			for (int j = (columns - 1); j >= 0; j--) {
				for (int k = (i - 1); k < (i + 2); k++) {
					for (int m = (j - 1); m < (j + 2); m++) {
						if (!(k == i && m == j)) {
							if (!((k < 0 || k > (rows - 1)) || (m < 0 || m > (columns - 1)))) {
								if (theGrid[k][m]) {
									cellCounter++;
								}
							}
						}
					}
				}
				if (cellCounter == 3 || cellCounter == 2 && theGrid[i][j]) {
					newBoard[i][j] = true;
				}
				cellCounter = 0;
			}
		}
		//transpose onto new grid
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				if(newBoard[i][j]){
					theGrid[i][j] = true;
				}
				else{
					theGrid[i][j] = false;
				}
			}
		}
	}
	public String toString(){
		String board = "";
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				if(theGrid[i][j]){
					board += "*";
				}
				else{
					board += " ";
				}
			}
			board += "\n";
		}
		return board;
	}
}
