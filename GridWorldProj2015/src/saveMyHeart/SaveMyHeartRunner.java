/**
 * @author Derek Wider
 * APCS Programming Assignment 7
 */
package saveMyHeart;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class SaveMyHeartRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld(); //create a new world
        world.add(new Location(5, 5), new Heart());    	    //add a heart
        world.add(new Location(6, 8), new Bacteria());	   //add a bacteria
        world.show();
    }
}
