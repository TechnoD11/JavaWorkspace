/**
 * @author Derek Wider
 * APCS Gridworld exercises
 */
package critterCrab;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
//extends Critter
public class RockHound extends Critter{
	//override processactors
	public void processActors(ArrayList<Actor> actors){
		//iterate the array
		for(int i = actors.size() - 1; i >= 0; i--){
			if(actors.get(i) instanceof Rock){ //if actor is rock
				actors.get(i).removeSelfFromGrid(); //remove from grid
			}
		}
	}
}
