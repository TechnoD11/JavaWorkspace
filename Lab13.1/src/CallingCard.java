/**
 * 
 * @author Derek Wider
 * APCS Lab 13.1
 *
 */
public class CallingCard extends Card{
	private String cardNumber;
	private int pin;
	public CallingCard(String name, String cardNumber, int pin){
		super(name); //call the parent constructor and then initialize the two variables
		this.cardNumber = cardNumber;
		this.pin = pin;
	}
	public String getCardNumber(){
		return cardNumber; 
	}
	public int getPIN(){
		return pin;
	}
	public String format(){ //return the parent format, card number, and pin
		return super.format() + ", Card Number: " + cardNumber + ", PIN: " + pin;
	}
	public String toString(){ //return the parent name, this card number, and pin
		return "CallingCard[" + "name=" + super.getName() +"]" + "[cardNumber=" + cardNumber + "]" + "[pin=" + pin + "]";
	}
	public boolean equals(Card other){ //compare parent name and this card number and pin
		return other instanceof CallingCard && super.getName().equals(other.getName()) && cardNumber.equals(((CallingCard) other).getCardNumber()) && pin == ((CallingCard) other).getPIN();
	}
}
