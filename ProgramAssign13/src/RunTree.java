class RunTree {
	public static void main(String args[]) {
		Tree atree = new Tree();
		
		atree.insert(85);
		atree.insert(98);
		atree.insert(50);
		atree.insert(37);
		atree.insert(60);
		atree.insert(76);
		atree.insert(101);
		atree.insert(45);
		atree.insert(90);
		atree.insert(52);
		atree.insert(95);
		atree.insert(67);
		atree.insert(110);
		atree.insert(103);
		
		atree.inorder();
		atree.preorder();
		atree.postorder();
		
		atree.delete(45);
		atree.delete(53);
		atree.inorder();
		
		atree.delete(101);
		atree.inorder();
		
		atree.delete(85);
		atree.inorder();
	}
}
/******************************** output **********************************
inserted 85
inserted 98
inserted 50
inserted 37
inserted 60
inserted 76
inserted 101
inserted 45
inserted 90
inserted 52
inserted 95
inserted 67
inserted 110
inserted 103
37  45  50  52  60  67  76  85  90  95  98  101  103  110  
85  50  37  45  60  52  76  67  98  90  95  101  110  103  
45  37  52  67  76  60  50  95  90  103  110  101  98  85  
deleted 45
Cannot find 53 in the tree to delete
37  50  52  60  67  76  85  90  95  98  101  103  110  
deleted 101
37  50  52  60  67  76  85  90  95  98  103  110  
deleted 85
37  50  52  60  67  76  90  95  98  103  110  

*****************************************************************************/

