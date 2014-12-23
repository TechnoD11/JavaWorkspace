public class Sudoku
{
   private String[][] x;
   private final int SIZE = 9; //instance fields
   
   public Sudoku(String s) //constructor with String s that is the arrangement of the numbers
   {
      int k = 0;
      x = new String[SIZE][SIZE];
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
         {
            x[i][j] = s.substring(k ,k + 1);
            k++;
         }
      }
   }
   public String toString() //prints the formatted sudoku board
   {
      String temp = "";
      for (int i = 0; i < SIZE; i++)
      {
         if ((i == 3) || (i == 6))
         {
            temp = temp + "=================\n";
         }
         for (int j = 0; j < SIZE; j++)
         {
            if ((j == 3) || (j == 6))
            {
               temp = temp + " || ";
            }
            temp = temp + x[i][j];
         }
         temp = temp + "\n";
      }
      return temp;
   }

   public boolean isValidSudoku(){ //checks each row, column, and subsquare to see if valid
	   boolean isValid = false;
	   if(rowsAreLatin() && colsAreLatin() && goodSubsquares()){
		  isValid = true;
	   }
	   else{
		   isValid = false;
	   }
	   return isValid;
	   
   }
   public boolean rowsAreLatin(){ //checks the rows
	   boolean[] isFound = new boolean[9]; //boolean array
	   for(int i = 0; i < isFound.length; i++){
		   isFound[i] = false; //fill with false
	   }
	   for(int i = 0; i < x.length; i++){
		   for(int k = 0; k < x[0].length; k++){ //set each index to true if in sudoku board row
			   isFound[(Integer.parseInt(x[i][k])) - 1] = true;
		   }
		   for(int j = 0; j < x[0].length; j++){
			   if(!isFound[j]){
				   return false; //if any member on the board is not present
			   }
		   }
		   for(int k = 0; k < isFound.length; k++){
			   isFound[k] = false; //reset the boolean array
		   }
	   }
	   return true;
   }
   public boolean colsAreLatin(){ //check the columns
	   boolean[] isFound = new boolean[9]; //boolean array
	   for(int i = 0; i < isFound.length; i++){
		   isFound[i] = false; //fill with false
	   }
	   for(int i = 0; i < x.length; i++){
		   for(int k = 0; k < x[0].length; k++){ //set each index to true if in sudoku board
			   isFound[(Integer.parseInt(x[k][i])) - 1] = true;
		   }
		   for(int j = 0; j < x[0].length; j++){
			   if(!isFound[j]){
				   return false; //if any member doesn't show up return false
			   }
		   }
		   for(int k = 0; k < isFound.length; k++){
			   isFound[k] = false; //reset the boolean array
		   }
	   }
	   return true;
   }
   public boolean goodSubsquares(){ //checks the subsquares
	   boolean isFound[] = new boolean[9]; //boolean array
	   for(int i = 0; i < isFound.length; i++){
		   for(int j = 0; j < isFound.length; j++){
			   isFound[i] = false; //fill boolean array with false
		   }
	   }
	   for(int i = 3; i <= x.length; i += 3){
		   for(int m = 3; m <= x.length; m += 3){
			   for(int j = (i - 1); j >= (i - 3); j--){
				   for(int k = (m - 1); k >= (m - 3); k--){ //quadruple for loop, outer 2 iterate to the subsquares, inner 2 check each individual subsquare for latin 
					   isFound[Integer.parseInt(x[j][k]) - 1] = true;
				   }
			   }
			   for(int u = 0; u < isFound.length; u++){
				   if(!isFound[u]){
					   return false; //if any member not present, return false
				   }
			   }
		   }
	   }
	   return true;

   }
}
