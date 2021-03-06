/**
 * @author Derek Wider
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class OrderRunner {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##"); //for formatting price
		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to calculate the cost using the first rate discout program (assignment 1.1)? type true for yes, false for no and proceed with second discount program");
		boolean isUnitDiscount = in.nextBoolean(); //gets discount type to apply, first or second
		System.out.println("Enter the Undiscounted Unit Price (in dollar format, ex 1.25 for dollar 25: ");
		double price = in.nextDouble(); //gets unit price
		Order myOrder = new Order(price*100); //constructs a new order
		System.out.println("Please enter the number of units to purchase: ");
		int widgets = in.nextInt();//gets unit total
		myOrder.addWidgets(widgets);//adds to program
		
		double finalPrice =  Double.parseDouble(df.format(myOrder.getTotalPrice(isUnitDiscount)));
		//parses final price from string to double for readability
		System.out.println("Your Total Price is: $" + finalPrice); //prints total price
	}
	/* 1.3:
	 * 2000 widgets = $1900
	 * 14000 widgets =$7700 
	 * 18000 widgets =$8550
	 */

}
