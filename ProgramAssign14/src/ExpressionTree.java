/**
 * 
 * @author Derek Wider
 *
 */
public class ExpressionTree {
	private TreeNodeGeneric headTree;
	private TreeStackNode headStack;
	public ExpressionTree(){
		headStack = null;
		headTree = null;
	}
	
	public void loadTree(String postfix){
		for(int i = 0; i < postfix.length(); i++){
			char charAt = postfix.charAt(i);
			int intVal = charAt;
			if(intVal >= 49 && intVal <= 57){
				TreeStackNodeInt temp = new TreeStackNodeInt(intVal - 48);
				temp.setNext(headStack);
				headStack = temp;
			}
			else{
				TreeNode temp = new TreeNode()
				
			}
			
			
		}
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
