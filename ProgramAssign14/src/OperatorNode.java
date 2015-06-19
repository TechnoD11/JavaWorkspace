/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 14
 *
 */
public class OperatorNode implements TreeNode {
	private TreeNode left;
	private TreeNode right;
	private TreeNode next;
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

	@Override
	public double getInfoNumber() {
		return Integer.MAX_VALUE;
	}

	@Override
	public char getInfoSymbol() {
		return info;
	}

	@Override
	public void setInfo(int number) {
		
	}
	
	@Override
	public String toString(){
		return "(" + getLeft().toString() + info + getRight().toString() + ")";
	}

}
