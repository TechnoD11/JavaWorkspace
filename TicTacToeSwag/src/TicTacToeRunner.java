/*
 * Willie Wider
 * Period 4
 * Created whenever Mr. Kelly made it
 * Last Modified on 12/19/2013 @ 4:49 PM
 * This is the TicTacToe Class Runner. It alows the user to
 * play a game of tic tac toe.
 */
import java.util.Scanner;
/**
   This program runs a TicTacToe game. It prompts the
   user to set positions on the board and prints out the
   result.
*/
public class TicTacToeRunner
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String player = "x";
      TicTacToe game = new TicTacToe();
      boolean done = false;
      while (!done)
      {
         System.out.print(game.toString()); 
         System.out.print(
               "Row for " + player + " (-1 to exit): ");
         int row = in.nextInt();
         if (row < 0) done = true;
         else
         {
            System.out.print("Column for " + player + ": ");
            int column = in.nextInt();
            game.set(row, column, player);
            if (player.equals("x")) 
               player = "o"; 
            else 
               player = "x";    
         }
      }
      done=false;
      //after the person says they want to quit, ask them if they
      //want the board flipped in either direction, or not at all
      System.out.println("Flip Horizontaly or Verticaly?");
      System.out.println("0-Quit,1-Horizontaly,2-Verticaly");
      int answer = in.nextInt();
      if(answer==1)System.out.println(game.flipHorizontal());
      if(answer==2)System.out.println(game.flipVertical());
   }
}
