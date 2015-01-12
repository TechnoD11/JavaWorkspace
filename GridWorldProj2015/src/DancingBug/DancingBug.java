package DancingBug;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	private int[] turns;
	private int steps;

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
			steps = 0;
		turn(turns[steps]);
		steps++;
		super.act();
	}
}
