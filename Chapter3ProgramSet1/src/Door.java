/**
 * 
 * @author Derek Wider
 *
 */
public class Door {
	private String state;
	private String name;
	
	public Door(String name, String state){
		this.state = state;
		this.name = name;
	}
	
	public void close(){
		state = "closed";
	}
	public void open(){
		state = "open";
	}
	public String getName(){
		return name;
	}
	public String getState(){
		return state;
	}
	public void setName(String newName){
		name = newName;
	}
	public void setState(String newState){
		state = newState;
	}
	
}





