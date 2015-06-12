import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *
 */
public class ExpressionTreeRunner {
	public static void main(String[] args) throws FileNotFoundException{
		Postfix scrub = new Postfix();
		String filePath = "C:\\Users\\Derek\\OneDrive\\Documents\\School\\Grade 11\\AP CS\\prog assign 14";
		File infixFile = new File(filePath, "infixStrings.txt");
		Scanner input = new Scanner(infixFile);
		while(input.hasNext()){
			System.out.println(scrub.getPostfix(input.next()));
			System.out.println();
		}
	}
}
