/**
 * 
 * @author Derek Wider
 * APCS Lab 13.1
 *
 */
public class Billfold {
	private Card card1;
	private Card card2;
	public Billfold(){
		card1 = null; //initiate both to null
		card2 = null;
	}
	public void addCard(Card a){
		if(card1 == null){
			card1 = a; //determines where to place card and add its
		}
		else if(card2 == null){
			card2 = a;
		}
	}
	public String formatCards(){
		String resp = "";
		if(card1 != null && card2 != null){ //if neither are null, call both
			resp += "[" + card1.format() + "|" + card2.format() + "]";
		}
		else if(card1 != null){ //or just card 1
			resp += "[" + card1.format() + "]";
		}
		else if(card2 != null){ //or just card 2
			resp += "[" + card2.format() + "]"; 
		}
		return resp; //return it
	}
	public int getExpiredCardCount(){
		int cardCount = 0;
		if(card1 != null && card1.isExpired()){ 
			cardCount++; //if neither equal to null and expired, increment cardCount
		}
		if(card2 != null && card2.isExpired()){
			cardCount++;
		}
		return cardCount;
	}
}
