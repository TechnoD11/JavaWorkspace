/**
 * @author Derek Wider
 */
import java.util.StringTokenizer;
public class StringTokenizerDemo {
	public static void main(String[] args){
		String sentence = "Mary had a little lamb.";
		StringTokenizer mystery = new StringTokenizer(sentence);
		System.out.println(mystery.countTokens());
		System.out.println(mystery.nextToken());
		System.out.println(mystery.nextToken());
	}
}
/*
 * 1.1
 * The StringTokenizer class sorts a string into tokens, sorted by delimiters
 * 
 * 1.2
 * countTokens counts the number of delimiter-separated tokens in a string
 * nextToken gets the next token of the string. 
 * 
 * 1.3
 * This Program prints:
 * 5
 * Mary
 * had
 * */
 