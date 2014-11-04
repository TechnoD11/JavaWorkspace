/**
 * @author Derek Wider
 */
package rectanglePkg;
import javax.swing.JFrame;

public class HouseViewer {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setTitle("House");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		HouseComponent component2 = new HouseComponent();
		frame.add(component2);
		
  }
}


