import java.util.Scanner;

/**FOR SOCCER DATA AND ROOM: use loops, one set at a time
 * 
 * @author Derek Wider
 * Programming Assignment 3
 */
public class TriangleRunner {

	public static void main(String[] args) {
		int side1, side2, side3; //creates 3 ints to hold the sides
		Scanner in = new Scanner(System.in); //scanner
		
		System.out.println("Please enter the first side");
		side1 = in.nextInt(); //gets first side

		System.out.println("Please enter the second side");
		side2 = in.nextInt(); //gets second side

		System.out.println("Please enter the third side");
		side3 = in.nextInt(); //gets third side
		
		Triangle tri = new Triangle(side1, side2, side3); //construct a triangle
		if(tri.isRight()){ //check if right, and print result
			System.out.println("The triangle is a right triangle");
		}
		else{
			System.out.println("The triangle is not a right triangle");
		}
		if(tri.isEquilateral()){ //check if equilateral, and print result
			System.out.println("The triangle is an equilateral triangle");
		}
		else{
			System.out.println("The triangle is not an equilateral triangle");
		}
		if(tri.isIsosceles()){ //check if isosceles, and print result
			System.out.println("The triangle is an isosceles triangle");
		}
		else{
			System.out.println("The triangle is not an isosceles triangle");
		}
		if(tri.isScalene()){ //check if scalene, and print result
			System.out.println("The triangle is a scalene triangle");
		}
		else{
			System.out.println("The triangle is not a scalene triangle");
		}
	}
}
	
