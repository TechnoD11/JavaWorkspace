/**
 * 
 * @author Derek Wider
 *
 */
public class BankAccount {
	private double balance; //instance variable to hold balance
	
	public BankAccount(){ //constructs balance to 0
		balance = 0.0;
	}
	public void deposit(double amount){ //call this to deposit money into the account
		balance = balance + amount;
	}
	public void withdraw(double amount){ //call this to withdraw money from the account
		balance = balance - amount;
	}
	public double getBalance(){ // get the current balance of the account
		return balance;
	}
	public void addInterest(double rate){ //calculate the interest of the current balance, with the rate parameter in percent form (ex. 10%, pass 10 into method)
		balance = balance * ((rate/100)+1);
	}
}
