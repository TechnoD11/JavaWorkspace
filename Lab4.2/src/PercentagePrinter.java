/**
 * 
 * @author Derek Wider
 *
 */
public class PercentagePrinter {

	public static void main(String[] args) {
		double probability = 8.70;
		int percentage = (int) (100 * probability);
		System.out.println("Unmodified output: " + percentage);
		// The output of this program is 869. This is because the cast to integer always rounds any decimal down to the integer, ex. 8.70 rounded would be 8
		percentage = (int) Math.round(100*probability);
		System.out.println("Modified output: " + percentage);
	}

}
