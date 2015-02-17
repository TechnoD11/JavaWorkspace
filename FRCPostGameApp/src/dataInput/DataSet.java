package dataInput;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DataSet {
	private File dataFile;
	private Scanner input;
	private int lineCount;
	private double xCoords[];
	private double yCoords[];
	private double orients[];
	private double matchTimes[];
	private double weeds[];

	public DataSet(){
		lineCount = 0;
	}
	public void constructArrays(){
		xCoords = new double[lineCount];
		yCoords = new double[lineCount];
		orients = new double[lineCount];
		matchTimes = new double[lineCount];
		weeds = new double[lineCount];
	}
	public void configureInput(String directory, String fileName) throws FileNotFoundException{
		dataFile = new File(directory, fileName);
		input = new Scanner(dataFile);
		lineCount = 0;
		while(input.hasNext()){
			input.next();
			lineCount++;
		}
		constructArrays();
		lineCount--;
		input.close();
		input = new Scanner(dataFile);
		readData();
	}
	private void readData(){
		for(int i = 0; i <= lineCount; i++){
			String data = input.next();
			parseData(data, i);
		}
	}
	/**
	 * 
	 * @param dataLine
	 * Separates a single dataLine into individual elements (substrings)
	 * separates by delimiter (default = , )
	 * passes element to fillElement() to add to dataSet
	 */
	public void parseData(String dataLine, int lineNumber){
		boolean isFinished = false;
		int index = 0;
		int newIndex = dataLine.indexOf(",", index);;
		int dataSubsetCounter = 0;
		String dataElement = dataLine.substring(index, newIndex);
		fillElement(dataElement, dataSubsetCounter, lineNumber);
		index = newIndex;
		while(!isFinished){
			newIndex = dataLine.indexOf(",", index+1);
			if(newIndex == -1){
				isFinished = true;
				newIndex = dataLine.length();
			}
			dataSubsetCounter++;
			dataElement = dataLine.substring(index+1, newIndex);
			fillElement(dataElement, dataSubsetCounter, lineNumber);
			index = newIndex;
		}
	}
	/**
	 * 
	 * @param element - the data piece to be added
	 * @param elementIndex - integer representation of the data index to add to
	 * data index breakdown:
	 * 0 = match time
	 * 1 = position x data (double)
	 * 2 = position y data (double)
	 * 3 = robot orientation (double)
	 * add more here to represent more data 
	 */
	public void fillElement(String element, int elementIndex, int lineNumber){
		if(elementIndex == 0){
			double matchTime = Double.parseDouble(element);
			matchTimes[lineNumber] = matchTime;
		}
		if(elementIndex == 1){
			double xCoord = Double.parseDouble(element);
			xCoords[lineNumber] = xCoord;
		}
		if(elementIndex == 2){
			double yCoord = Double.parseDouble(element);
			yCoords[lineNumber] = yCoord;
		}
		if(elementIndex == 3){
			double orient = Double.parseDouble(element);
			orients[lineNumber] = orient;
		}
		if(elementIndex == 4){
			double weed = Double.parseDouble(element);
			weeds[lineNumber] = weed;
		}
	}
	/*
	 * Getters, just for debug and testing
	 * to be changed later
	 */
	public double[] getXCoords(){
		return xCoords;
	}
	public double[] getYCoords(){
		return yCoords;
	}
	public double[] getOrients(){
		return orients;
	}
	public double[] getMatchTimes(){
		return matchTimes;
	}
	public double[] getWeeds(){
		return weeds;
	}
}
