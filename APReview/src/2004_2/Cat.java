package number1year2011;

import java.util.Random;

public class Cat {
	private int[] samples;
	
	public Cat()
	}
	public String speak(){
		return "meow";
	}


//part b)
public class LoudDog{
	public LoudDog(){
		super();
	}
	public String speak(){
		return super.speak() + super.speak();
	}
}
//part c)
public void allSpeak(){
	for(int i = 0; i < kennel.length; i++){
		petList.speak();
	}
}
// 4
private boolean forwardMoveBlocked(){
	if(robot.isClearInFront){
		return true;
	}
}
private void move(){
	if(spaces[i] == null){
			for(int j = i; j < spaces[i].length; j++){
				if(spaces[j] != null){
					spaces[i] = spaces[j];
					spaces[j] = null;
				}
			}
		}
}
public int clearHall(){
	for(int i = 0; i < spaces.length; i++){
		if(spaces[i] != null){
			if(spaces[i].getName().equals(name)){
				return i;
		}
	}
}	
