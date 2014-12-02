import java.util.ArrayList;

/**
 * 
 * @author Derek Wider
 * Lab 8.3
 *
 */
public class DoorRunner {

	public static void main(String[] args) {
		ArrayList<Door> myDoors = new ArrayList<Door>();
		myDoors.add(0, null);
		for(int i = 1; i <= 100; i++){
			Door thisDoor = new Door("closed", i);
			myDoors.add(i, thisDoor);
		}
		for(int i = 1; i <= 100; i++){
			for(int j = i; j <= 100; j+=i){
				if(myDoors.get(j).isClosed()){
					myDoors.get(j).open();
				}
				else{
					myDoors.get(j).close();
				}
			}
		}
		System.out.println(myDoors);
	}

}