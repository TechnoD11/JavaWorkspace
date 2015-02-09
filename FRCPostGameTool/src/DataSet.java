import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DataSet {
	private File dataFile;
	private Scanner input;
	private double xCoords[];
	private double yCoords[];
	private double orients[];
	private double matchTimes[];

	public DataSet(){
		
	}
	public void configureInput(String directory, String fileName) throws FileNotFoundException{
		dataFile = new File(directory, fileName);
		input = new Scanner(dataFile);
		
	}
	
}
