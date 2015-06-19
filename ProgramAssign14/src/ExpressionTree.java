import unusedClasses.TreeNodeGeneric;
import unusedClasses.TreeStackNode;
import unusedClasses.TreeStackNodeInt;

/**
 * 
 * @author Derek Wider
 *
 */
public class ExpressionTree {
	private TreeNode root; //head of the tree
	private TreeNode head; //head of the stack
	private TreeNode current;
	private TreeNode previous;
	public ExpressionTree(){
		root = null;
		head = null;
	}
	
	public void loadTree(String postfix){
		for(int i = 0; i < postfix.length(); i++){
			char charAt = postfix.charAt(i);
			int intVal = charAt;
			if(intVal >= 49 && intVal <= 57){
				DoubleNode temp = new DoubleNode(intVal - 48);
				push(temp);
				System.out.println("pushing new node with value of: " + (intVal - 48));
			}
			else{
				TreeNode temp = new OperatorNode(charAt);
				System.out.println("in operator with operator: " + charAt);
				TreeNode fromStack = pop();
				if(fromStack != null && fromStack.isIntegerNode()){
					System.out.println("just popped a " + fromStack.getInfoNumber());
				}
				else if(fromStack != null){
					System.out.println("just popped a " + fromStack.getInfoSymbol());
				}
				else{
					System.out.println("just popped a null from the stack!");
				}
				temp.setRight(fromStack);
				fromStack = pop();
				if(fromStack != null && fromStack.isIntegerNode()){
					System.out.println("just popped a " + fromStack.getInfoNumber());
				}
				else if(fromStack != null){
					System.out.println("just popped a " + fromStack.getInfoSymbol());
				}
				else{
					System.out.println("just popped a null from the stack!");
				}
				temp.setLeft(fromStack);
				push(temp);
			}
		}
		root = pop();
		System.out.println("root of the tree is: " + root.getInfoSymbol());
		current = root;
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
	public TreeNode pop(){
		if(head == null){
			return null;
		}
		TreeNode temp = head;
		head = head.getNext();
		return temp;
	}
	public double evaluate(){
		return root.evaluate();
	}
	public String infix(){
		return root.toString();
	}
	public char goLeft(){
		char val;
		if(current.getLeft() != null && !current.getLeft().isIntegerNode()){
			val = current.getLeft().getInfoSymbol();
		}
		else if(current.getLeft() != null){
			val = (char) current.getLeft().getInfoNumber();
		}
		else{
			val = 'n';
		}
		current = current.getLeft();
		return val;
	}
	public char goRight(){
		char val;
		if(current.getRight() != null && !current.getRight().isIntegerNode()){
			val = current.getRight().getInfoSymbol();
		}
		else if(current.getRight() != null){
			val = (char) current.getRight().getInfoNumber();
		}
		else{
			val = 'n';
		}
		current = current.getRight();
		return val;
	}
	public void resetTraverse(){
		current = root;
	}
	public char getCurrent(){
		return current.getInfoSymbol();
	}
	/*
	else{
		treeStackNodeChar temp = new treeStackNodeChar(charAt);
	}
	 
	 */
	
	
	
	
	

	
	
	
	
	
	
	/*
	public void generateTree(String postfix){
		counter = postfix.length()-1;
	}
	private void treeRecursion(String postfix){ //maybe create an interface here
		TreeNodeGeneric<T> temp = new TreeNodeGeneric<T>(postfix.charAt(counter));
	}
	*/
}
