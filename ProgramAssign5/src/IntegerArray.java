import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *Programming Assignment 5
 */
public class IntegerArray {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		int[] myInts = new int[100];
		for(int i = 0; i < myInts.length; i++){ //fill array with random ints
			myInts[i] = rand.nextInt(1000) + 1;
		}
		int rowSize = 0;
		for(int i = 0; i < myInts.length; i++){
			rowSize++; //formatted printer, also prints index of number
			System.out.print(i+1 + ": " + myInts[i] + "\t\t");
			if(rowSize == 6){
				System.out.println();
				rowSize = 0;
			}
		}
		
		
		double average = 0; 
		int sum = 0;
		for(int i = 0; i < myInts.length; i++){
			sum += myInts[i]; //calculate sum of ints
		}
		average = sum / 100.0; //get average
		int withinAverage = 0;
		for(int i = 0; i < myInts.length; i++){
			if(Math.abs(myInts[i] - average) <= 50 && Math.abs(myInts[i] - average) >=0){
				withinAverage++; //check to see how many members are within 50 of average
			}
		}
		System.out.println("\nThe Average of the array is: " + average + " and there are " + withinAverage + " members of the array that are within 50 of the average");
		System.out.println("Please input an integer to see if it is within the array");
		int value = in.nextInt();
		boolean containsVal = false; //check to see if the array contains the input int
		int index = 0;
		for(int i = 0; i < myInts.length; i++){
			if(myInts[i] == value){
				index = i;
				containsVal = true;
			}
		}
		if(containsVal == true){ //if it does, print index
			System.out.println("The value you inputted (" + value + ") is in the array at index " + (index + 1));	
		}
		else{ //if not, quit out
			System.out.println("The value you inputted (" + value + ") is not in the array. Sorry");
		}
	}

}
