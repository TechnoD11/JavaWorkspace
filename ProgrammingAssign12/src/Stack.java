/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 12
 *
 */
//Uses generic types, like in Node. models a LIFO data structure
public class Stack<T> {
	private Node<T> head;
	/**
	 * @info constructs a Stack with head = null
	 */
	public Stack(){
		head = null;
	}
	/**
	 * @info returns true if the Stack is empty
	 * @return is Stack empty
	 */
	private boolean emptyStack(){
		if(head == null){
			return true;
		}
		return false;
	}
	/**
	 * @info creates a new node with info <Code> input </Code> and adds to stack
	 * @param input the information to add to the stack
	 */
	public void push(T input){
		Node<T> temp = new Node<T>(input);
		if(head != null){
			temp.setNext(head);
		}
		head = temp;
	}
	/**
	 * @info returns the info in the topmost node, then removes the node from the stack
	 * @return info the info stored in the topmost node
	 */
	public T pop(){
		if(head == null){
			return null;
		}
		T info = head.getInfo();
		head = head.getNext();
		return info;
	}
	/**
	 * @info writes the contents of the stack to the console
	 */
	public void writeStack(){
		String res = "";
		for(Node<T> n = head; n != null; n = n.getNext()){
			res += n.getInfo() + "\t";
		}
		System.out.println(res);
	}
}
