import java.util.Random;

/**
 * 
 * @author Derek Wider
 *
 *This Program generates a random number between 1 and 6
 */
public class RandomGenerator {
	public static void main(String[] args) {
		Random generator = new Random(); //creates a new instance of the Random class
		int randomNumber = generator.nextInt(6) + 1; //sets an int equal to a random number between 1 and 6 
		System.out.println("Your Random Number is: " + randomNumber); //print the random number
	}
}
