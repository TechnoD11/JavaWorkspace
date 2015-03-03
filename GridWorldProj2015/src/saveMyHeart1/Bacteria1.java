/**
 * @author Derek Wider
 * Programming Assignment 8
 */
package saveMyHeart1;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;
import saveMyHeart.Heart;

public class Bacteria1 extends Actor {
	int count = 0;
	boolean simulationEnded;
	private static final Color DEFAULT_COLOR = Color.BLUE;
	/*
	 * Constructs a blue bacteria.
	 */
	public Bacteria1() {
		setColor(DEFAULT_COLOR);
		simulationEnded = false;
	}
	public void act() {
		if (findHeartLocation() == null){
			return;// if there is no heart, then do nothing
		}
		else if(withenWBCDistance() && !simulationEnded) { //if its close to the white blood cell
			this.setDirection((this.getLocation().getDirectionToward(findCellLocation()) + 180) % 360); //determine opposite direction
			Location locer = this.getLocation().getAdjacentLocation(this.getDirection());
			if (getGrid().isValid(locer)){ //check to make sure new location is valid
				moveTo(locer);//move to it
			}
			return;
		}
		
		else if(!simulationEnded){
			this.setDirection(this.getLocation().getDirectionToward(findHeartLocation()));// else, set your direction
			moveTo(this.getLocation().getAdjacentLocation(getDirection()));
			if (nextToHeartLocation(findHeartLocation())) {// if you are next to the heart
				for (Actor thisActor : getGrid().getNeighbors(this.getLocation())) {
					if (thisActor instanceof Heart){
						thisActor.setColor(Color.BLACK);
					}
					simulationEnded = true;// turn it black
				}
			}
		}
	}
	public Location findHeartLocation() { //finds the location of the heart
		for (Location loc : getGrid().getOccupiedLocations()) {
			if (getGrid().get(loc) instanceof Heart){
				return loc; //return the heart location
			}
		}
		return null;
	}
	//determines if the bacteria is next to the heart
	public boolean nextToHeartLocation(Location heartLocation) {
		for (Location loc : getGrid().getOccupiedAdjacentLocations(heartLocation)){
			if (this.getLocation().equals(loc)){
				return true;	//if it is, return true
			}
		}
		return false;
		
	}
	public Location findCellLocation() { //find the location of the white blood cell
		for (Location loc : getGrid().getOccupiedLocations()) {
			if (getGrid().get(loc) instanceof WhiteBloodCellCritter) {
				return loc; //return it, if its an instance of that class
			}
		}
		return null;
	}
	public ArrayList<Location> getMoveLocations() { //gets viable locations to move to
		ArrayList<Location> placesFromWBC = new ArrayList<Location>();
		Location bacLocation = this.getLocation();
		int bacRow = bacLocation.getRow();
		int bacCol = bacLocation.getCol(); //gets rows and columns of bacteria
		for (int i = bacCol - 2; i <= bacCol + 2; i++) {
			for (int j = bacRow - 2; j <= bacRow + 2; j++) {
				placesFromWBC.add(new Location(j, i)); //builds an arraylist of viable locations
			}
		}
		for (int i = placesFromWBC.size() - 1; i >= 0; i--) { //backs up the truck
			if (placesFromWBC.get(i).equals(bacLocation)) //if a location is equal to the bacteria location, remove it
				placesFromWBC.remove(i);
		}
		return placesFromWBC;
	}
	// returns true if the bacteria is within distance to the white blood cell
	public boolean withenWBCDistance() {
		ArrayList<Location> someLocations = getMoveLocations(); //get viable locations
		Location locationBloodCell = findCellLocation();
		for (Location location : someLocations) {
			if (location.equals(locationBloodCell)) //if one of these locations is the white blood cell, return true
				return true;
		}
		return false;
	}
}
