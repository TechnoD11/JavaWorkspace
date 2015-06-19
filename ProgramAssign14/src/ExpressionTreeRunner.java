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
		ExpressionTree gaben = new ExpressionTree();
		
		String filePath = "C:\\Users\\Derek\\OneDrive\\Documents\\School\\Grade 11\\AP CS\\prog assign 14";
		File infixFile = new File(filePath, "infixStrings.txt");
		Scanner input = new Scanner(infixFile);
		
		while(input.hasNext()){
			String postfix = scrub.getPostfix(input.next());
			System.out.println("The Postfix is: " + postfix);
			System.out.println("Tree Loading Below:");
			gaben.loadTree(postfix);
			System.out.println("The evaluation is: " + gaben.evaluate());
			System.out.println("The infix String is: " + gaben.infix());
			System.out.println();
		}
		
		/*
		for(int i = 0; i < 10; i++){
			input.next();
		}
		String postfix = scrub.getPostfix(input.next());
		System.out.println(postfix);
		gaben.loadTree(postfix);
		Scanner in = new Scanner (System.in);
		while(true){
			if(in.next().equalsIgnoreCase("left")){
				System.out.println(gaben.goLeft());
			}
			else if(in.next().equalsIgnoreCase("right")){
				System.out.println(gaben.goRight());
			}
			else if(in.next().equalsIgnoreCase("current")){
				System.out.println(gaben.getCurrent());
			}
			else{
				gaben.resetTraverse();
			}
		}
		 */
		
	}
}
