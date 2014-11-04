/**
 * 
 * @author Derek Wider
 * 
 * 2.1 Methods for the vending machine class would be to insert a token, add to the number of cans, and to get the token count and can count
 *
 */
public class VendingMachine {
	private int tokens;
	private int cans;
	
	public VendingMachine(int startCans, int startTokens){
		tokens = startTokens;
		cans = startCans;
	}
	public VendingMachine(int startCans){
		cans = startCans;
		tokens = 0;
	}
	public VendingMachine(){
		cans = 10;
		tokens = 0;
	}
	public void fillUp(int newCans){
		cans = cans + newCans;
	}
	public void insertToken(){
		if(cans == 0){
			System.out.println("Out of Cans, come Back Later!");
		}
		else{
			tokens++;
			cans--;
			System.out.println("Enjoy your Drink!");
		}
	}
	
	public int getCanCount(){
		return cans;
	}
	public int getTokenCount(){
		return tokens;
	}
}
