/**
 * 
 * @author Derek Wider
 *Lab 8.3
 */
public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	public void setScore(int newScore){
		score = newScore;
	}
	public int getScore(){
		return score;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getname(){
		return name;
	}
	
}
