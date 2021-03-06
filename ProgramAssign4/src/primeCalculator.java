import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 * Programming Assignment 4
 *Prime Generator. Calculates the number of primes between 2 and a user-inputed value, inclusive. Prints the number of checks it performed and the total number of primes generated.
 */
public class primeCalculator {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the prime calculator! Please input to what number you wish to calculate prime numbers to, ex. to 100,000");
		int primeLimit = in.nextInt(); //prompts for prime number limit
		int ROW_LIMIT = 6;
		int numberOfPrimes = 0;
		int testCounter = 0;
		int rowCounter = 0; //primitives to hold the data
		boolean isPrime = true;
		System.out.print(2 + "\t"); //print out 2, since its prime and the algorithm can be more efficient without calculating it
		rowCounter++;
		numberOfPrimes++;
		for(int i = 3; i <= primeLimit; i+=2){ //while less than the number to calculate to
			isPrime = true;
			for(int j = 3; (j <= (i/2)) && isPrime; j+=2){ //while j is less than half of i and i is still prime (yet) 
				if(i % j == 0){ //if its not prime, set prime to false
					isPrime = false;
				}
				testCounter++;
			}
			if(isPrime){ //if its prime
				numberOfPrimes++; //increase number of primes
				if(rowCounter != ROW_LIMIT){ //if it hasn't printed ROW_LIMIT numbers yet
					System.out.print(i + "\t"); //print i, the prime number
					rowCounter++; //increment down row
				}
				else{
					System.out.println(i); //if its reached the end of the row
					rowCounter = 0; //reset and start on next line
				}
			}
		}
		System.out.println("\nThe System generated: " + numberOfPrimes + " prime numbers, taking a total of: " + testCounter + " tests");
		in.close(); //print the prime Generator output, and the number of required tests. 
	}
}
