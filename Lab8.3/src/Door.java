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
		number = aNumber;
	}
	public boolean isOpen(){
		return state.equals("open");
	}
	public boolean isClosed(){
		return state.equals("closed");
	}
	public void setState(String newState){
		state = newState;
	}
	public int getNumber(){
		return number;
	}
	public void open(){
		if(state.equals("open")){
			System.out.println("The door is already open");
		}
		else{
			state = "open";
		}
	}
	public void close(){
		if(state.equals("open")){
			state = "closed";
		}
		else{
			System.out.println("The door is already closed");
		}
	}
	public String toString(){
		return "Door number " + number + " is " + state + ".";
	}
}
