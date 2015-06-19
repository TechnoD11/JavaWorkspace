/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 14
 *
 */
public interface TreeNode {
	public double evaluate();
	public TreeNode getLeft();
	public TreeNode getRight();
	public void setLeft(TreeNode node);
	public void setRight(TreeNode node);
	public double getInfoNumber();
	public char getInfoSymbol();
	void setInfo(char operator);
	void setInfo(int number);
	
	public void setNext(TreeNode node);
	public TreeNode getNext();
	public boolean isIntegerNode();
	public String toString();
}
