import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Life
{
	private int k;
	private int l;
	private boolean[][] lifeArray = new boolean[k][l];
	private int counter = 0;

	public Life(int thisK, int thisL) 
	{
		k = thisK;
		l = thisL;
		lifeArray = new boolean[k][l];
		
	}

	public void initialGrid()
	{
		int r = lifeArray.length / 3; // Set up a third of the way down
		int c = lifeArray[0].length / 3; // Set up a third of the way over
		for (int a = 0; a < lifeArray.length; a++)
			for (int b = 0; b < lifeArray[0].length; b++)
				lifeArray[a][b] = false; // initialize the array to false

		lifeArray[r][c + 3] = lifeArray[r][c + 8] = true; // top row
		lifeArray[r + 1][c + 1] = lifeArray[r + 1][c + 2] = true; // middle 2
																	// le.t
		lifeArray[r + 1][c + 9] = lifeArray[r + 1][c + 10] = true; // middle 4
		lifeArray[r + 1][c + 4] = lifeArray[r + 1][c + 5] = true; // middle 4
		lifeArray[r + 1][c + 6] = lifeArray[r + 1][c + 7] = true; // middle 2
																	// right
		lifeArray[r + 2][c + 3] = lifeArray[r + 2][c + 8] = true; // bottom row
	}

	public void randomBuild() {
		Random rn = new Random();
		int counter = 0;
		for (int i = 0; i < lifeArray.length; i++) {
			for (int j = 0; j < lifeArray[0].length; j++) {
				if (rn.nextInt(10) <= 3) {
					lifeArray[i][j] = true;
				}
				counter++;
			}
		}
	}

	public void fileInput(String theFile, String directory) throws IOException {
		File file = new File(theFile, directory);
		Scanner scanIt = new Scanner(file);

	}

	public void prebuiltGrid() {
		//clearGrid();
		initialGrid();
		printBoard();

	}

	public void clearGrid() {
		// Initializes array to all false
		for (int i = 0; i < lifeArray.length; i++) {
			for (int j = 0; j < lifeArray[0].length; j++) {
				lifeArray[i][j] = false;
			}
		}
	}

	/*public void nextGen() {
		for (int i = 0; i < lifeArray.length; i++) {
			for (int j = 0; j < lifeArray[0].length; j++) {
				if (lifeArray[i + 1][j] == true) {
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
	public boolean subCheck(int row, int column){
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
 }
 public void nextGen() {
        boolean[][] newBoard = new boolean[lifeArray.length][lifeArray[0].length]; //create a temporary board, same size as real game board
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
	public String printBoard(){
		String gameBoard = "";
		for(int i = 0; i < lifeArray.length; i++)
		{
			for(int j = 0; j < lifeArray[0].length; j++)
			{
				if(lifeArray[i][j])
				{
					gameBoard += "*";
				}
				else
				{
					gameBoard += " ";
				}
			}
			gameBoard += "\n";
		}
		return gameBoard;
	}
}