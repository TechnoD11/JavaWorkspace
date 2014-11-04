import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *
 */
public class RoomPainterRunner {

	public static void main(String[] args) throws FileNotFoundException {
		String pathToFile = "C:\\Users\\Derek\\workspace\\ProgrammingAssignment3\\src";  
		// the data file should be located in your project
		File inFile = new File(pathToFile, "PaintData.txt"); //scan in a paint data file
		Scanner inData = new Scanner(inFile); //
		int[] dataArray = new int[30];
		RoomPainter painter = new RoomPainter();
		for(int i = 0; i <= 25; i+=5){
			for(int x = 0; x <= 4; x++){
				dataArray[x+i] = inData.nextInt();
			}
			painter.printData(dataArray[i], dataArray[i+1], dataArray[i+2], dataArray[i+3], dataArray[i+4]);
		}
		
	}

}
