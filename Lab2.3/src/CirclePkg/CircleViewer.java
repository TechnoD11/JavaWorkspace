/**
 * @author Derek Wider
 */
package CirclePkg;
import javax.swing.JFrame;

public class CircleViewer {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
        frame.setTitle("Circles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        CircleComponent component3 = new CircleComponent();
        frame.add(component3);
       frame.setVisible(true);
    }
}
