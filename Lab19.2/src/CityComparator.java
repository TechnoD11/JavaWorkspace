/**
 * @author Derek Wider
 * APCS Lab 19.2
 */
import java.util.Comparator;


public class CityComparator implements Comparator<City>{

	@Override
	public int compare(City arg0, City arg1) { //takes in two cities and compares their states and names
		if(arg0.getState().compareTo(arg1.getState()) > 0){ //if first state is before second state, return 1
			return 1;
		}
		else if(arg0.getState().compareTo(arg1.getState()) == 0){ //else, if equal, then check to see if city names differ
			if(arg0.getName().compareTo(arg1.getName()) > 0){
				return 1;
			}
			else if(arg0.getName().compareTo(arg1.getName()) < 0){
				return -1;
			}
			else{
				return 0;
			}
		}
		else{
			return -1;
		}
	}

}
