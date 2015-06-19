/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 14
 *
 *	One of the two TreeNode nodes - this and DoubleNode implement the TreeNode interface. These nodes can be used in both stacks and trees. 
 *	All methods except basic getters/setters are documented. 
 */
public class OperatorNode implements TreeNode {
	private TreeNode left; //the left node
	private TreeNode right; //the right node
	private TreeNode next; //the next node (stacks)
	private char info;
	/**
	 *  Constructor
	 * @param operator
	 */
	public OperatorNode(char operator){
		info = operator;
		left = null;
		right = null;
		next = null;
	}
	
	//Expression Tree methods below:
	/**
	 * Evaluates this node. Gets the digits in the left and right nodes and performs the correct operation, depending on the operator type stored in info. 
	 */
	@Override
	public double evaluate() {
		double eval;
		switch(info){
			case '/': eval = (getLeft().evaluate() / getRight().evaluate()); break;
			case '*': eval = (getLeft().evaluate() * getRight().evaluate()); break;
			case '-': eval = (getLeft().evaluate() - getRight().evaluate()); break;
			case '+': eval = (getLeft().evaluate() + getRight().evaluate()); break;
			case '^': eval = (Math.pow(getLeft().evaluate(), getRight().evaluate())); break;
			default : eval = 0; break;
		}
		return eval;
	}
	
	@Override
	public TreeNode getLeft() {
		return left;
	}

	@Override
	public TreeNode getRight() {
		return right;
	}

	@Override
	public void setLeft(TreeNode node) {
		left = node;
	}

	@Override
	public void setRight(TreeNode node) {
		right = node;
	}

	//End Expression Tree methods
	//Stack methods below
	
	@Override
	public void setNext(TreeNode node) {
		next = node;
	}

	@Override
	public TreeNode getNext() {
		return next;
	}
	
	//Generic methods Below
	@Override
	public boolean isIntegerNode() {
		return false;
	}
	
	@Override
	public void setInfo(char operator) {
		info = operator;
	}
	/**
	 * This method is not used (but must be implemented as this class implements the TreeNode interface)
	 */
	@Override
	public double getInfoNumber() {
		return Integer.MAX_VALUE;
	}

	@Override
	public char getInfoSymbol() {
		return info;
	}
	/**
	 * This method is not used (but must be implemented as this class implements the TreeNode interface)
	 */
	@Override
	public void setInfo(int number) {
		
	}
	/**
	 * Generates a string representation of this node. gets the left node, the operator, and the right node and concatenates the expression between parenthesis. 
	 */
	@Override
	public String toString(){
		return "(" + getLeft().toString() + info + getRight().toString() + ")";
	}

}
