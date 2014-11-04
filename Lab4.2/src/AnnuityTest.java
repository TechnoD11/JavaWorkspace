/**
 * 
 * @author Derek Wider
 *
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class AnnuityTest {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double payment = 10000;
		double interest = .08;
		double paymentNumber = 20;
		double defaultAnnuity = calcAnnuity(payment, interest, paymentNumber);
		String roundedAnnuity = df.format(defaultAnnuity); //rounds and calculates annuity
		System.out.println("An annuity with $10000, an interest rate of .08, and 20 payments has an annuity of: $" + roundedAnnuity); //prints the default annuity
		
		System.out.println("You can also calculate your Annuity Here. \nPlease enter your Periodic Payment"); //uses the scanner to input the new annuity values
		double i = in.nextDouble();
		payment = i;
		System.out.println("Please enter your interest rate");
		i = in.nextDouble();
		interest = i;
		System.out.println("Please enter your payment count");
		i = in.nextDouble();
		
		paymentNumber = i;  
		defaultAnnuity = calcAnnuity(payment, interest, paymentNumber);
		roundedAnnuity = df.format(defaultAnnuity); //rounds and calculates the annuity
		System.out.println("Your Current Annuity is: $" + roundedAnnuity); 
		
	}
	/**
	 * \
	 * @param payment
	 * @param interest
	 * @param paymentNumber
	 * @return the annuity
	 */
	public static double calcAnnuity(double payment, double interest, double paymentNumber){
		double presentValAnnuity = (payment) * ((((Math.pow(1+interest, paymentNumber-1))-1)/interest)/(Math.pow(1+interest, paymentNumber-1))+1); 
		return presentValAnnuity;
	}
	

}
