/**
 * @author Derek Wider
 * APCS Gridworld Exercises
 */
package critterCrab;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class QuickCrab extends CrabCritter{
	private ArrayList<Location> locations; //for holding the locations to return
	
	public QuickCrab(){ //calls super constructor, then constructs the arraylist
		super();
		locations = new ArrayList<Location>();
	}
	public ArrayList<Location> getMoveLocations() { //overrides Crabcritter method
		ArrayList<Location> locations = new ArrayList<Location>(); //generate the arraylist
		checkLocation(getDirection() - 90); //call the checkLocation method with the left direction 
		checkLocation(getDirection() + 90); //then calls with direction to the right

		if (locations.size() > 0) { //if there is a valid move location generated, return it (them)
			return locations;
		}
		return super.getMoveLocations(); //else, call CrabCritter's getMoveLocations()
	}

	private void checkLocation(int direction) { //checks and adds the location 2 spaces away in a given direction
		Location loc = getLocation().getAdjacentLocation(direction); //get the location adjacent to current location in specified direction
		if (getGrid().isValid(loc) && getGrid().get(loc) == null) { //if its valid and has no actor in it
			loc = loc.getAdjacentLocation(direction); //get the adjacent location to that one
			if (getGrid().isValid(loc) && getGrid().get(loc) == null){ //if this new location exists and has no actor in it
				locations.add(loc); //add the new location (2 away from starting) to the arraylist
			}
		}
	}
}

