package saveMyHeart1;

import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

import saveMyHeart.Bacteria;
import saveMyHeart.Heart;

public class Bacteria1 extends Bacteria{

	public Location getWhiteBloodCellLocation(){
		ArrayList<Location> occupiedSpots = getGrid().getOccupiedLocations(); //array of occupied grid locations
		for(Location myLoc : occupiedSpots){
			if(getGrid().get(myLoc) instanceof WhiteBloodCellCritter){ //if one of the locations is an instance of the WhiteBloodCell class, return true
				return myLoc;
			}
		}
		return null; //if none found, return null
	}
	public void act(){
		Location loc = this.getLocation(); //get the current bacteria location
		if(isInTerminationLocation(loc)){ //if the current position is in a adjacent location to the heart
			getGrid().get(getHeartLocation()).setColor(Color.BLACK); //set it to black
		}
		else if(isWhiteBloodCellSeen()){
			int direction = 180 - loc.getDirectionToward(getWhiteBloodCellLocation());
			Location next = loc.getAdjacentLocation(direction);
			this.setDirection(loc.getDirectionToward(getHeartLocation()));
			moveTo(next);
		}
		else{ //if not
			Location next = loc.getAdjacentLocation(loc.getDirectionToward(getHeartLocation()));
			if (getGrid().isValid(next)){ //generate next location based on heart position
				setDirection(loc.getDirectionToward(getHeartLocation()));
				moveTo(next); //rotate and move towards heart
			}
		}
	}
	public boolean isWhiteBloodCellSeen(){ //determines if the bacteria sees the white blood cell
		int colDif = Math.abs(getLocation().getCol() - getWhiteBloodCellLocation().getCol());
		int rowDif = Math.abs(getLocation().getRow() - getWhiteBloodCellLocation().getRow());
		if(colDif > 2 || rowDif > 2){ //if the location is within 2 units (row or column)
			return false;
		}
		return true; 
	}
}
