package critterCrab;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter{

	public void processActors(ArrayList<Actor> actors){
		Actor north = getGrid().get(this.getLocation().getAdjacentLocation(Location.NORTH));
		Actor south = getGrid().get(this.getLocation().getAdjacentLocation(Location.SOUTH));
		if(north == null && south == null){
			super.darken();
		}
	}
}
