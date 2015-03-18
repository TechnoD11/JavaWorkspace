package critterCrab;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class BlusterCritter extends Critter{
	private int courage;
	public BlusterCritter(int c){
		courage = c;
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
}
