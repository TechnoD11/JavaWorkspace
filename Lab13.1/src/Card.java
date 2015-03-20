/**
 * 
 * @author Derek Wider
 * I am the author who originally wrote all this code by myself with no help from anyone
 *
 */
public class Card {
	private String name;

	public Card() {
		name = "";
	}

	public Card(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public boolean isExpired() {
		return false;
	}

	public String format() {
		return "Card holder: " + name;
	}
}
