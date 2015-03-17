import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author Derek Wider
 * Lab 11.2
 *
 */
public class RectangleRunner {

	public static void main(String[] args) {
		
		ArrayList<Rectangle> myList = new ArrayList<Rectangle>();
		Rectangle rect1 = new Rectangle(5, 10, 20, 30); 
		Rectangle rect2 = new Rectangle(10, 20, 30, 15); 
		Rectangle rect3 = new Rectangle(20, 30, 45, 10);  
		myList.add(rect2);
		myList.add(rect1);
		myList.add(rect3); //constructs and adds 3 rectangles. used for both 1.4 and 1.5
		
		//Code for 1.4 below
		Comparator<Rectangle> myComparator1 = new RectangleComparator();
		Collections.sort(myList, myComparator1); //constructs a new RectangleComparator which implements the Comparator interface
		//Collections.sort uses the compare method of the Comparator interface to sort a list

		//code for 1.5 below
		/*
		 * This constructs an anonymous class, which is constructed inside a method.
		 */
		Comparator<Rectangle> myComparator2 = new Comparator<Rectangle>() {

			public int compare(Rectangle r1, Rectangle r2) {
				 if((r1.getHeight() * r1.getWidth()) > (r2.getHeight() * r2.getWidth())){
					   return 1;
				   }
				   else if((r1.getHeight() * r1.getWidth()) < (r2.getHeight() * r2.getWidth())){
					   return -1;
				   }
				   else{
					   return 0;
				   }
			}
		};
		//uncomment or comment either of the Collections.sort() methods to see either program work.
		//Collections.sort(myList, myComparator2);
		
		//below code prints out the expected and generated values
		System.out.println("Expected Values (rectangle and area): \nrect2 = 450 \nrect3 = 450 \nrect1 = 600");
		System.out.println("Generated values (area only):\n");
		for(int i = 0; i < myList.size(); i++){ //print out expected and generated values
			System.out.println(myList.get(i).getHeight()*myList.get(i).getWidth());
		}
		
		
		
	}

}
