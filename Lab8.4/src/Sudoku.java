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
	   boolean isValid = true;
	   
	   return isValid;
   }
}
