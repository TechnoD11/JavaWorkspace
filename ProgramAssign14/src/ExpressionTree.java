/**
 * 
 * @author Derek Wider
 *
 */
public class ExpressionTree {
	private TreeNode head;
	private int counter;
	public ExpressionTree(){
		head = null;
		counter = 0;
	}
	
	public void generateTree(String postfix){
		counter = postfix.length()-1;
	}
	private void treeRecursion(String postfix){ //maybe create an interface here
		TreeNode<T> temp = new TreeNode<T>(postfix.charAt(counter));
	}
	
}
