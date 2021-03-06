/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 12
 *
 */

//<T> denotes that Node is a generic class (implicit parameters are of type object unless denoted with <> brackets when constructing new node)
public class Node<T> {

	private T info; 
	private Node<T> next;

	public Node(T input) {
		info = input;
		next = null;
	}

	public Node(T val, Node<T> link) {
		info = val;
		next = link;
	}

	public T getInfo() {
		return info;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setInfo(T val) {
		info = val;
	}

	public void setNext(Node<T> ptr) {
		next = ptr;
	}

}