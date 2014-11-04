/**
 * 
 * @author Derek Wider
 *Programming Assignment 2
 */
public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount derek = new BankAccount(); //construct a new bank account
		derek.deposit(1000); //deposit 1000 into my bank account
		derek.withdraw(500); //withdraw 500 from my bank account
		derek.withdraw(400); //withdraw 400 from my bank account
		System.out.println("The remaining balance in derek's account is: $" + derek.getBalance() + "\nExpected: $100"); //print the remaining balance, and the expected balance
		
		BankAccount susan = new BankAccount(); //constructs another bank account
		susan.deposit(1000); //deposits 1000 into this account
		susan.addInterest(10); //calculates a 10% interest
		System.out.println("\nThe Balance, after interest, in susan's account is: $" + susan.getBalance() + "\nExpected: $1100");//prints the remaining balance, and the expected balance
	}

}
