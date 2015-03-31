
public class Arrays {
	//put your instance variables here
	private int[] myArray;
	public Arrays(){ //constructor
		myArray = new int[6];
	}
	//methods below
	public int getArrayCount(){
		return myArray.length;
	}
	/**
	 * Fill the array with the values 10-60
	 */
	public void fillArray(){
		for (int i = 0; i < myArray.length; i++){
			myArray[i] = ((i * 10) + 10);
		}
		/*	myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		myArray[4] = 50;
		myArray[5] = 60;*/
		/*
		 * myArray[] = {10,20,30,40,50,60};
		 */	
	}
	public int getArrayNumber(int index){
		return myArray[index];
	}
}
