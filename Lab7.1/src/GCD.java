/**
 * 
 * @author Derek Wider
 *
 */
import java.util.Scanner;

public class GCD
{
   public static void main(String[] args)
   {
	  String input;
      Scanner in = new Scanner(System.in);
      boolean keepCalc = true;
      while(keepCalc == true){
    	  System.out.println("Type any integer to calcuate a GCD, type 0 to stop calculating GCD's");
    	  if(in.nextInt() != 0){
            	  System.out.println("Enter the first integer: ");
                  int x = in.nextInt();
                  System.out.println("x = " + x);
                  System.out.println("Enter the second integer: ");
                  int y = in.nextInt();
                  System.out.println("y = " + y); 
            	  int large = 0;
            	  int small = 0;
                  while (x != 0 && y != 0){
                	  if(x>=y){
                		  large = x;
                		  small = y;
                		  x = large - small;
                    	  y = small;
                	  }
                	  else{
                		  large = y;
                		  small = x;
                		  y = large - small;
                    	  x = small;
                	  }
                  }
                  if(x>=y){
            		 System.out.println("The GCD is: " + x);
                  }
            	  else{
            		 System.out.println("The GCD is: " + y);
            	  }
                  keepCalc = true;
              }
              else{
            	  keepCalc = false;
              }
          }
      }
   }
   


