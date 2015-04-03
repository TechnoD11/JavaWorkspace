public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  public int getCount(int index){
	  int sum = 0;
	  for(int i = 0; i < matrix.length; i++){ //iterate rows
		  for(int j = 0; j < matrix[0].length; j++){ //iterate columns
			  if(matrix[i][j] == index){ //if the int in the location is index
				  sum++; //increment
			  }
		  }
	  }
	  return sum; //return sum of count of index's
  }
  public int getLargest(){
	  int largest = Integer.MIN_VALUE; //set to lowest possible to start
	  for(int i = 0; i < matrix.length; i++){
		  for(int j = 0; j < matrix[0].length; j++){ //iterate the array
			  if(matrix[i][j] > largest){ //if current location is larger than largest
				  largest = matrix[i][j]; //set largest to new largest
			  }
		  }
	  }
	  return largest; //return largest value found in array
  }
  public int getColTotal(int col){
	  int sum = 0;
	  for(int i = 0; i < matrix.length; i++){ //iterate through the rows
		  sum += matrix[i][col]; //add the value at this row and the specified column
	  }
	  return sum; //return the sum of values in the specified column
  }
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
	public void fillPattern1() {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (row < col)
					matrix[row][col] = 1;
				else if (row == col)
					matrix[row][col] = 2;
				else
					matrix[row][col] = 3;
			}
		}
	}
 
}