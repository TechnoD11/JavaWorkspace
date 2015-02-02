/**
 * @author Derek Wider
 * APCS Programming Assignment 7
 */
package saveMyHeart;

import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class Bacteria extends Actor {
	
	public Bacteria(){ //constructor, just creates a bacteria
		this.setColor(null); //sets the color to null so your (Mr. Kelley) face is not a specific color
	}
	public void act(){
		Location loc = this.getLocation(); //get the current bacteria location
		
		if(isInTerminationLocation(loc)){ //if the current position is in a adjacent location to the heart
			getGrid().get(getHeartLocation()).setColor(Color.BLACK); //set it to black
		}
		else{ //if not
			Location next = loc.getAdjacentLocation(loc.getDirectionToward(getHeartLocation()));
			if (getGrid().isValid(next)){ //generate next location based on heart position
				setDirection(loc.getDirectionToward(getHeartLocation()));
				moveTo(next); //rotate and move towards heart
			}
		}
	}
	private Location getHeartLocation(){ //returns the location of the heart
		ArrayList<Location> occupiedSpots = getGrid().getOccupiedLocations(); //array of occupied grid locations
		for(Location myLoc : occupiedSpots){
			if(getGrid().get(myLoc) instanceof Heart){ //if one of the locations is an instance of the heart class, return true
				return myLoc;
			}
		}
		return null; //if none found, return null
	}
	private boolean isInTerminationLocation(Location loc){ //returns true if bacteria is adjacent to heart
		ArrayList<Location> adjacentToHeart = getGrid().getValidAdjacentLocations(getHeartLocation()); //get adjacent heart locations
		for(Location thisLoc : adjacentToHeart){
			if(loc.equals(thisLoc)){ //check each adjacent to the input loc, if equal, return true
				return true;
			}
		}
		return false; //else, return false
	}
}