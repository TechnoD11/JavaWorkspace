/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 14
 * 
 * 	One of the expression tree nodes, implements the TreeNode interface. Stores the digits of an expression tree, and is also used as a stack node. 
 * All methods, except basic getters/setters have documentation. 
 * 
 */
public class DoubleNode implements TreeNode{
	private double info; //stores the info as a double
	private TreeNode next; //the next node (stacks)
	
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
	/**
	 * DoubleNodes have no left or right children (they all hang at the end of a tree)
	 */
	@Override
	public TreeNode getLeft() {
		return null;
	}
	/**
	 * DoubleNodes have no left or right children (they all hang at the end of a tree)
	 */
	@Override
	public TreeNode getRight() {
		return null;
	}
	/**
	 * DoubleNodes have no left or right children (they all hang at the end of a tree)
	 */
	@Override
	public void setLeft(TreeNode node) {
		
	}
	/**
	 * DoubleNodes have no left or right children (they all hang at the end of a tree)
	 */
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
	/**
	 * This method is not used (but must be implemented as this class implements the TreeNode interface)
	 */
	@Override
	public char getInfoSymbol() {
		return 0;
	}
	/**
	 * This method is not used (but must be implemented as this class implements the TreeNode interface)
	 */
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
	/**
	 * returns the info in the form of a string, for use with the infix method of ExpressionTree
	 */
	@Override
	public String toString(){
		return info + "";
	}
}
