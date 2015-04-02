/**
 * 
 * @author Derek Wider
 * APCS Lab 18.1
 */
public class PermutationTester {

	public static void main(String[] args) {
		
		PermutationCounter count5 = new PermutationCounter(5); //construct a new permutation for 5
		System.out.println(count5.getCount());  //get the recursion count 
		/* OUTPUT:
		 * 120
		 */
		PermutationCounter count6 = new PermutationCounter(6); //construct a new permutation for 6
		System.out.println(count6.getCount()); //get the recursion count 
		/* OUTPUT
		 * 720
		 */
		PermutationCounter count7 = new PermutationCounter(7);
		System.out.println(count7.getCountIterative());
		/* OUTPUT:
		 * 5040
		 */
	}

}
