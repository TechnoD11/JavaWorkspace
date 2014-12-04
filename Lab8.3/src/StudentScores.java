import java.util.ArrayList;
/**
 * 
 * @author Derek Wider
 *Lab 8.3
 */

public class StudentScores {
	private ArrayList<Student> studentsArray;
	
	public StudentScores(){
		studentsArray = new ArrayList<Student>();
	}
	public void addStudent(Student myStudent){
		studentsArray.add(myStudent);
	}
	public Student getHighest(){
		int highestScore = studentsArray.get(0).getScore();
		int bestIndex = 0;
		for(int i = 0; i< studentsArray.size(); i++){
			if(studentsArray.get(i).getScore() > highestScore){
				highestScore = studentsArray.get(i).getScore();
				bestIndex = i;
			}
		}
		return studentsArray.get(bestIndex);
	}
	public Student getLowest(){
		int lowestScore = studentsArray.get(0).getScore();
		int bestIndex = 0;
		for(int i = 0; i< studentsArray.size(); i++){
			if(studentsArray.get(i).getScore() < lowestScore){
				lowestScore = studentsArray.get(i).getScore();
				bestIndex = i;
			}
		}
		return studentsArray.get(bestIndex);
	}
	/*
	public void removeStudent(int index){
		studentsArray.remove(index);
	}
	public Student returnStudent(int index){
		return studentsArray.get(index);
	} */
}
