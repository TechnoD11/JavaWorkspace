//A checking account that charges transaction fees.

public class CheckingAccount extends BankAccount
{  
   private static final int FREE_TRANSACTIONS = 3;
   private static final double TRANSACTION_FEE = 2.0;

   private int transactionCount;


   //Constructs a checking account with a given balance.
   public CheckingAccount(double initialBalance)
   {  
      super(initialBalance);		// Construct superclass
      transactionCount = 0; 		 // Initialize transaction count
   }

   public void deposit(double amount) 
   {  
      transactionCount++;
      super.deposit(amount); 		 // Now add amount to balance 
   }
   
   public void withdraw(double amount) 
   {  
      transactionCount++;
      super.withdraw(amount); 		// Now subtract amount from balance 
   }


   // Deducts the accumulated fees and resets the transaction count.
  
   public void deductFees()
   {  
      if (transactionCount > FREE_TRANSACTIONS)
      {  
         double fees = TRANSACTION_FEE *
               (transactionCount - FREE_TRANSACTIONS);
         super.withdraw(fees);
      }
      transactionCount = 0;
   }
}
