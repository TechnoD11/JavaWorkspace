package dataInput;

import java.io.FileNotFoundException;

public class TestClass {

	public static void main(String[] args) throws FileNotFoundException {
		DataSet myData = new DataSet();
		myData.configureInput("C:\\Users\\Derek\\workspace\\JavaWorkspace\\FRCPostGameApp\\data", "testSampleCSV.csv");
		for(int i = 0; i < myData.getMatchTimes().length; i++){
			System.out.println(myData.getMatchTimes()[i]);
		}
		System.out.println();
		for(int i = 0; i < myData.getMatchTimes().length; i++){
			System.out.println(myData.getXCoords()[i]);
		}
		System.out.println();
		for(int i = 0; i < myData.getMatchTimes().length; i++){
			System.out.println(myData.getYCoords()[i]);
		}
		System.out.println();
		for(int i = 0; i < myData.getMatchTimes().length; i++){
			System.out.println(myData.getOrients()[i]);
		}
		System.out.println();
		for(int i = 0; i < myData.getMatchTimes().length; i++){
			System.out.println(myData.getWeeds()[i]);
		}
		System.out.println();
	}

}
