/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 12
 *
 */
public class Stack<T> {
	private Node<T> head;
	public Stack(){
		head = null;
	}
	public boolean emptyStack(){
		if(head.getNext() == null){
			return true;
		}
		return false;
	}
	public void push(T input){
		Node<T> temp = new Node<T>(input);
		if(head != null && head.getNext() == null){
			head.setNext(temp);
		}
		input.setNext(head.getNext());
		head = input;
	}
	public Node<T> pop(){
		Node<T> temp = head.getNext();
		head.setNext(temp.getNext());
		return temp;
	}
	public void writeStack(){
		
	}
}
