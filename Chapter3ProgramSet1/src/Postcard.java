/**
 * 
 * @author Derek Wider
 *
 *3.1 Both the PrintStream Class and String Class will be needed to build the message and display it. Will also require a Postcard class
 */
public class Postcard {
	private String message;
    private String sender;
    private String recipient;

 public Postcard(String aSender, String aMessage)
 {
	String regards = "\nBest Wishes,\n";
    message = aMessage;
    sender = regards + aSender;
    recipient = "";
 }
 public void setRecipient(String recipient){
	 String greeting = "\nDear ";
	 String semicolon = ": ";
	 this.recipient = greeting + recipient + semicolon;
 }
 public void print(){
	 String builtString = recipient + message + sender;
	 System.out.println(builtString);
 }


}
