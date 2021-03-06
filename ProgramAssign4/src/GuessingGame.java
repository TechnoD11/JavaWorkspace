import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *
 */
public class GuessingGame {
	private int luckyNumber;
	private int guess;
	private String userInputString;
	private final int PRINT_SPEED = 400;
	Random rand = new Random();
	Scanner in = new Scanner(System.in);
	public GuessingGame(){
		luckyNumber = 0;
	}
	public void generateNumber(){
		luckyNumber = rand.nextInt(100);
	}
	public void parseInput(boolean gameType){ //gameType true = human player, false = computer
		if(in.hasNextDouble() && gameType == true){
			guess = (int) Double.parseDouble(in.next());
		}
		else if(in.hasNext()){
			userInputString = in.next();
		}
	}
	public boolean isInRange(boolean isPlayerHuman){
		boolean inRange = false;
		return inRange;
	}
	public void printGreeting() throws InterruptedException{
		String greeting = "Shall we play a game?";
		System.out.print(greeting.substring(0, 6));
		Thread.sleep(PRINT_SPEED);
		System.out.print(greeting.substring(6, 9));
		Thread.sleep(PRINT_SPEED);
		System.out.print(greeting.substring(9, 14));
		Thread.sleep(PRINT_SPEED);
		System.out.print(greeting.substring(14, 16));
		Thread.sleep(PRINT_SPEED);
		System.out.print(greeting.substring(16, 21));
	}
	
	
	
	 
}
