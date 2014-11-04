import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *
 */
public class SoccerStandingsRunner {

	public static void main(String[] args) throws IOException{
		String pathToFile = "C:\\Users\\Derek\\workspace\\ProgrammingAssignment3\\src";  
		// the data file should be located in your project
		File inFile = new File(pathToFile, "SoccerData.txt"); //scan the data file
		Scanner inData = new Scanner(inFile);
		int[] dataArray = new int[50];
		SoccerStandings generator = new SoccerStandings();
		generator.printFormat();
		for(int i = 0; i<= 45; i+=5){
			for(int x = 0; x <= 4; x++){
				dataArray[x+i] = inData.nextInt();
			}
			generator.printData(dataArray[i], dataArray[i+1], dataArray[i+2], dataArray[i+3], dataArray[i+4]);
		}		
	}

}
