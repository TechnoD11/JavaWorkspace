

/**
 * 
 * @author Derek Wider
 * Programming Assignment 14
 * 
 * 	This class handles the loading and manipulation of the expression tree. The Tree is loaded using a postfix expression (see loadTree() ). 
 * The tree can then be evaluated, and the infix expression of the tree can be generated. 
 * 
 * The stack portion of the class can also be pushed/popped. 
 */
public class ExpressionTree {
	private TreeNode root; //head of the tree
	private TreeNode head; //head of the stack
	/**
	 * Constructor. Sets the stack and the tree to null
	 */
	public ExpressionTree(){
		root = null;
		head = null;
	}
	/**
	 * 	Loads an expression tree from a postfix String. 
	 * 	Works by using a stack. I'll explain here:
	 * 	First, a for loop iterates the length of the postfix expression (beginning to end of string). 
	 * 	The character at this point in the postfix is then found.
	 * 	If the character is a number (1-9), then it is loaded into a DoubleNode (implements TreeNode) and pushed into the stack.
	 * 	If the character is an operator:
	 * 		A new operator node (implements TreeNode) is created with the operator as the info.
	 * 		Then the stack is popped, and the node from the stack is set to the right child of the new node
	 * 		The stack is then popped again, and this node is attached to the left child of the new node
	 * 		Then, the OperatorNode that was just created is pushed into the stack. 
	 * This process repeats until the end of the string is reached.
	 * By then, there should only be one node in the stack, which is also conveniently the root of the expression tree. 
	 * The last line assigns the root of the tree to last node in the stack. 
	 * @param postfix
	 */
	public void loadTree(String postfix){
		for(int i = 0; i < postfix.length(); i++){
			char charAt = postfix.charAt(i);
			int intVal = charAt;
			if(intVal >= 49 && intVal <= 57){
				DoubleNode temp = new DoubleNode(intVal - 48);
				push(temp);
			}
			else{
				TreeNode temp = new OperatorNode(charAt);
				TreeNode fromStack = pop();
				temp.setRight(fromStack);
				fromStack = pop();
				temp.setLeft(fromStack);
				push(temp);
			}
		}
		root = pop();
	}
	
	/**
	 * Pushes an item into the stack. Takes in a character (operator) and pushes it. 
	 * @param input
	 */
	public void push(TreeNode node){
		if(head != null){
			node.setNext(head);
		}
		head = node;
	}
	/**
	 * Pops an item from the stack. 
	 * @return
	 */
	public TreeNode pop(){
		if(head == null){
			return null;
		}
		TreeNode temp = head;
		head = head.getNext();
		return temp;
	}
	/**
	 * Evaluates this tree. Calls the evaluates of the nodes in the tree. Yes, this evaluates in just one line. 
	 * @return the evaluation of the tree
	 */
	public double evaluate(){
		return root.evaluate();
	}
	/**
	 * Prints an infix representation of this expression (with parenthesis). Calls the toStrings() of the nodes in the tree. 
	 * @return the infix expression
	 */
	public String infix(){
		return root.toString();
	}
}