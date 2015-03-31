/**
 * @author Derek Wider
 * APCS Gridworld Exercises
 */
package critterCrab;

import java.util.ArrayList;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class QuickCrab extends CrabCritter{
	
	public ArrayList<Location> getMoveLocations() { //creates array of move locations
		ArrayList<Location> locations = new ArrayList<Location>();
		int[] directions = { this.getDirection()-90, this.getDirection()+90 }; //gets left and right directions to use in array
		for (Location location : getLocationsInDirections(directions)) { //iterate through the getLocationsInDirections arraylist
			/*if (getGrid().get(location) == null){ //if the locations directly left and right are valid
				locations.add(location); //add them
			}*/
			if (getGrid().isValid(location.getAdjacentLocation(getLocation().getDirectionToward(location))) && getGrid().get(new Location(location.getRow(), location.getCol() + 1)) == null) {
				if(getGrid().get(location) == null){
					locations.add(new Location(location.getRow(), location.getCol() + 1)); //if the location 2 to the right is valid and is empty, add it
				}
			}
			if (getGrid().isValid(new Location(location.getRow(), location.getCol() - 1)) && getGrid().get(new Location(location.getRow(), location.getCol() - 1)) == null) {
				if(getGrid().get(location) == null){
					locations.add(new Location(location.getRow(), location.getCol() - 1)); //if the location 2 to the left is valid and empty, add it
				}
			}
		}
		return locations; //return the locations
	}

}
