/**
 * 
 * @author Derek Wider
 *
 */
public class DistanceConverter {

	public static void main(String[] args) {
		final int FEET_CONVERT = 3; //final for feet convert
		final int INCH_CONVERT = 12; //final for inch convert
		double yards = 3.5;
		double feet = yards * FEET_CONVERT;
		double inches = feet * INCH_CONVERT;
	      
		//below is the default print statement
		/*
		System.out.println(yards + "yards are" + feet + "feet");
		System.out.println(yards + "yards are" + inches + "inches");
		*/
		//and here is my modified print statement, for better readability (as requested in exercise 3.2)
		System.out.println("The number of feet in " + yards + " yards is " + feet + " feet");
		System.out.println("The number of inches in " + yards + " yards is " + inches + " inches");
		
	}

}
