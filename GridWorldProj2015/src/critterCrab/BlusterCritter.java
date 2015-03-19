/**
 * @author Derek Wider
 * APCS Gridworld exercises
 */
package critterCrab;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class BlusterCritter extends Critter{
	private final double DARKENING_FACTOR = 0.05;
	private int courage;
	public BlusterCritter(int c){ //initialize the bluster critter with a courage level
		courage = c;
		this.setColor(Color.GRAY); //gray is default
	}
	public void act(){
		ArrayList<Actor> actors = this.getActors();
		if(actors.size() >= courage){ //if the number of actors is more than the courage
			adjustColor(false); //darken
		}
		else{
			adjustColor(true); //else lighten
		}
        processActors(actors);
        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        makeMove(loc); //make move based on move locations
	}
	public ArrayList<Actor> getActors(){
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int currentRow = this.getLocation().getRow();
		int currentCol = this.getLocation().getCol(); //get current row and column of critter
		for(int i = currentRow - 2; i <= currentRow + 2; i++){
			for(int j = currentCol - 2; j <= currentCol + 2; j++){ //iterate through the 5 x 5 with critter in center
				if(getGrid().isValid(new Location(i, j)) && getGrid().get(new Location(i, j)) != null){ //if this location is valid and contains an actor
					actors.add(getGrid().get(new Location(i, j))); //add it
				}
			}
		}
		return actors;
	}
	public void adjustColor(boolean isBrighter) { //adjusts critter color
		int red, green, blue;
		Color c = getColor();
		if (!isBrighter) { //if it is to be darkened
			red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
			green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
			blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));
		}  //darken each RGB value
		else {//else, brighten them
			red = (int) (c.getRed() * (1 + DARKENING_FACTOR));
			green = (int) (c.getGreen() * (1 + DARKENING_FACTOR));
			blue = (int) (c.getBlue() * (1 + DARKENING_FACTOR));
		} //set color to new colors, pass in scaled values
		setColor(new Color(scaleValue(red), scaleValue(green), scaleValue(blue)));
	}
	private int scaleValue(int value){ //scales RGB value within range
		if(value >= 255){ //upper bound at 255
			return 255;
		}
		if(value <= 0){ //lower at 0
			return 0;
		}
		return value; //or just return it if between
	}
}
