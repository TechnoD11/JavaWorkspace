/**
 * 
 * @author Derek Wider
 * APCS Programming Assignment 14
 *
 */
public class IntegerNode implements TreeNode{
	private int info;
	
	public IntegerNode(int value){
		info = value;
	}
	
	@Override
	public int evaluate() {
		return info;
	}

	@Override
	public TreeNode getLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeNode getRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getInfoNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getInfoSymbol() {
		// TODO Auto-generated method stub
		return 0;
	}

}
