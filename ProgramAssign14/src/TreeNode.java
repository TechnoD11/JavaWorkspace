/**
 * 
 * @author Derek Wider
 *
 */
public class TreeNode<T extends Comparable<T>>{

	private T info; 
	private TreeNode<T> left, right;

	public TreeNode(T input) {
		info = input;
		left = null;
		right = null;
	}

	public T getInfo() {
		return info;
	}

	public TreeNode<T> getLeft() {
		return left;
	}
	
	public TreeNode<T> getRight() {
		return right;
	}

	public void setInfo(T val) {
		info = val;
	}

	public void setLeft(TreeNode<T> ptr) {
		left = ptr;
	}
	
	public void setRight(TreeNode<T> ptr) {
		right = ptr;
	}
}
