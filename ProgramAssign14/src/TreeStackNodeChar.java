/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 14
 *
 */
public class TreeStackNodeChar implements TreeStackNode{
	private char info;
	private TreeStackNode next;
	
	public TreeStackNodeChar(char val){
		info = val;
		next = null;
	}
	
	@Override
	public void setNext(TreeStackNode node) {
		next = node;
	}

	@Override
	public TreeStackNode getNext() {
		return next;
	}

	public void setInfo(char newVal) {
		info = newVal;
	}

	@Override
	public boolean isIntegerNode() {
		return false;
	}
	
	public char getInfo(){
		return info;
	}
}
