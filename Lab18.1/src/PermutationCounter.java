/**
 * 
 * @author Derek Wider
 * APCS Lab 18.1
 */
public class PermutationCounter {
	private int n; //holds the number of items
	
	public PermutationCounter(int numberOfItems){
		n = numberOfItems + 1; //add 1 to allow recursion
	}
	
	public long getCount(){
		n--; //decriment first, allows recursion
		if(n <= 1){ //if its less than or equal to 1, return 1 (base case)
			return 1;
		}
		return n * getCount(); //n * getCount() is recursion, returns n * (n-1) * (n-2)...
	}
	public long getCountIterative(){
		n--;
		long perm = 1;
		for(int i = n; i > 0; i--){
			perm = perm * i;
		}
		return perm;
	}
}
