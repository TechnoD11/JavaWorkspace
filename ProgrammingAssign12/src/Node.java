/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 12
 *
 */
public class Node<T> {

	private T info; // protected instead of private, allowing the NodeList
						// class access
	protected Node<T> next;

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