/**
 * 
 * @author Derek Wider
 *
 */
public class StackNode {
	private char info; 
	private StackNode next;

	public StackNode(char input) {
		info = input;
		next = null;
	}

	public StackNode(char val, StackNode link) {
		info = val;
		next = link;
	}

	public char getInfo() {
		return info;
	}

	public StackNode getNext() {
		return next;
	}

	public void setInfo(char val) {
		info = val;
	}

	public void setNext(StackNode ptr) {
		next = ptr;
	}
}
