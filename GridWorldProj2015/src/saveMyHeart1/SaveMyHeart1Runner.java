package saveMyHeart1;

import saveMyHeart.Heart;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class SaveMyHeart1Runner {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(); //create a new world
		Heart myHeart = new Heart();
		
		Bacteria1 stuff = new Bacteria1();
		world.add(new Location(1,1), stuff);
		world.add(new Location(5,8), myHeart);
		world.add(new Location(5,6), new WhiteBloodCellCritter());
		world.show();
	}

}
