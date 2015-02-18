/**
 * @author Derek Wider
 * Question 2.3
 */

import java.util.ArrayList;
import java.util.Collections;

public class BankAccountRunner {
	public static void main(String args[]) {
		
		// Put bank accounts into a list
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		//add 5 new bank accounts with varying balances
		list.add(new BankAccount(1000));
		list.add(new BankAccount(500));
		list.add(new BankAccount(9001));
		list.add(new BankAccount(420));
		list.add(new BankAccount(1337));
		
		// Call the library sort method
		Collections.sort(list);

		// Print out the sorted list
		for (int i = 0; i < list.size(); i++) {
			BankAccount b = list.get(i);
			System.out.println(b.getBalance());
		}
		/* Output:
		420.0
		500.0
		1000.0
		1337.0
		9001.0
		 */
		/* Output with reversed compareTo() values:
		9001.0
		1337.0
		1000.0
		500.0
		420.0
		 */
	}

}
