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
		n--; //decrement first, allows recursion
		if(n <= 1){ //if its less than or equal to 1, return 1 (base case)
			return 1;
		}
		return n * getCount(); //n * getCount() is recursion, returns n * (n-1) * (n-2)...
	}
	public long getCountIterative(){ 
		n--; //decrement first, because of recursion
		long perm = 1;
		for(int i = n; i > 0; i--){ //iterate through n numbers
			perm = perm * i; //multiply by each
		}
		return perm; 
	}
}
