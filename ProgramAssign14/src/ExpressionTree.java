/**
 * 
 * @author Derek Wider
 *
 */
public class ExpressionTree {
	private TreeNodeGeneric head;
	private int counter;
	public ExpressionTree(){
		head = null;
		counter = 0;
	}
	
	public void generateTree(String postfix){
		counter = postfix.length()-1;
	}
	private void treeRecursion(String postfix){ //maybe create an interface here
		TreeNodeGeneric<T> temp = new TreeNodeGeneric<T>(postfix.charAt(counter));
	}
	
}
