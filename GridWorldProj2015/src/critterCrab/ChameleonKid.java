/**
 * @author Derek Wider
 * APCS Gridworld Exercises
 */
package critterCrab;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter{

	public void processActors(ArrayList<Actor> actors){
		//declare two locations, in front and behind the critter
		Location front = this.getLocation().getAdjacentLocation(this.getDirection());
		Location back = this.getLocation().getAdjacentLocation(this.getDirection()+180);
		//iterate through the actors
		for(int i = actors.size()-1; i >= 0; i--){
			if(!(actors.get(i).getLocation().equals(front) || actors.get(i).getLocation().equals(back))){
				actors.remove(i); //remove all but front and back
			}
		}//call the parent method
		super.processActors(actors); 
	}
}
