/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 14
 *
 *	This is an interface for the nodes that are implemented in the ExpressionTree Class. By using an interface, I can call methods on either type of node. This allows me to write
 *	recursive methods very easily. For example, see my evaluate method in the ExpressionTree class - it's only 1 line, thanks to this interface. 
 *
 *	The TreeNode Class is multidisciplinary - the nodes are designed to be used in stacks and trees, and are loaded as both. See ExpressionTree loadTree() method for more details as to why this 
 *is the case
 */
public interface TreeNode {
	//TREE METHODS BELOW
	public double evaluate(); //evaluates this node
	public TreeNode getLeft(); //gets the left node
	public TreeNode getRight(); //gets the right node
	public void setLeft(TreeNode node); //sets the left node
	public void setRight(TreeNode node); //sets the right node
	//GENERIC METHODS BELOW (used in both tree and stack)
	public double getInfoNumber(); //get the info of a number node (for use with number nodes only)
	public char getInfoSymbol(); //get the info of a symbol node (for use with symbol nodes only)
	void setInfo(char operator); //sets the info of a operator node (for use with symbol nodes only)
	void setInfo(int number); //sets the info of a number node (for use with number nodes only)
	public boolean isIntegerNode(); //for determining if the node is an integer node or not
	public String toString(); //generates a string representation of the node's info (and if symbol node, its left and right children)
	//STACK METHODS BELOW
	public void setNext(TreeNode node); //sets the pointer to the next node (for when using the stack capability)
	public TreeNode getNext(); //gets the next node in the stack
	
}
