/**
 * @author Derek Wider
 * APCS Lab 19.2
 */
import java.io.IOException;
import java.net.MalformedURLException;


public class NameTester {

	public static void main(String[] args) throws MalformedURLException, IOException {
		NameGuesser guesser = new NameGuesser();
		guesser.readNames(); //read and guess the names
		System.out.println(guesser.guessName());
	}

}
