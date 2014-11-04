/**
 * 
 * @author Derek Wider
 *
 */
public class TrimIt {
	public static void main(String[] args) {
		String sentence1 = "      abc   ";
		String sentence2 = "    def";
		String sentence3 = "ghi         ";
		//There are many ways do approach this, I have outlined 2 different approaches below
		//The first one uses the trim() method
		String message = sentence1.trim() + sentence2.trim() + sentence3.trim();
		System.out.println(message);
		//the second one utilizes two new strings called space and empty, and uses replaceAll on the 3 strings
		String space = " "; String empty = "";
		String sentence1Fixed = sentence1.replaceAll(space, empty);
		String sentence2Fixed = sentence2.replaceAll(space, empty);
		String sentence3Fixed = sentence3.replaceAll(space, empty);
		String message2 = sentence1Fixed + sentence2Fixed + sentence3Fixed;
		//uncomment the line below to print the abcdefghi using the above code.
		//System.out.println(message2);
	}
}
