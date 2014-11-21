import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *Programming Assignment 4
 *
 *Guessing Game. Either the Computer or the User can guess between 0 and 100 (inclusive) and have the opposite respond with too high, too low, or correct. Reports the number of times needed to guess the correct number
 */
public class GuessingGameRunner {

	public static void main(String[] args) throws InterruptedException { 
		Scanner in = new Scanner(System.in); //new scanner to take user data
		Random rand = new Random(); //used for generating computer randoms
		printGreeting(); //print the greeting, method below
		boolean playGame = false;
		if(!in.next().equalsIgnoreCase("")){ //if the user types anything
			playGame = true; //run the game
		}
		
		boolean isFinished = false;
		boolean isCorrect = false;
		int guess = 0;
		int ceil = 100;
		int floor = 0;
		int randomNumber = 0;
		int numberOfGuesses = 0;
		String userInputString = ""; //variables to store the status of the game and the computer/user values
		
		while(!isFinished && playGame){ //while the user wants to keep playing
			System.out.println("Who will be guessing the number? Type (c) for computer or (h) for human."); //prompt for game type
			String input = in.next();
			if(input.equalsIgnoreCase("h")){ //if human is guessing
				randomNumber = rand.nextInt(101); //generate random number
				while(!isCorrect){ //while not correct
					System.out.println("Please input a number to guess, between 0 and 100");
					guess = in.nextInt(); //ask and receive human guess
					if(guess < 0 || guess > 100){ //check to make sure the guess is within range
						System.out.println("Your guess is out of the range! make sure your guess is between 0 and 100");
					}
					else{
						if(guess > randomNumber){ //if guess is too high
							System.out.println("Your guess (" + guess +  ") is too high! Try guessing lower");
							numberOfGuesses++;
						}
						else if(guess < randomNumber){ //if guess is too low
							System.out.println("Your guess (" + guess + ") is too low! try guessing higher");
							numberOfGuesses++;
						}
						else{
							numberOfGuesses++; //if the guess is equal, ie the user guessed correctly
							isCorrect = true;
							System.out.println("Congradulations, you guessed the random number (" + randomNumber + "). It took you " + numberOfGuesses + " tries to guess the number");
						}
					}
				}
				
				
			}
			else{
				System.out.println("Think of a number for the computer to guess, between 0 and 100, inclusive. When ready to proceed, type (r)eady!");
				if(in.next().equalsIgnoreCase("r")){ //wait until user has number for computer to guess
					isCorrect = false;
					guess = 50; //starting guess
					while(!isCorrect){ //while not correct
						System.out.println("The Computer guesses " + guess + ". If too low, type (l)ow. If too high, type (h)igh. If correct, type (c)orrect"); //tell user the guess, and prompt for response
						userInputString = in.next();
						if(userInputString.equalsIgnoreCase("l")){
							floor = guess; //if user says its too low, raise guess
							guess = (int) Math.round(guess + (ceil - floor)/2.0);
							numberOfGuesses++;
						}
						else if(userInputString.equalsIgnoreCase("h")){
							ceil = guess; //if user says its too high, lower guess
							guess = (int) Math.round(guess - Math.ceil((ceil - floor)/2.0)); //ceil() is used here to prevent round() from rounding down, preventing a 0 answer 
							numberOfGuesses++; 
						}
						else if(userInputString.equalsIgnoreCase("c")){
							isCorrect = true; //if the computer is correct
							numberOfGuesses++;
							System.out.println("The Computer won! The Computer guessed your number (" + guess + ") in " + numberOfGuesses + " tries"); //print game stats
						}
						else{
							System.out.println("Please input a valid response"); //if user inputs invalid response
						}
					}
				}
			}
			System.out.println("Would you like to play again? Type (y)es to play again or (n)o to stop");
			userInputString = in.next(); //prompt for another game
			if(userInputString.equalsIgnoreCase("y")){
				isFinished = false; //if yes, isFinished is still false
				numberOfGuesses = 0;
			}
			else{
				isFinished = true;
				System.out.println("Thanks for playing our game"); //exit and thank for playing
				in.close(); //close printStream
			}
		}
			
	}
	public static void printGreeting() throws InterruptedException{
		final int PRINT_SPEED = 400;
		String greeting = "Shall we play a game?"; //separate string into substrings (saves memory over several strings). Print each substring every PRINT_SPEED milliseconds. Prints "Shall We Play A Game?", 
		System.out.print(greeting.substring(0, 6)); //			the famous quote from the movie "WarGames"
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