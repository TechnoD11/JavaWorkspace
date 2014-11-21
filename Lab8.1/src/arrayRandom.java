/**
 * @author Derek Wider
 * Lab 8.1
 */
import java.util.Random;
import java.util.Scanner;


public class arrayRandom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("How many random numbers do you wish to generate? ");
		int numberCount = in.nextInt(); //Get the number of numbers to generate
		System.out.println("What range of values for each random draw? ");
		int range = in.nextInt(); //Get the range with which to generate between
		int[] rangeCount = new int[range]; //create a new array of size range
		for(int i = 0; i< range; i++){ //assign all array values to 0
			rangeCount[i] = 0;
		}
		for(int i = 0; i<=numberCount; i++){ //iterate from 0 to the number of numbers to generate
			int randomNumber = rand.nextInt(range); //get a random number within the range
			rangeCount[randomNumber]++; //iterate the counter at that point
		}
		for(int i = 0; i < range; i++){ //iterate within the range
			System.out.println(i + "\t" + rangeCount[i]); //print the counters in the array at these points
		}
		in.close(); //close the scanner
	}

}
