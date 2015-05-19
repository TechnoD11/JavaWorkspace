/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 12
 *
 */
//Uses generic types, like in Node. models a FIFO data structure
public class Queue<T> {
	private Node<T> head, tail;
	/**
	 * Constructor
	 */
	public Queue(){
		head = null;
		tail = null;
	}
	/**
	 * @info creates and adds a new node in the queue
	 * @param info
	 */
	public void enQueue(T info){
		Node<T> temp = new Node<T>(info);
		if(tail == null){
			head = temp;
			tail = temp;
			return;
		}
		tail.setNext(temp);
		tail = temp;
	}
	/**
	 * @info removes the front most element and returns its value
	 * @return the information stored in the front most node.
	 */
	public T deQueue(){
		if(head == null){
			return null;
		}
		T res = head.getInfo();
		head = head.getNext();
		return res;
	}
	/**
	 * @info writes the contents of the queue to console
	 */
	public void writeQueue(){
		String res = "";
		for(Node<T> n = head; n != null; n = n.getNext()){
			res += n.getInfo() + "\t";
		}
		System.out.println(res);
	}
	/**
	 * @info returns true if queue is empty
	 * @return is queue empty
	 */
	private boolean emptyStack(){
		if(head == null){
			return true;
		}
		return false;
	}
}
