
public class BillfoldTester {

	public static void main(String[] args) {
		
		Billfold fold1 = new Billfold();
		
		Card card1 = new DriverLicense("Derek", 2010);
		Card card2 = new IDCard("Derek", "420");
		Card card3 = new CallingCard("Matt", "1337", 42);
		Card card4 = null;
		Card card5 = new IDCard("Derek", "2010");
		
		fold1.addCard(card3);
		fold1.addCard(card1);
		//question 5 required printout
		System.out.println(fold1.formatCards());
		/*printout:
		[Card holder: Mr. Kelley, Expiration Year: 2010|Card holder: Matt, Card Number: 1337, PIN: 42]
		*/
		
		//Question 10 required printout
		System.out.println("Expired Card Count: " + fold1.getExpiredCardCount());
		/*printout:
		 Expired Card Count: 1
		 */
		
		
	}

}
