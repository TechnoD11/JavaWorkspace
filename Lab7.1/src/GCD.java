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
      Scanner in = new Scanner(System.in);
      boolean keepCalc = true; 
      while(keepCalc == true){ //if the user wants to calc more GCD's...
    	  System.out.println("Type any integer to calcuate a GCD, type 0 to stop calculating GCD's");
    	  if(in.nextInt() != 0){ //sentinel character is 0, if read, quit
            	  System.out.println("Enter the first integer: ");
                  int x = in.nextInt();
                  System.out.println("x = " + x);
                  System.out.println("Enter the second integer: ");
                  int y = in.nextInt();
                  System.out.println("y = " + y); //get integers to find GCD of
            	  int large = 0;
            	  int small = 0; //temps to hold the larger value
                  while (x != 0 && y != 0){
                	  if(x>=y){ //while not 0, find the larger value
                		  large = x;
                		  small = y; //store current values
                		  x = large - small;
                    	  y = small; //subtract short from long
                	  }
                	  else{
                		  large = y;
                		  small = x; //store current values, opposite from above
                		  y = large - small;
                    	  x = small; //subtract short from long
                	  }
                  }
                  if(x>=y){ //if x is GCD, print X
            		 System.out.println("The GCD is: " + x);
                  }
            	  else{ //if not, print y
            		 System.out.println("The GCD is: " + y);
            	  }
                  keepCalc = true;
              }
              else{ //keep calculating unless the user tells it to stop
            	  keepCalc = false;
              }
          }
      }
   }
   


