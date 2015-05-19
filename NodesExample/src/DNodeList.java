//*******************************************************************
//   NodeList.java                                           
//  Class NodeList contains methods to load, and manage a linked list.
//	The data are integers and they are inserted in numerical order.
//  Stacks are Queues are structures that insert and delete items using 
//	other methods. 
//*******************************************************************


public class DNodeList 
{
	private DNode head;
	private DNode current, previous;
	
	// constructor
  public DNodeList() 
  {
	  head = null;
	  current = null;
	  previous = null;
  }
  
  	// delete a given value
  public void delete(int deleteVal) 
  {
	  find(deleteVal);  
	  if (current == null || current.getInfo() != deleteVal)
		  System.out.println("Cannot find " + deleteVal + " in the list");
	  else 
	  {
		  if (previous == null)                // delete the first node
		  {
			  current.getNext().setBack(null);
			  head = head.getNext();
		  }
		  else if(current.getNext()== null)				// delete the last node
			    previous.setNext(current.getNext());
		  else
		  {
			    previous.setNext(current.getNext());
			    current.getNext().setBack(previous);
		  }
		  System.out.println("deleted " + deleteVal + "\n");
	  }
	  current = null;
  }

  	//find the position of findVal within the list
  private void find(int findVal) 
  {
	current = head;
  	previous = null;
  	while (current != null && current.getInfo() < findVal) 
  	{
	  	previous = current;
	  	current= current.getNext();
	 }
  }

	//insert a value into the list
  public void insert(int insertVal) 
  {
  	find(insertVal);
  	DNode temp = new DNode(insertVal, current, previous);  // assign temp.next to current and temp.back to previous
  	if (previous == null)			// insert first node
  	{
  		head = temp;
  		if (current != null) current.setBack(temp);  // insert to the front of an existing list
  	}
  	else if(current == null)		//insert last node
	  	previous.setNext(temp);
  	else							// insert in the middle 
  	{
  		previous.setNext(temp);
  		current.setBack(temp);
  	}
  	System.out.println("inserted " + insertVal);
  }
  
  public void writeListForward() 
  {
	System.out.println("List forward:");
	DNode p = head;				// p will traverse the list
  	while (p != null) 
  	{
	  	System.out.print(p.getInfo() + "\t");
	  	p = p.getNext();
	}
	System.out.println();
  }
  
  public void writeListBackward() 
  {
	System.out.println("List backward:");
	find(Integer.MAX_VALUE);			// p will traverse the list
	DNode p = previous;	
	while (p != null) 
	{
	  	System.out.print(p.getInfo() + "\t");
	  	p = p.getBack();
 	}
	System.out.println();
  }
}