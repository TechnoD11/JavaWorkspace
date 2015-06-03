/**
 * 
 * @author Derek Wider
 * Programming Assignment 13
 */
//<T> denotes that Node is a generic class (implicit parameters are of type object unless denoted with <> brackets when constructing new node)
public class Node<T extends Comparable<T>> {

	private T info; 
	private Node<T> left, right;

	public Node(T input) {
		info = input;
		left = null;
		right = null;
	}

	public T getInfo() {
		return info;
	}

	public Node<T> getLeft() {
		return left;
	}
	
	public Node<T> getRight() {
		return right;
	}

	public void setInfo(T val) {
		info = val;
	}

	public void setLeft(Node<T> ptr) {
		left = ptr;
	}
	
	public void setRight(Node<T> ptr) {
		right = ptr;
	}

}