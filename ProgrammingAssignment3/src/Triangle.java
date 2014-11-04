/**
 * 
 * @author Derek Wider
 *
 */
public class Triangle {
	private final int NUM_SIDES = 3;
	private int sides[] = new int[NUM_SIDES]; //creates an array to store the sides
	
	public Triangle(int first, int second, int third){ //constructor, takes the three sides
		sides[0] = first;
		sides[1] = second;
		sides[2] = third;
	}
	public boolean isRight(){ //checks if its right
		return ((Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) ||  
				(Math.pow(sides[1], 2) + Math.pow(sides[2], 2) == Math.pow(sides[0], 2)) || 
				(Math.pow(sides[2], 2) + Math.pow(sides[0], 2) == Math.pow(sides[1], 2))); //checks each side using pythagorean theorem
	}
	public boolean isScalene(){ //checks if its scalene
		return (sides[0] != sides[1] && sides[0] != sides[2] && sides[1] != sides[2]); //checks to see if the sides are not equal
	}
	public boolean isIsosceles(){ //checks if its isosceles
		return ((sides[0] == sides[1] && sides[2] !=sides[0]) || 
				(sides[1] == sides[2] && sides[2] !=sides[0]) || 
				(sides[0] == sides[2] && sides[2] !=sides[1])); //checks if any two sides are equal
	}
	public boolean isEquilateral(){ //checks if its equilateral
		return(sides[0] == sides[1] && sides[1] == sides[2] && sides[0] == sides[2]); //checks if the sides are equal
	}
}

