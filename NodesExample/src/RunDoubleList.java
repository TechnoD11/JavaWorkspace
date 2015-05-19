//****************************************************************************
//   RunNodeList.java                                           
//  Class RunNodeList contains a main method to test the Node and the
//  NodeList classes.
//*****************************************************************************


public class RunDoubleList 
{
	public static void main(String args[]) {
		DNodeList alist = new DNodeList();
	
		alist.insert(15);
		alist.insert(30);
		alist.insert(25);
		alist.insert(32);
		alist.insert(14);
		alist.insert(22);
		alist.insert(8);
		alist.insert(60);
		alist.writeListForward();
		alist.writeListBackward();
		alist.delete(25);
		alist.delete(8);
		alist.delete(60);
		alist.writeListForward();
		alist.writeListBackward();
	}
}

 /*************************output ***************************
inserted 15
inserted 30
inserted 25
inserted 32
inserted 14
inserted 22
inserted 8
inserted 60
List forward:
8	14	15	22	25	30	32	60	
List backward:
60	32	30	25	22	15	14	8	
deleted 25

deleted 8

deleted 60

List forward:
14	15	22	30	32	
List backward:
32	30	22	15	14	
*********************************************************/
