/**
 * 
 * @author Derek Wider and Nick Napior
 * Magic Square HW
 */

public class MagicSquare {
	private int[][] squareMembers;
	private boolean isMagicSquare;
	private int sum;
	private int checkSum;
	private int columnCheckSum;
	private int ROWS;
	private int COLUMNS; //instance fields
	
	//Constructs the square and sets all values to a defualt value to work with
	public MagicSquare(int[][] thisArray){
		squareMembers = thisArray.clone();
		isMagicSquare = true;
		sum = 0;
		checkSum = 0;
		columnCheckSum = 0;
		ROWS = thisArray.length;
		COLUMNS = thisArray[0].length; //initialize all the variables 
	}
	
	//Method to check to see if the square is a magic square and returns a true or false
	public boolean isMagicSquare(){ 
		for(int i = 0; i < squareMembers.length; i++){
			sum += squareMembers[i][0];
		} //first find the sum of the first row
		for(int i = 0; i < squareMembers.length; i++){ //then check the rows and columns to see if they equal the sum
			for(int j = 0; j < squareMembers[0].length; j++){
				checkSum += squareMembers[j][i];
				columnCheckSum += squareMembers[i][j];
			}
			if(sum != checkSum){
				isMagicSquare = false;
			}
			if(sum != columnCheckSum){
				isMagicSquare = false;
			}
			checkSum = 0;
			columnCheckSum = 0;
		}
		//end row/column code
		int i = ROWS - 1;
		int j = COLUMNS - 1;
		while(i != -1 && j != -1){ //now check the diagonals, first one, than the other
			checkSum += squareMembers[i][j];
			i--;
			j--;
		}	
		if(checkSum != sum){
				isMagicSquare = false;
		}
		i = 0;
		j = COLUMNS - 1;
		while(i != ROWS && j != -1){ //other diagonal
			columnCheckSum += squareMembers[i][j];
			i++;
			j--;
		}	
		if(columnCheckSum != sum){
				isMagicSquare = false;
		}
		return isMagicSquare;
	}
	public int getValue(){ //gets the sum of the first row
		sum = 0;
		for(int i = 0; i < squareMembers.length; i++){
			sum += squareMembers[i][0];
		}
		return sum;
	}
	
	//Method to add each array member to a string, then prints it out.
	public String toString(){ 
		String arrayString = "The Array:\n";
	/*
		for(int i = 0; i < squareMembers.length; i++){
			for(int j = 0; j < squareMembers[0].length; j++){
				arrayString += "\t" + squareMembers[i][j];
			}
			arrayString += "\n";
		
	*/
		int rowCount = 0;
		for(int i = 0; i < squareMembers.length; i++){
			for(int j = 0; j < squareMembers[0].length; j++){
				arrayString += squareMembers[i][j] + "  ";
				if(squareMembers[i][j] < 10) arrayString += " "; //Sets up nice format so that if it is missing two places it fills with two spaces
				rowCount++;
				//Resets the row count to then move a line
				if(rowCount == 4){
					arrayString += "\n";
					rowCount = 0;
				}
			/*
				if(ROWS == 3 && rowCount == 3){
					arrayString += "\n";
					rowCount = 0;
				}
				else{
					arrayString += "\n";
					rowCount = 0;
				}
			*/
			}
		}
		return arrayString;
	}
}
