/**
 * @author Derek Wider
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class OrderRunner {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Undiscounted Unit Price (in dollar format, ex 1.25 for dollar 25: ");
		double price = in.nextDouble();
		Order myOrder = new Order(price*100);
		System.out.println("Please enter the number of units to purchase: ");
		int widgets = in.nextInt();
		myOrder.addWidgets(widgets);
		
		double finalPrice =  Double.parseDouble(df.format(myOrder.getTotalPrice()));
		
		System.out.println("Your Total Price is: $" + finalPrice);
	}
	/* 1.3:
	 * 2000 widgets = $1900
	 * 14000 widgets =$7700 
	 * 18000 widgets =$8550
	 */

}
