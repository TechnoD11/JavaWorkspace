/**
 * 
 * @author Derek Wider
 *
 * This Program takes the string Hello World and creates a new string (from the original string) called Holle World
 */
public class HelloWorldReplace {

	public static void main(String[] args) {
		String original = "Hello, World!"; 
		String endString = null;
		String temp = null; //create 3 strings to store the original, in progress, and final strings
		temp = original.replace("Hello", "Holle"); //replace "Hello" in the original string with "Holle", set it equal to string temp
		endString = temp.replace("World", "Werld"); //replace "World" with "Werld", set it equal to final string
		System.out.println(endString); //print out the completed string
		
	}

}
