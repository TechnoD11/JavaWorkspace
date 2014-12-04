import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *Lab 8.3
 */
public class StudentScoreAnalyzer {
	public static void main(String[] args) {
		StudentScores myClass = new StudentScores();
		Scanner in = new Scanner(System.in);
		boolean done = false;
		do{
			System.out.println("Enter a student name or -1 to end: ");
			String name = in.nextLine();
			
			if(name.equals("-1")){
				done = true;
			}
			else{
				System.out.println("Enter the student's score: ");
				int score = in.nextInt();
				in.nextLine();
				myClass.addStudent(new Student(name, score));
			}
			
		}
		while(!done);
		
		System.out.println("The highest score in your class is: " + myClass.getHighest().getScore());
		System.out.println("The lowest score in your class is: " + myClass.getLowest().getScore());
	}

}
