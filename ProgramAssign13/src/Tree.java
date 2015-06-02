/**
 * 
 * @author Derek
 * Programming Assignment 13
 */
public class Tree<T extends Comparable<T>> {
	private Node<T> root;
	private Node<T> current;
	private Node<T> previous;
	/**
	 * 
	 */
	public Tree(){
		root = null;
		current = null;
		previous = null;
	}
	/**
	 * 
	 * @param val
	 */
	public void delete(T val){
		find(val);
		if(previous.getLeft() == null && previous.getRight() == null){
			deleteNoKids();
		}
		else if(previous.getLeft() == null && previous.getRight() != null){
			deleteOneKid();
		}
		else if(previous.getLeft() != null && previous.getRight() == null){
			deleteOneKid();
		}
		else{
			deleteTwoKids();
		}
	}
	/**
	 * 
	 */
	private void deleteNoKids(){
		if(previous.getLeft().getInfo().compareTo(current.getInfo()) == 0){
			previous.setLeft(null);
		}
		else{
			previous.setRight(null);
		}
	}
	/**
	 * 
	 */
	private void deleteOneKid(){
		if(previous.getLeft().getInfo().compareTo(current.getInfo()) == 0){
			if(current.getLeft() == null){
				previous.setLeft(current.getRight());
			}
			else{
				previous.setLeft(current.getLeft());
			}
		}
		else{
			if(current.getLeft() == null){
				previous.setLeft(current.getRight());
			}
			else{
				previous.setLeft(current.getLeft());
			}
		}
	}
	/**
	 * 
	 */
	private void deleteTwoKids(){
		if(current.getRight() != null){
			
		}
	}
	/**
	 * 
	 * @param start
	 */
	private void doInorder(Node<Integer> start){
		
	}
	/**
	 * 
	 * @param start
	 */
	private void doPostorder(Node<Integer> start){
		
	}
	/**
	 * 
	 * @param start
	 */
	private void doPreorder(Node<Integer> start){
		
	}
	/**
	 * 
	 * @param val
	 */
	private void find(T val){
		if(current == null){
			return;
		}
		if(current.getInfo().compareTo(val) < 0){
			previous = current;
			current = current.getLeft();
		}
		else if(current.getInfo().compareTo(val) > 0){
			previous = current;
			current = current.getRight();
		}
		else if(current.getInfo().equals(val)){
			return;
		}
		find(val);
	}
	/**
	 * maybe use private method addchild 
	 * @param val
	 */
	public void insert(T val){
		Node<T> newNode = new Node<T>(val);
		if(root == null){
			root = newNode;
			return;
		}
		find(val);
		if(previous.getInfo().compareTo(val) < 0){
			previous.setLeft(newNode);
		}
		else{
			previous.setRight(newNode);
		}
	}
	/**
	 * 
	 */
	public void inorder(){
		
	}
	/**
	 * 
	 */
	public void postorder(){
		
	}
	/**
	 * 
	 */
	public void preorder(){
		
	}
}
