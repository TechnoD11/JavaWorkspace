/**
 * @author Derek Wider
 * APCS Lab 13.1
 */
import java.util.Calendar;


public class DriverLicense extends Card{
	private int expYear; //experation year
	public DriverLicense(String name, int expYear){
		super(name); //call the inherited constructor
		this.expYear = expYear;
	}
	public int getExpYear(){
		return expYear; //return exp year
	}
	public String format(){ //return the super format and add the exp year
		return super.format() + ", Expiration Year: " + expYear;
	}
	public boolean isExpired(){
		return expYear < Calendar.getInstance().get(Calendar.YEAR);
	} //calling Calendar.getInstance() returns a Calendar with the current date and time
	public String toString(){ //return the name and the exp year, formatted 
		return "DriverLicense[" + "name=" + super.getName() +"]" + "[expYear=" + expYear + "]";
	}
	
	public boolean equals(Card other){ //compare the name and expYear
		return other instanceof DriverLicense && super.getName().equals(other.getName()) && expYear == ((DriverLicense) other).getExpYear();
	}
	
}
