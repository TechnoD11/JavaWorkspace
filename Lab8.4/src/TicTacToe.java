/**
   A 3 x 3 tic-tac-toe board.
*/
public class TicTacToe
{
   private String[][] board;
   private static final int ROWS = 3;
   private static final int COLUMNS = 3;

   /**
      Constructs an empty board.
   */
   public TicTacToe()
   {
      board = new String[ROWS][COLUMNS];
      // Fill with spaces
      for (int i = 0; i < ROWS; i++)
         for (int j = 0; j < COLUMNS; j++)
            board[i][j] = " ";
   }

   /**
      Sets a field in the board. The field must be unoccupied.
      @param i the row index 
      @param j the column index 
      @param player the player ("x" or "o")
   */
   public void set(int i, int j, String player)
   {
      if (board[i][j].equals(" "))
         board[i][j] = player;
   }

   /**
      Creates a string representation of the board, such as
      |x  o|
      |  x |
      |   o|
      @return the string representation
   */
   public String toString()
   {
      String r = "";
      for (int i = 0; i < ROWS; i++)
      {
         r = r + "|";
         for (int j = 0; j < COLUMNS; j++)         
            r = r + board[i][j];
         r = r + "|\n";
      }
      return r;
   }
   public String toString(String board[][]){ //overloaded method toString, takes 2 dimensional array
	   String r = "";
	      for (int i = 0; i < ROWS; i++)
	      { //generates board on screen, made from inputed board
	         r = r + "|";
	         for (int j = 0; j < COLUMNS; j++)         
	            r = r + board[i][j];
	         r = r + "|\n";
	      }
	      return r; //return the formated board 
   }
   public String flipVertical(){
	   String[][] flippedBoard = new String[ROWS][COLUMNS];
	   for (int i = 0; i < ROWS; i++){ //create a new 2 dimension array to hold new board, fill empty
	      for (int j = 0; j < COLUMNS; j++){
	            flippedBoard[i][j] = " ";
	      }
	   }
	   for(int i = 0; i < COLUMNS; i++){ //for each column
		   for(int j = (ROWS - 1); j >= 0; j--){ //each member of column
			   flippedBoard[j][(COLUMNS - i) - 1] = board[j][i]; //set as opposite
		   }
	   }
	   return toString(flippedBoard); //return the flipped board
   }
   public String flipHorizontal(){
	   String[][] flippedBoard = new String[ROWS][COLUMNS];
	   for (int i = 0; i < ROWS; i++){//create a new 2 dimension array to hold new board, fill empty
	      for (int j = 0; j < COLUMNS; j++){
	            flippedBoard[i][j] = " ";
	      }
	   }
	   for(int i = 0; i < ROWS; i++){ //for each row
		   for(int j = (COLUMNS - 1); j >= 0; j--){ //each member of the row
			   flippedBoard[i][j] = board[(ROWS - i) - 1][j]; //set as opposite 
		   }
	   }
	   return toString(flippedBoard); //return the flipped board
   }
}
