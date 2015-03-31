
public class ArraysTester {

	public static void main(String[] args) {
		Arrays myArray = new Arrays();
		myArray.fillArray();
		for(int i = 0; i < 6; i++){
			System.out.println(myArray.getArrayNumber(i));
		}
	}

}
