import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo
{
   public static void main(String[] args)
 {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				while (true) {
					System.out.println();
				}
			}
		};
		Thread t = new Thread(run);
		t.start();
	}

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
     /* Rectangle rect1 = new Rectangle(5, 10, 20, 30); 
      Rectangle rect2 = new Rectangle(10, 20, 30, 15); 
      Rectangle rect3 = new Rectangle(20, 30, 45, 10);  

      // Put the rectangles into a list 
      ArrayList<Rectangle> list = new ArrayList<Rectangle>(); 
      list.add(rect1);
      list.add(rect2);
      list.add(rect3);

     // Call the library sort method 
      Collections.sort(list);  

      // Print out the sorted list 
      for (int i = 0; i < list.size(); i++) 
      {
         Rectangle r = list.get(i); 
         System.out.println(r.getWidth() + " " + r.getHeight()); 
      }*/
   }

