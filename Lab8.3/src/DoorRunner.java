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
		myDoors.add(0, null); //create new arraylist and make first element null
		for(int i = 1; i <= 100; i++){
			Door thisDoor = new Door("closed", i);
			myDoors.add(i, thisDoor); //make all doors closed
		}
		for(int i = 1; i <= 100; i++){ //iterate through each member of the array
			for(int j = i; j <= 100; j+=i){ //in each pass, iterate through the array again, at i intervals
				if(myDoors.get(j).isClosed()){
					myDoors.get(j).open(); //set to open if closed
				}
				else{
					myDoors.get(j).close();
				}
			}
		}
		int counter = 0;
		for(int i = 1; i < myDoors.size(); i++){
			System.out.print(myDoors.get(i) + " ");
			counter++; //quick logic for printing out the array members in list
			if(counter == 1){
				System.out.println();
				counter = 0;
			}
		}
	}

}
