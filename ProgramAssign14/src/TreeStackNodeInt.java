/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 14
 *
 */
public class TreeStackNodeInt implements TreeStackNode{
	private TreeStackNode next;
	private int info;
	
	public TreeStackNodeInt(int value){
		next = null;
		info = value; 
	}
	
	@Override
	public void setNext(TreeStackNode node) {
		next = node;
	}

	@Override
	public TreeStackNode getNext() {
		return next;
	}

	public void setInfo(int value) {
		info = value;
	}

	@Override
	public boolean isIntegerNode() {
		return true;
	}
	
	public int getInfo(){
		return info;
	}

}
