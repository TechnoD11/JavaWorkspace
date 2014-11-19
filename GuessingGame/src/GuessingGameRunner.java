import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *
 */
public class GuessingGameRunner {

	public static void main(String[] args) throws InterruptedException {
		GuessingGame game = new GuessingGame();
		boolean isFinished = false;
		while(!isFinished){
			System.out.println("Do you want to play again? type (y)es or (n)o");
			game.parseInput();
		}
		game.printGreeting();
		
	}

}
