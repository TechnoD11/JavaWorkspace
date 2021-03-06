package DancingBug;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	private int[] turns; //holds the turns to perform before moving
	private int steps; //how many steps to move before completion

	public DancingBug(int[] turns) {
		this.turns = turns;
		steps = 0;
	}

	public void turn(int numberOfTimes) { //turns the bug the inputed number of times
		for (int i = 1; i <= numberOfTimes; i++) {
			turn();
		}
	}

	public void act() {
		if (steps == turns.length)
			steps = 0; //reset if reaches length
		turn(turns[steps]);
		steps++; //turn for turns[steps] number of times
		super.act();
	}
}
