//This program simulates casting a die ten times.


public class DieSimulator
{
   public static void main(String[] args)
   {
      Die d = new Die(5);
      final int TRIES = 12000;
      int c =0; 
      for (int i = 1; i <= TRIES; i++)
      {  
         int n = d.cast();
         //System.out.print(n + " ");
         //if (i % 20==0)      System.out.println();
         if (n == 4) c++;

      }
      System.out.println( "\n\ncount is " +c);
   }
}
