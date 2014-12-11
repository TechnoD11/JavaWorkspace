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
	private int COLUMNS;
	
	public MagicSquare(int[][] thisArray){
		squareMembers = thisArray.clone();
		isMagicSquare = true;
		sum = 0;
		checkSum = 0;
		columnCheckSum = 0;
		ROWS = thisArray.length;
		COLUMNS = thisArray[0].length;
	}
	public boolean isMagicSquare(){
		for(int i = 0; i < squareMembers.length; i++){
			sum += squareMembers[i][0];
		}
		for(int i = 0; i < squareMembers.length; i++){
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
		while(i != -1 && j != -1){
			checkSum += squareMembers[i][j];
			i--;
			j--;
		}	
		if(checkSum != sum){
				isMagicSquare = false;
		}
		i = 0;
		j = COLUMNS - 1;
		while(i != ROWS && j != -1){
			columnCheckSum += squareMembers[i][j];
			i++;
			j--;
		}	
		if(columnCheckSum != sum){
				isMagicSquare = false;
		}
		return isMagicSquare;
	}
	public int getValue(){
		sum = 0;
		for(int i = 0; i < squareMembers.length; i++){
			sum += squareMembers[i][0];
		}
		return sum;
	}
	public String toString(){
		String arrayString = "The Array:\n";
		for(int i = 0; i < squareMembers.length; i++){
			for(int j = 0; j < squareMembers[0].length; j++){
				arrayString += "\t" + squareMembers[i][j];
			}
			arrayString += "\n";
		}
		return arrayString;
	}
}
