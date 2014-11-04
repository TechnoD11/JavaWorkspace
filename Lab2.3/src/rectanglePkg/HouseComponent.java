/**
 * @author Derek Wider
 */
package rectanglePkg;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class HouseComponent extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle exterior = new Rectangle(5, 50, 100, 100);
		Rectangle door = new Rectangle(45, 100, 20, 50);
		Rectangle window1 = new Rectangle(15, 65, 30, 30);
		Rectangle window2 = new Rectangle(65, 65, 30, 30);
		
		Point2D.Double point1 = new Point2D.Double(5, 50);
		Point2D.Double point2 = new Point2D.Double(105, 50);
		Point2D.Double point3 = new Point2D.Double(55, 5);
		
		Line2D.Double line1 = new Line2D.Double(point1, point3);
		Line2D.Double line2 = new Line2D.Double(point2, point3);
		
		g2.draw(exterior);
		g2.draw(door);
		g2.draw(window1);
		g2.draw(window2);
		g2.draw(line2);
		g2.draw(line1);
	}
	
}
