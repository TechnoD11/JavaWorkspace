/**
 * 
 * @author Derek Wider
 * Lab 8.3
 *
 */
public class Door {
	private String state;
	private int number; 
	
	public Door(String aState, int aNumber){
		state = aState;
		number = aNumber; //constructs door with these parameters
	}
	public boolean isOpen(){
		return state.equals("open"); //get door state
	}
	public boolean isClosed(){
		return state.equals("closed"); //get door state
	}
	public void setState(String newState){
		state = newState; //set new state
	}
	public int getNumber(){
		return number; //get number
	}
	public void open(){
		if(state.equals("open")){ //set door to open
			System.out.println("The door is already open");
		}
		else{
			state = "open";
		}
	}
	public void close(){ //set door to close
		if(state.equals("open")){
			state = "closed";
		}
		else{
			System.out.println("The door is already closed");
		}
	}
	public String toString(){ //return formatted door information
		return "Door number " + number + " is " + state + ".";
	}
}
