/**Derek Wider
   Tests the savings account class.
*/
public class SavingsAccountTester
{
   public static void main(String[] args)
   {
      SavingsAccount momsSavings = new SavingsAccount(1000, 10);

      momsSavings.addInterest();
      momsSavings.addInterest();
      momsSavings.addInterest();
      momsSavings.addInterest();
      momsSavings.addInterest();

      double balance = momsSavings.getBalance();

      System.out.print("The balance is $");
      System.out.println(balance);
   }
}