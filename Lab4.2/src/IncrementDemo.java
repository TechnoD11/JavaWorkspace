/**
 * 
 * @author Derek Wider
 * Lab 4.20
 */
public class IncrementDemo {

	public static void main(String[] args) {
		int x = 10;
		int y = -3;
		int z = Integer.MAX_VALUE;
		//Method 1:
		x = x + 1;
		System.out.println("x is: " + x + "\nExpected: 11");
		//Method 2:
		y++;
		System.out.println("y is: " + y + "\nExpected: -2");
		//Method 3:
		z++;
		System.out.println("z is: " + z + "\nExpected: -2147483648");
		//The final output of z is -2147483648 because by adding 1 to the maximum limit of an integer (2 * 10^9), the integer "rolls over" into the negative. There is no infinity in computer science ;)
	}

}
