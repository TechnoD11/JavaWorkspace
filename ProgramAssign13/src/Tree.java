/**
 * 
 * @author Derek Wider
 * Programming Assignment 13
 */
public class Tree<T extends Comparable<T>> {
	private Node<T> root;
	private Node<T> current;
	private Node<T> previous;
	private boolean isCurrentAtHead; 
	/**
	 * default constructor for the tree. sets all pointers to null and isCurrentAtHead to false
	 * isCurrentAtHead - tells whether current is pointed at head
	 */
	public Tree(){
		root = null;
		current = null;
		previous = null;
		isCurrentAtHead = false;
	}
	/**
	 * deletes the value val from the tree. 
	 * First, it checks to see if current is at head or not. if not, it sets it there. 
	 * It then passes val into find, which lines current up on the node with val in it
	 * the following if statements then call the appropriate methods based on how many children the node has. 
	 * @param val
	 */
	public void delete(T val){
		if(!isCurrentAtHead){ //prevents accidental tree search start from not head
			current = root;
			previous = null;
			isCurrentAtHead = true;
		}
		find(val);
		if(current == null){
			System.out.println("Cannot find " + val + " in the tree to delete");
			return;
		}
		if(current.getLeft() == null && current.getRight() == null){
			deleteNoKids();
		}
		else if(current.getLeft() == null && current.getRight() != null){
			deleteOneKid();
		}
		else if(current.getLeft() != null && current.getRight() == null){
			deleteOneKid();
		}
		else{
			deleteTwoKids();
		}
		System.out.println("deleted " + val);
	}
	/**
	 * Deletes a node with no kids. simply sets previous's left or right (whichever has current) to null. 
	 */
	private void deleteNoKids(){
		if(previous.getLeft() != null && previous.getLeft().getInfo().compareTo(current.getInfo()) == 0){
			previous.setLeft(null);
		}
		else{
			previous.setRight(null);
		}
	}
	/**
	 * Deletes a node with one kid.
	 * First off, it checks to see if current is the root of the tree. if it is, then the root's right or left becomes root
	 * It then performs a series of checks to see whether the left or right of previous points to current, and then makes the deletion.
	 * deletion is performed by linking current's left or right (whichever is not null) to previous's left or right (whichever pointed to current)
	 */
	private void deleteOneKid(){
		if(current.equals(root)){
			if(current.getLeft() == null){
				root = current.getRight();
			}
			else{
				root = current.getLeft();
			}
			return;
		}
		if(previous != null && previous.getLeft() != null && previous.getLeft().getInfo().equals(current.getInfo())){
			if(current.getLeft() == null){
				previous.setLeft(current.getRight());
			}
			else{
				previous.setLeft(current.getLeft());
			}
		}
		else if(previous != null && previous.getRight() != null){
			if(current.getLeft() == null){
				previous.setRight(current.getRight());
			}
			else{
				previous.setRight(current.getLeft());
			}
		}
	}
	/**
	 * First, it creates two new pointers, which point to the node to be deleted and the one above it
	 * then it moves current and previous along until the farthest left node that is 1 from the right of the node to be deleted is reached.
	 * previous's left pointer is then assigned current's right value, if any.
	 * Then, current's left and right are assigned the node to be deleted's left and right.
	 * the node above the node to be deleted is then set to point to current, finishing the deletion.
	 */
	private void deleteTwoKids(){
		Node<T> deleteNode = current;
		Node<T> aboveDeleteNode = previous;
		previous = current;
		current = current.getRight();
		while(current.getLeft() != null){
			previous = current;
			current = current.getLeft();
		}
		//by here, current should point to the node that is farthest left from 1 to the right of the node to be deleted, previous is one before that, and deleteNode is at the node to be deleted
		if(current.getRight() != null){
			previous.setLeft(current.getRight());
		}
		else{
			previous.setLeft(null);
		}
		current.setLeft(deleteNode.getLeft());
		current.setRight(deleteNode.getRight());
		if(aboveDeleteNode != null && aboveDeleteNode.getRight().equals(deleteNode)){
			aboveDeleteNode.setRight(current);
		}
		else if(aboveDeleteNode != null && aboveDeleteNode.getLeft().equals(deleteNode)){
			aboveDeleteNode.setLeft(current);
		}
		else{
			root = current;
		}
	}
	/**
	 * computes an inorder notation using recursion. 
	 * @param start
	 */
	private void doInorder(Node<T> start){
		if(start != null){
			doInorder(start.getLeft());
			System.out.print(start.getInfo() + "\t");
			doInorder(start.getRight());
		}
	}
	/**
	 * computes a postorder notation using recursion
	 * @param start
	 */
	private void doPostorder(Node<T> start){
		if(start != null){
			doPostorder(start.getLeft());
			doPostorder(start.getRight());
			System.out.print(start.getInfo() + "\t");
		}
	}
	/**
	 * computes a preorder notation using recursion
	 * @param start
	 */
	private void doPreorder(Node<T> start){
		if(start != null){
			System.out.print(start.getInfo() + "\t");
			doPreorder(start.getLeft());
			doPreorder(start.getRight());
		}
	}
	/**
	 * aligns current and previous to where they need to be using recursion
	 * Takes in val
	 * if the node with val is found, current is set to that node, and previous is set to the node prior
	 * if current reaches null (when performing an insertion), then previous is now at the correct node where the insertion needs to happen. 
	 * 
	 * @param val
	 */
	private void find(T val){
		if(current == null){
			return;
		}
		if(current.getInfo().compareTo(val) > 0){
			previous = current;
			current = current.getLeft();
			isCurrentAtHead = false;
		}
		else if(current.getInfo().compareTo(val) < 0){
			previous = current;
			current = current.getRight();
			isCurrentAtHead = false;
		}
		else if(current.getInfo().equals(val)){
			isCurrentAtHead = false;
			return;
		}
		find(val);
	}
	/**
	 * inserts a value into the tree.
	 * First, it checks to see if there is a head. if there isn't, root is set to the new node
	 * It then makes sure that current is starting pointing at root.
	 * find is then called with the value to be inserted.
	 * the node is then inserted below previous, on whichever side it needs to be on (bigger/smaller than previous)
	 * @param val
	 */
	public void insert(T val){
		Node<T> newNode = new Node<T>(val);
		if(root == null){
			root = newNode;
			current = root;
			isCurrentAtHead = true;
			System.out.println("inserted " + val);
			return;
		}
		if(!isCurrentAtHead){ //prevents accidental tree search start from not head
			current = root;
			isCurrentAtHead = true;
		}
		find(val);
		if(previous.getInfo().compareTo(val) > 0){
			previous.setLeft(newNode);
		}
		else{
			previous.setRight(newNode);
		}
		System.out.println("inserted " + val);
	}
	/**
	 * calls the recursive inorder method
	 */
	public void inorder(){
		doInorder(root);
		System.out.println();
	}
	/**
	 * calls the recursion postorder method
	 */
	public void postorder(){
		doPostorder(root);
		System.out.println();
	}
	/**
	 * calls the recursive preorder method
	 */
	public void preorder(){
		doPreorder(root);
		System.out.println();
	}
}
