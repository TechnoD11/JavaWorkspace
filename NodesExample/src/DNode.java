//****************************************************************************
//   Node.java                                                  
//  Class Node contains information and methods for a single node of
//  a linked list. Methods will allow one to set and get info and next values.
//****************************************************************************


public class DNode 
{

	private int info;			// protected instead of private, allowing the NodeList class access
	private DNode back, next;

	public DNode(int val) 
	{
		info = val;
		next = null;
		back = null;
	}
	 
	public DNode(int val, DNode forwardLink, DNode backLink) 
	{
		info = val;
		next = forwardLink;
		back = backLink;
	}
	 
	public int getInfo() 
	{
		return info;
	}
	 
	public DNode getNext() 
	{
		return next;
	}
	public DNode getBack() 
	{
		return back;
	}
	 
	public void setInfo(int val) 
	{
		info = val;
	}
	 
	public void setNext(DNode ptr) 
	{
		next = ptr;
	}
	public void setBack(DNode ptr) 
	{
		back = ptr;
	}

}