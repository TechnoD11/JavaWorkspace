/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 14
 * 
 */
public class DoubleNode implements TreeNode{
	private double info;
	private TreeNode next;
	
	/**
	 * Constructor
	 * @param value
	 */
	public DoubleNode(double value){
		info = value;
	}
	//Tree-specific methods follow
	
	@Override
	public double evaluate() {
		return info;
	}

	@Override
	public TreeNode getLeft() {
		return null;
	}

	@Override
	public TreeNode getRight() {
		return null;
	}

	@Override
	public void setLeft(TreeNode node) {
		
	}

	@Override
	public void setRight(TreeNode node) {
		
	}
	//Stack-specific methods below
	@Override
	public void setNext(TreeNode node) {
		next = node;
	}

	@Override
	public TreeNode getNext() {
		return next;
	}
	//Generic methods follow
	@Override
	public double getInfoNumber() {
		return info;
	}

	@Override
	public char getInfoSymbol() {
		return 0;
	}

	@Override
	public void setInfo(char operator) {
		
	}

	@Override
	public void setInfo(int number) {
		info = number;
	}
	
	@Override
	public boolean isIntegerNode() {
		return true;
	}
	
	@Override
	public String toString(){
		return info + "";
	}
}
