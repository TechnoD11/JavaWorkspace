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
		for(int i = 0; i < myInts.length; i++){
			myInts[i] = rand.nextInt(1000) + 1;
		}
		int rowSize = 0;
		for(int i = 0; i < myInts.length; i++){
			rowSize++;
			System.out.print(i+1 + ": " + myInts[i] + "\t\t");
			if(rowSize == 6){
				System.out.println();
				rowSize = 0;
			}
		}
		
		
		double average = 0; //needs to be double
		int sum = 0;
		for(int i = 0; i < myInts.length; i++){
			sum += myInts[i];
		}
		average = sum / 100.0;
		int withinAverage = 0;
		for(int i = 0; i < myInts.length; i++){
			if(Math.abs(myInts[i] - average) <= 50 && Math.abs(myInts[i] - average) >=0){
				withinAverage++;
			}
		}
		System.out.println("\nThe Average of the array is: " + average + " and there are " + withinAverage + " members of the array that are within 50 of the average");
		System.out.println("Please input an integer to see if it is within the array");
		int value = in.nextInt();
		boolean containsVal = false;
		int index = 0;
		for(int i = 0; i < myInts.length; i++){
			if(myInts[i] == value){
				index = i;
				containsVal = true;
			}
		}
		if(containsVal == true){
			System.out.println("The value you inputted (" + value + ") is in the array at index " + (index + 1));	
		}
		else{
			System.out.println("The value you inputted (" + value + ") is not in the array. Sorry");
		}
	}

}