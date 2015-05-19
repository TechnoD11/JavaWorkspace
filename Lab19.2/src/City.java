/**
 * @author Derek Wider
 * APCS Lab 19.2
 */
public class City implements Comparable<City> {
	private String name;
	private String state; //holds state and name
	public City(String name, String state){
		this.name = name;
		this.state = state; //initialize state and name
	}
	@Override
	public int compareTo(City arg0) { //compares to another city
		if(name.compareTo(arg0.getName()) > 0){ //if name is higher, return 1
			return 1;
		}
		else if(name.compareTo(arg0.getName()) == 0){ //if name is the same, check state
			if(state.compareTo(arg0.getState()) > 0){
				return 1; //if this state is higher, return 1
			}
			else if(state.compareTo(arg0.getState()) < 0){
				return -1; //if lower, return -1
			}
			else{
				return 0; //if same, return 0
			}
		}
		else{ //if smaller, return -1
			return -1;
		}
	}
	public String toString(){
		return "City Name: " + name + " City State: " + state;
	}
	public String getName(){
		return name;
	}
	public String getState(){
		return state;
	}
}
