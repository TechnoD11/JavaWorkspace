package saveMyHeart1;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class SaveMyHeart1Runner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(); //create a new world
		Heart1 myHeart = new Heart1();
		world.add(new Location(5,7), myHeart);
		world.add(new Location(5,6), new WhiteBloodCell());
		world.show();
	}

}
