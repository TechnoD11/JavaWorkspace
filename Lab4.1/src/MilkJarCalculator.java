/**
 * 
 * @author Derek Wider
 *
 *The problem with this program is that it creates two floats, and tries to set an int equal to the division of the two. This is not possible, as a decimal is generated. to fix this, simply cast the division statement to an int. Thus, integer mathematics are performed on the floats, leaving only the number of full milk jars, which was the desired output.
 */
public class MilkJarCalculator {

	public static void main(String[] args) {
	      double milk = 5.5; // gallons
	      double jarCapacity = 0.75; // gallons
	      int completelyFilledJars = (int) (milk / jarCapacity);
	      
	      System.out.println("The number of full milk jars is: " + completelyFilledJars);

	}

}
