package DancingBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class DancingBugRunner {
	public static void main(String[] args) {
		ActorWorld grid = new ActorWorld();
		int[] turns = { 2, 2, 1, 3 }; //specify the turns for the bug to complete
		DancingBug myBug = new DancingBug(turns);
		myBug.setColor(Color.RED);
		grid.add(new Location(9, 9), myBug); //create a new dancing bug 
		grid.show();
	}
}