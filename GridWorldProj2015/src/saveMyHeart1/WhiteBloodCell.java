package saveMyHeart1;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class WhiteBloodCell extends Critter{
	
	public WhiteBloodCell(){
	}
	public void setHeartLocation(){
		for(Location loc : getGrid().getOccupiedLocations()){
			if(getGrid().get(loc) instanceof Heart1){
				heartLocation = loc;
			}
		}
	}
	public void act(){
		makeMove(selectMoveLocation(getMoveLocations()));
	}
	public ArrayList<Actor> getActors(){
		return null;
	}
	public ArrayList<Location> getMoveLocations(){
		ArrayList<Location> emptyLocations = getGrid().getEmptyAdjacentLocations(getLocation());
		for(int i = emptyLocations.size(); i >= 0; i--){
			int colDif = Math.abs(emptyLocations.get(i).getCol() - heartLocation.getCol());
			int rowDif = Math.abs(emptyLocations.get(i).getRow() - heartLocation.getRow());
			if(colDif > 2 || rowDif > 2){
				emptyLocations.remove(i);
			}
		}
		return emptyLocations;
	}
	public void processActors(){
		//leave empty
	}
	
	//6 methods, all overridden, no new methods
	// 2 zip out - empty brackets (get actors, processactors should have nothing)
	/*  
	 * selectMoveLocation - don't touch, just use
	 * getMoveLocations - rewrite, use getemptyadjacent, then make sure all adjacents are in the viable area
	 * MakeMove - pass in location from selectMoveLocation
	 * make sure only moves when heart is alive (must be red), put in act
	 */
}
