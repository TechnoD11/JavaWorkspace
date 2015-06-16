/**
 * 
 * @author Derek Wider
 *
 */
public class TreeNodeGeneric<T extends Comparable<T>>{

	private T info; 
	private TreeNodeGeneric<T> left, right;

	public TreeNodeGeneric(T input) {
		info = input;
		left = null;
		right = null;
	}

	public T getInfo() {
		return info;
	}

	public TreeNodeGeneric<T> getLeft() {
		return left;
	}
	
	public TreeNodeGeneric<T> getRight() {
		return right;
	}

	public void setInfo(T val) {
		info = val;
	}

	public void setLeft(TreeNodeGeneric<T> ptr) {
		left = ptr;
	}
	
	public void setRight(TreeNodeGeneric<T> ptr) {
		right = ptr;
	}
}
