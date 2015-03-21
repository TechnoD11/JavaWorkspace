/**
 * 
 * @author Derek Wider
 * APCS Lab 13.1
 *
 */
public class IDCard extends Card{
	private String iDNumber;
	public IDCard(String a, String b){
		super(a); //call parent constructor and initialize variables
		iDNumber = b;
	}
	public String getIDNumber(){
		return iDNumber;
	}
	public String format(){ //call parent format and add id number
		return super.format() + ", ID Number: " + iDNumber;
	}
	public String toString(){ //call parent getName and add idNumber
		return "IDCard[" + "name=" + super.getName() +"]" + "[iDNumber+" + iDNumber + "]";
	}
	public boolean equals(Card other){ //compare with parent equals and then compare the idNumber
		return other instanceof IDCard && super.getName().equals(other.getName()) && iDNumber.equals(((IDCard) other).getIDNumber());
	}
}
