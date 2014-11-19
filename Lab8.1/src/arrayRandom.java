import java.util.Random;
import java.util.Scanner;


public class arrayRandom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("How many random numbers do you wish to generate? ");
		int numberCount = in.nextInt();
		System.out.println("What range of values for each random draw? ");
		int range = in.nextInt();
		int[] numbers = new int[numberCount];
		int[] rangeCount = new int[range];
		for(int i = 0; i <= numberCount; i++){
			numbers[i] = rand.nextInt(range) + 1;
		}
		for(int i = 0; i <= numberCount; i++){
			if(numbers[i] == i){
				rangeCount[i]++;
			}
		}
	}

}
