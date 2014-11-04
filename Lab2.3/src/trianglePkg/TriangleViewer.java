/**
 * @author Derek Wider
 */
package trianglePkg;
import javax.swing.JFrame;

public class TriangleViewer {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
        frame.setTitle("Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        TriangleComponent component = new TriangleComponent();
        frame.add(component);
 
       frame.setVisible(true);
    }
}

