package critterCrab;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter{

	public void processActors(ArrayList<Actor> actors){
		for(int i = actors.size()-1; i >= 0; i--){
			int direction = this.getDirection() + 180;
			if(direction > 359){
				direction = this.getDirection() - 180;
			}
			if(this.getLocation().getDirectionToward(actors.get(i).getLocation()) != this.getDirection()){
				actors.remove(i);
			}
			else if(this.getLocation().getDirectionToward(actors.get(i).getLocation()) != direction){
				actors.remove(i);
			}
		}
		super.processActors(actors);
	}
}
