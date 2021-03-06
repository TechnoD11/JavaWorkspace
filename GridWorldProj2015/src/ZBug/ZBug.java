package ZBug;

/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ZBug extends Bug
{
    private int steps; //holds current steps
    private int segLength; //holds the z length
    private int seg; //holds which portion of the z the bug is on

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
    	setDirection(Location.EAST);
    	steps = 0;
    	seg = 1;
    	segLength = length;
    } 

    /**
     * Moves to the next location of the square.
     */
    public void act(){
		if (seg <= 3 && steps < segLength) { //if in 3rd segment and steps are within sidelength
			if (canMove()) {
				move();
				steps++;
			}
		} else if (seg == 1) { //if in second segment, go to the southwest (forms diagonal)
			setDirection(Location.SOUTHWEST);
			steps = 0;
			seg++;
		} else if (seg == 2) { //if in first segment, go to the east 
			setDirection(Location.EAST);
			steps = 0;
			seg++;
		}
	}

}
