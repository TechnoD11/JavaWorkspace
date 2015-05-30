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
	public void delete(int val){
		
	}
	/**
	 * 
	 */
	private void deleteNoKids(){
		
	}
	/**
	 * 
	 */
	private void deleteOneKid(){
		
	}
	/**
	 * 
	 */
	private void deleteTwoKids(){
		
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
	private void find(int val){
		
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
		if()
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
