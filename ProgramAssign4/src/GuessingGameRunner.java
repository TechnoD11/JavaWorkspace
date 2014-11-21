import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *
 */
public class GuessingGameRunner {

	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		printGreeting();
		boolean playGame = false;
		if(in.next() != ""){
			playGame = true;
		}
		
		boolean isFinished = false;
		int guess = 0;
		int randomNumber = 0;
		int numberOfGuesses = 0;
		String userInputString = "";
		
		while(!isFinished && playGame){
			System.out.println("Who will be guessing the number? Type (c) for computer or (h) for human.");
			String input = in.next();
			if(input.equals("h")){
				randomNumber = rand.nextInt(101);
				boolean isCorrect = false;
				while(!isCorrect){
					System.out.println("Please input a number to guess, between 0 and 100");
					guess = in.nextInt();
					if(guess < 0 || guess > 100){
						System.out.println("Your guess is out of the range! make sure your guess is between 0 and 100");
					}
					else{
						if(guess > randomNumber){
							System.out.println("Your guess (" + guess +  ") is too high! Try guessing lower");
							numberOfGuesses++;
						}
						else if(guess < randomNumber){
							System.out.println("Your guess (" + guess + ") is too low! try guessing higher");
							numberOfGuesses++;
						}
						else{
							numberOfGuesses++;
							isCorrect = true;
							System.out.println("Congradulations, you guessed the random number (" + randomNumber + "). It took you " + numberOfGuesses + " tries to guess the number");
						}
					}
				}
				
				
			}
			else{
				
				/*System.out.println("");
				boolean isCorrect = false;
				while(!isCorrect){
					*/
			}
			System.out.println("Would you like to play again? ");
		}
			
	}
		
		
	public static void printGreeting() throws InterruptedException{
		final int PRINT_SPEED = 400;
		String greeting = "Shall we play a game?";
		System.out.print(greeting.substring(0, 6));
		Thread.sleep(PRINT_SPEED);
		System.out.print(greeting.substring(6, 9));
		Thread.sleep(PRINT_SPEED);
		System.out.print(greeting.substring(9, 14));
		Thread.sleep(PRINT_SPEED);
		System.out.print(greeting.substring(14, 16));
		Thread.sleep(PRINT_SPEED);
		System.out.println(greeting.substring(16, 21));
	}
}
	/*public static void parseInput(boolean gameType){ //gameType true = human player, false = computer
		if(in.hasNextDouble() && gameType == true){
			guess = (int) Double.parseDouble(in.next());
		}
		else if(in.hasNext()){
			userInputString = in.next();
		}
	}

}
/*
private int luckyNumber;
private int guess;
private String userInputString;

Random rand = new Random();
Scanner in = new Scanner(System.in);
public GuessingGame(){
	luckyNumber = 0;
}
public void generateNumber(){
	luckyNumber = rand.nextInt(100);
}

public boolean isInRange(boolean isPlayerHuman){
	boolean inRange = false;
	return inRange;
}
public void printGreeting() throws InterruptedException{
	
}*/