/**
 * 
 * @author Derek Wider
 *
 */
import java.awt.Rectangle;
public class RectanglePrinter {
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(0,0,100,50);
		Rectangle r2 = r1;
		r2.grow(10, 20);
		System.out.println(r1);
		System.out.println(r2);
	}
}
/*
 * The output of the program with Rectangle r2 = new Rectangle(r1) is this:

java.awt.Rectangle[x=0,y=0,width=100,height=50]
java.awt.Rectangle[x=-10,y=-20,width=120,height=90]

The output of the program with Rectangle r2 = r1 is this:

java.awt.Rectangle[x=-10,y=-20,width=120,height=90]
java.awt.Rectangle[x=-10,y=-20,width=120,height=90]

*/