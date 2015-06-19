/**
 * 
 * @author Derek Wider
 * Programming Assignment 14
 * 
 * A simple Stacknode - this class is used when converting an expression to a postfix expression. Features standard stack methods, listed below. 
 * the info is of type character. All members of an expression - the digits and the operators - are stored as characters. 
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
