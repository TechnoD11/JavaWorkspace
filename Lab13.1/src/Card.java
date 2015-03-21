/**
 * 
 * @author Derek Wider
 * APCS Lab 13.1
 *
 */
public class Card {
	protected String name;
	
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
	public String toString(){ //return card name
		return "Card[name = " + name + "]";
	}
	public boolean equals(Card other){ //compare card names
		return other instanceof Card && name.equals(other.getName());
	}
}
