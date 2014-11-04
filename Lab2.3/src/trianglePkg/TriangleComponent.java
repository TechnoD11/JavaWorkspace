/**
 * @author Derek Wider
 */
package trianglePkg;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;
public class TriangleComponent extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		Point2D.Double point1 = new Point2D.Double(10, 190);
		Point2D.Double point2 = new Point2D.Double(100, 10);
		Point2D.Double point3 = new Point2D.Double(190, 190);
		
		Line2D.Double side1 = new Line2D.Double(point1, point2);
		Line2D.Double side2 = new Line2D.Double(point2, point3);
		Line2D.Double side3 = new Line2D.Double(point3, point1);
		
		g2.draw(side1);
		g2.draw(side2);
		g2.draw(side3);
	}
}
