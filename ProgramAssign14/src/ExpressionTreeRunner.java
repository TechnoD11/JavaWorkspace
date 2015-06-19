import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Derek Wider
 *	APCS Programming Assignment 14
 *
 *	This is the runner class for the expression tree.
 *	This class loads in the expressions from the assignment sheet. I've put all the expressions into a notepad document that this program reads from my hard drive. 
 *
 *	The class then:
 *		prints the expression to be manipulated
 *		prints the generated postfix
 *		(loads the tree) - no printout
 *		Prints the evaluation of the tree
 *		Prints the infix notation of the tree
 *
 */
public class ExpressionTreeRunner {
	public static void main(String[] args) throws FileNotFoundException{
		Postfix postFixGenerator = new Postfix();
		ExpressionTree tree = new ExpressionTree();
		
		String filePath = "C:\\Users\\Derek\\OneDrive\\Documents\\School\\Grade 11\\AP CS\\prog assign 14";
		File infixFile = new File(filePath, "infixStrings.txt");
		Scanner input = new Scanner(infixFile);
		
		while(input.hasNext()){
			String expression = input.next();
			System.out.println("The Loaded Expression is: " + expression);
			String postfix = postFixGenerator.getPostfix(expression);
			System.out.println("The Postfix is: " + postfix);
			tree.loadTree(postfix);
			System.out.println("The evaluation is: " + tree.evaluate());
			System.out.println("The infix String is: " + tree.infix());
			System.out.println();
		}	
		input.close();
	}
}
