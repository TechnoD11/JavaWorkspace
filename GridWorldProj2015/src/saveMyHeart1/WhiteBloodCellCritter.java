/**
 * @author Derek Wider
 * Programming Assignment 8
 */
package saveMyHeart1;

import java.awt.Color;
import java.util.ArrayList;

import saveMyHeart.Heart;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class WhiteBloodCellCritter extends Critter{
	private Location heartLocation; //holds heart location
	public WhiteBloodCellCritter(){ //constructor
		heartLocation = null;
	}
	public void act(){ //move to the randomly-generated position
		makeMove(selectMoveLocation(getMoveLocations()));
	}
	public ArrayList<Actor> getActors(){
		return null; //not used
	}
	public void getHeartLocation(){ //gets heart location
		for(Location loc : getGrid().getOccupiedLocations()){
			if(getGrid().get(loc) instanceof Heart){ //go through occupied location
				heartLocation = loc; //if heart found, set implicit parameter to this location
			}
		}
	}
	public boolean isHeartAlive(){ //if the heart is colored black
		if(getGrid().get(heartLocation).getColor().equals(Color.black)){
			return false; //return false if dead
		}
		return true; //true if not
	}
	public ArrayList<Location> getMoveLocations(){
		getHeartLocation(); //get heart location
		ArrayList<Location> emptyLocations;
		if(!isHeartAlive()){ //if the heart is dead
			emptyLocations = new ArrayList<Location>();
			emptyLocations.add(getLocation());
			return emptyLocations; //return arraylist of just the current position (so it doesn't move)
		}
		else{ //else, get all empty adjacent locations
			emptyLocations = getGrid().getEmptyAdjacentLocations(getLocation());
		} //determine which locations are around the heart (5 x 5 grid)
		for(int i = emptyLocations.size(); i > 0; i--){
			int colDif = Math.abs(emptyLocations.get(i-1).getCol() - heartLocation.getCol());
			int rowDif = Math.abs(emptyLocations.get(i-1).getRow() - heartLocation.getRow());
			if(colDif > 2 || rowDif > 2){ //if this location is outside grid
				emptyLocations.remove(i-1); //remove it
			}
		}
		return emptyLocations; //return valid locations
	}
	public void processActors(){
		//not used
	}
}
