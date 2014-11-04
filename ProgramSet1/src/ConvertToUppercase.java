/**
 * 
 * @author Derek Wider
 *
 */
public class ConvertToUppercase {

	public static void main(String[] args) {
		String originalTest = "This is a Test";
		String newTest = originalTest.toLowerCase();
		System.out.println(newTest);
		String bigTestString = newTest.toUpperCase();
		System.out.println(bigTestString);
	}

}
