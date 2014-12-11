import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *Lab 8.3
 */
public class StudentScoreAnalyzer {
	public static void main(String[] args) {
		StudentScores myClass = new StudentScores();
		Scanner in = new Scanner(System.in); //new StudentScores instantiation
		boolean done = false;
		do{
			System.out.println("Enter a student name or -1 to end: ");
			String name = in.nextLine(); // input name
			
			if(name.equals("-1")){
				done = true; //quit if done
			}
			else{
				System.out.println("Enter the student's score: ");
				int score = in.nextInt(); //read the student score
				in.nextLine();
				myClass.addStudent(new Student(name, score)); //create new student and add to arraylist
			}
			
		}
		while(!done);
		//below: print out the students with the highest and lowest scores, and their names
		System.out.println("The student's name with the highest score is: " + myClass.getHighest().getname() + " and their score is: " + myClass.getHighest().getScore());
		System.out.println("The student's name with the lowest score is: " + myClass.getLowest().getname() + " and their score is: " + myClass.getLowest().getScore());
	}

}
