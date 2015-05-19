/**
 * @author Derek Wider
 * APCS Lab 19.2
 */
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameGuesser {
	private ArrayList<String> lastNames = new ArrayList<String>();

	public void readNames() throws IOException, MalformedURLException {
		// Read the last names

		URL url = new URL(
				"http://www2.census.gov/topics/genealogy/1990surnames/dist.all.last");

		Scanner in = new Scanner(url.openStream());
		while (in.hasNext()) {
			// Read the last name
			String lastName = in.next();
			lastNames.add(lastName);

			// Ignore the statistical information
			in.nextDouble();
			in.nextDouble();
			in.nextInt();
		}
		in.close();

		// Print out the number of names in the file and
		// Sort the names using Collections
		Collections.sort(lastNames);
		System.out.println("There are " + lastNames.size() + " names in this list");
	}

	public int guessName() {
		int counter = 0;
		int low = 0;
		int high = lastNames.size();
		int mid = high / 2;
		boolean notFound = true; //variables to hold game info
		Scanner input = new Scanner(System.in);
		String userInput = "";
		while (notFound) { //while the name is not found
			System.out.println("Does your name come before " + lastNames.get(mid) + " in the dictionary? (Y/N), or is " + lastNames.get(mid) + " your name? (S)");
			userInput = input.next(); //ask if it is in the middle
			if (userInput.equalsIgnoreCase("Y")) { //if before, set new upper bound
				high = mid;
				mid = ((high - low)/2) + low;
				counter++;
			} else if(userInput.equalsIgnoreCase("N")){ //if after, set new lower bound
				counter++;
				low = mid;
				mid = ((high - low)/2) + low;
			}
			else{ //if name is found, return counter
				System.out.println("Your name, " + lastNames.get(mid) + ", was found with " + counter + " guesses.");
				input.close();
				return counter;
			}
			if(high == low){ //if upper and lower bounds are equal
				System.out.println("Is your name: " + lastNames.get(mid) + " ? (Y/N)");
				userInput = input.next(); //ask if name is found
				if(userInput.equalsIgnoreCase("Y")){ //if yes, print success, counter, and return counter
					System.out.println("Your name, " + lastNames.get(mid) + ", was found with " + counter + " guesses.");
					input.close();
					return counter;
				}
				else if(userInput.equalsIgnoreCase("N")){ //if no, inform user that guesser failed
					System.out.println("Name not found. Attempted locating with " + counter + " guesses");
					input.close();
					return counter;
				}
			}
		}
		input.close(); 
		return counter;
	}
}
