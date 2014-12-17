public class Sudoku
{
   private String[][] x;
   private final int SIZE = 9;
   
   public Sudoku(String s)
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
   public String toString()
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

   public boolean isValidSudoku(){
	   boolean isValid = false;
	   if(rowsAreLatin() && colsAreLatin()){
		  isValid = true;
	   }
	   else{
		   isValid = false;
	   }
	   return isValid;
	   
   }
   public boolean rowsAreLatin(){
	   boolean[] isFound = new boolean[9];
	   for(int i = 0; i < isFound.length; i++){
		   isFound[i] = false;
	   }
	   for(int i = 0; i < x.length; i++){
		   for(int k = 0; k < x[0].length; k++){
			   isFound[(Integer.parseInt(x[i][k])) - 1] = true;
		   }
		   for(int j = 0; j < x[0].length; j++){
			   if(!isFound[j]){
				   return false;
			   }
		   }
		   for(int k = 0; k < isFound.length; k++){
			   isFound[k] = false;
		   }
	   }
	   return true;
   }
   public boolean colsAreLatin(){
	   boolean[] isFound = new boolean[9];
	   for(int i = 0; i < isFound.length; i++){
		   isFound[i] = false;
	   }
	   for(int i = 0; i < x.length; i++){
		   for(int k = 0; k < x[0].length; k++){
			   isFound[(Integer.parseInt(x[k][i])) - 1] = true;
		   }
		   for(int j = 0; j < x[0].length; j++){
			   if(!isFound[j]){
				   return false;
			   }
		   }
		   for(int k = 0; k < isFound.length; k++){
			   isFound[k] = false;
		   }
	   }
	   return true;
   }
   public boolean goodSubsquares(){
	   boolean isValid = true;
	   boolean isFound[][] = new boolean[3][3];
	   for(int i = 0; i < isFound.length; i++){
		   for(int j = 0; j < isFound[0].length; j++){
			   isFound[i][j] = false;
		   }
	   }
	   for(int i = 3; i <= x.length; i += 3){
		   for(int j = (i - 1); j >= (i - 3); j--){
			   for(int k = (i - 1); k >= (i - 3); k--){
				   
			   }
		   }
	   }
	   return isValid;

   }
}
