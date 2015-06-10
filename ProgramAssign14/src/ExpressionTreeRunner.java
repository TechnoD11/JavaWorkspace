/**
 * 
 * @author Derek Wider
 *
 */
public class ExpressionTreeRunner {
	public static void main(String[] args){
		Postfix scrub = new Postfix();
		/*
		System.out.println(scrub.getPostfix("2+(3*(4+5))"));
		// expected postfix: 2345+*+
		*/
		System.out.println(scrub.getPostfix("4+2^3*2"));
		// expected postfix: 423^2*+
		
	}
}
