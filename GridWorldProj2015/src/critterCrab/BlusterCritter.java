package critterCrab;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class BlusterCritter extends Critter{
	private final double DARKENING_FACTOR = 0.05;
	public static int identity;
	public int thisIdentity;
	private int courage;
	public BlusterCritter(int c){
		courage = c;
		this.setColor(Color.GRAY);
		thisIdentity = identity;
		identity++;
	}
	public void act(){
		ArrayList<Actor> actors = this.getActors();
		if(actors.size() >= courage){
			adjustColor(false);
		}
		else{
			adjustColor(true);
		}
        processActors(actors);
        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        makeMove(loc);
        System.out.println(thisIdentity +" size: " + actors.size());
	}
	public ArrayList<Actor> getActors(){
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int currentRow = this.getLocation().getRow();
		int currentCol = this.getLocation().getCol();
		for(int i = currentRow - 2; i <= currentRow + 2; i++){
			for(int j = currentCol - 2; j <= currentCol + 2; j++){
				if(getGrid().isValid(new Location(i, j)) && getGrid().get(new Location(i, j)) != null){
					actors.add(getGrid().get(new Location(i, j)));
				}
			}
		}
		return actors;
	}

	public void adjustColor(boolean isBrighter) {
		int red, green, blue;
		Color c = getColor();
		if (!isBrighter) {
			red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
			green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
			blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));
		} 
		else {
			red = (int) (c.getRed() * (1 + DARKENING_FACTOR));
			green = (int) (c.getGreen() * (1 + DARKENING_FACTOR));
			blue = (int) (c.getBlue() * (1 + DARKENING_FACTOR));
		}
		setColor(new Color(scaleValue(red), scaleValue(green), scaleValue(blue)));
	}
	private int scaleValue(int value){
		if(value >= 255){
			return 255;
		}
		if(value <= 0){
			return 0;
		}
		return value;
	}
}
