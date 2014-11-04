/**
 * 
 * @author Derek Wider
 *
 */
public class DoorViewer {

	public static void main(String[] args) {
		Door frontDoor = new Door("Front", "open");
		System.out.println("The front door is " + frontDoor.getState());
		System.out.println("Expected: open");
		
		Door backDoor = new Door("Back", "closed");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: closed");
		backDoor.setState("open");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: open");
		backDoor.setName("RearDoor");
		System.out.println("The backDoor's new name is: " + backDoor.getName());
		System.out.println("Expected: RearDoor");
		
		Door sideDoor = new Door("Side", "closed");
		System.out.println("The side door is: " + sideDoor.getState());
		System.out.println("Expected: closed");
		sideDoor.open();
		System.out.println("The side door is now " + sideDoor.getState());
		System.out.println("Expected: open");
/*
 *  1.8
 *  state is an instance variable (exists for the life of the object), newState is a local variable (exists only within the setState() method)
 *  1.9
 *  The implicit parameter is backDoor and the explicit parameter is what is passed in to the method (in this case, "open")
 */
	}

}
