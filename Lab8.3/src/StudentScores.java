import java.util.ArrayList;
/**
 * 
 * @author Derek Wider
 *Lab 8.3
 */

public class StudentScores {
	private ArrayList<Student> studentsArray; 
	
	public StudentScores(){
		studentsArray = new ArrayList<Student>(); //create a new arraylist of students
	}
	public void addStudent(Student myStudent){
		studentsArray.add(myStudent); //add a student to the arraylist
	}
	public Student getHighest(){
		int highestScore = studentsArray.get(0).getScore(); //get the first member as default
		int bestIndex = 0; //first member index
		for(int i = 0; i< studentsArray.size(); i++){ //iterate through total number of students
			if(studentsArray.get(i).getScore() > highestScore){
				highestScore = studentsArray.get(i).getScore();
				bestIndex = i; //if current student has highest score, set as new highest
			}
		}
		return studentsArray.get(bestIndex); //return the student at the highest index
	}
	public Student getLowest(){
		int lowestScore = studentsArray.get(0).getScore();
		int bestIndex = 0; //first student at index 0
		for(int i = 0; i< studentsArray.size(); i++){
			if(studentsArray.get(i).getScore() < lowestScore){
				lowestScore = studentsArray.get(i).getScore();
				bestIndex = i; //find lowest score and record index
			}
		}
		return studentsArray.get(bestIndex); //return student with lowest score
	}
}
