/**
 * @author Derek Wider
 */
package CirclePkg;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class CircleComponent extends JComponent{
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double circle40 = new Ellipse2D.Double(100, 200, 40, 40);
		Ellipse2D.Double circle80 = new Ellipse2D.Double(80, 160, 80, 80);
		Ellipse2D.Double circle120 = new Ellipse2D.Double(60, 120, 120, 120);
		Ellipse2D.Double circle160 = new Ellipse2D.Double(40, 80, 160, 160);
		Ellipse2D.Double circle200 = new Ellipse2D.Double(20, 40, 200, 200);
		
		g2.setColor(Color.BLUE);
		g2.draw(circle40);
		g2.setColor(Color.RED);
		g2.draw(circle80);
		g2.setColor(Color.GREEN);
		g2.draw(circle120);
		g2.setColor(Color.YELLOW);
		g2.draw(circle160);
		g2.setColor(Color.ORANGE);
		g2.draw(circle200);
		
		g2.setColor(Color.BLACK);
		g2.drawString("Circle Printer", 100, 30);
		
	}
}
