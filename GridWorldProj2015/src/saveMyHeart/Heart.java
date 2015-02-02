/**
 * @author Derek Wider
 * APCS Programming Assignment 7
 */
package saveMyHeart;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class Heart extends Actor
{
	Location thisLocation = this.getLocation();
	
    public Heart()//construct a heart, set it to red
    {
        setColor(Color.RED);
    }
    public void act() 
    {
     //do nothing
    }
}
