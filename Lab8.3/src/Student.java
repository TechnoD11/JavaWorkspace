/**
 * 
 * @author Derek Wider
 *Lab 8.3
 */
public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score){
		this.name = name; //create a student with this name and score
		this.score = score;
	}
	public void setScore(int newScore){
		score = newScore; //set score to newScore
	}
	public int getScore(){
		return score; //get the students score
	}
	public void setName(String newName){
		name = newName; //set their name
	}
	public String getname(){
		return name; //get their name
	}
	
}
