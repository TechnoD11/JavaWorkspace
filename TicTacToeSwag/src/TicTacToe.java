/*
 * Willie Wider
 * Period 4
 * Created whenever Mr. Kelly made it
 * Last Modified on 12/19/2013 @ 4:47 PM
 * This is the TicTacToe Class. It's tic tac toe.
 */


/**
   A 3 x 3 tic-tac-toe board.
*/
public class TicTacToe
{
   private String[][] board;
   private String[][] boardFlippedVerticaly;
   private String[][] boardFlippedHorizontaly;
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
   
//flips the board along it's x axis
   public String flipHorizontal(){
	   boardFlippedHorizontaly=new String[ROWS][COLUMNS];
	   boardFlippedHorizontaly[0][0]=board[2][0];
	   boardFlippedHorizontaly[0][1]=board[2][1];
	   boardFlippedHorizontaly[0][2]=board[2][2];
	   boardFlippedHorizontaly[1][0]=board[1][0];
	   boardFlippedHorizontaly[1][1]=board[1][1];
	   boardFlippedHorizontaly[1][2]=board[1][2];
	   boardFlippedHorizontaly[2][0]=board[0][0];
	   boardFlippedHorizontaly[2][1]=board[0][1];
	   boardFlippedHorizontaly[2][2]=board[0][2];
	   //the new board, boardFlippedHorizontaly, is then displayed
	   //and the program exits
	   String r = "";
	      for (int i = 0; i < ROWS; i++)
	      {
	         r = r + "|";
	         for (int j = 0; j < COLUMNS; j++)         
	            r = r + boardFlippedHorizontaly[i][j];
	         r = r + "|\n";
	      }
	      return r;
   }
//flips the board along it's y axis
   public String flipVertical(){
	   boardFlippedVerticaly=new String[ROWS][COLUMNS];
	   boardFlippedVerticaly[0][0]=board[0][2];
	   boardFlippedVerticaly[0][1]=board[0][1];
	   boardFlippedVerticaly[0][2]=board[0][0];
	   boardFlippedVerticaly[1][0]=board[1][2];
	   boardFlippedVerticaly[1][1]=board[1][1];
	   boardFlippedVerticaly[1][2]=board[1][0];
	   boardFlippedVerticaly[2][0]=board[2][2];
	   boardFlippedVerticaly[2][1]=board[2][1];
	   boardFlippedVerticaly[2][2]=board[2][0];
	   //the new board, boardFlippedVerticaly, is then displayed
	   //and the program exits
	   String r = "";
	      for (int i = 0; i < ROWS; i++)
	      {
	         r = r + "|";
	         for (int j = 0; j < COLUMNS; j++)         
	            r = r + boardFlippedVerticaly[i][j];
	         r = r + "|\n";
	      }
	      return r;
   }
}
