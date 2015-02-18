/**
 * 
 * @author Derek Wider
 *	Code for Question 2.2
 */
public class BankAccount implements Comparable<BankAccount> {
	private double balance;
	
	public BankAccount(double balance){
		this.balance = balance;
	}
	
	/**
	 * Compares two bank accounts.
	 * 
	 * @param other
	 *            the other BankAccount
	 * @return 1 if this bank account has a greater balance than the other one,
	 *         -1 if this bank account is has a smaller balance than the other
	 *         one, and 0 if both bank accounts have the same balance
	 */
	public int compareTo(BankAccount other) {
		double compareVal = 0;
		compareVal = balance - other.getBalance();
		if(compareVal > 0){
			return -1;
		}
		else if(compareVal < 0){
			return 1;
		}
		else{
			return 0;
		}
	}
	public double getBalance(){
		return balance;
	}
}
