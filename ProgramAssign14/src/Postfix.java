/**
 * 
 * @author Derek Wider
 *
 */
public class Postfix {
	private StackNode head;

	
	public Postfix(){
		head = null;
	}
	/**
	 * 
	 * @param infix
	 * @return
	 * 
	 * 	
	 * char (  = int 40
	 * char + = int 43
	 * char - = int 45
	 * char * = int 42
	 * char / = int 47
	 * char ^ = int 94
	 * char ) = int 41
	 * 
	 * char of '1' = int of 49, goes up to char '9' = int 57
	 */
	public String getPostfix(String infix){
		String postfix = "";
		for(int i = 0; i < infix.length(); i++){
			int intVal = infix.charAt(i);
			System.out.println(intVal);
			if(intVal >= 49 && intVal <= 57){
				postfix += infix.charAt(i);
			}
			else{
				int priority = getPriority(infix.charAt(i));
				System.out.println("entering managestack with character " + infix.charAt(i) + " that has priority of " + priority);
				String manageStackOutput = manageStack(infix.charAt(i), priority); 
				postfix += manageStackOutput;
				System.out.println("managestack printout: " + manageStackOutput);
			}
		}
		if(head != null){
			while(head != null){
				postfix += head.getInfo();
				head = head.getNext();
			}
		}
		return postfix;
	}
	
	private String manageStack(char operator, int priority){
		String operators = "";
		int headPriority;
		if(head != null){
			 headPriority = getPriority(head.getInfo());
		}
		else{
			
		}
		if(priority == 0){
			push(operator);
		}
		else if(priority == 4){
			while(head != null && head.getInfo() != '('){
				operators += head.getInfo();
				head  = head.getNext();
			}
		}
		else if(priority > headPriority){
			operators += operator;
		}
		else if(headPriority > priority){
			while(head != null && getPriority(head.getInfo()) > priority){
				operators += head.getInfo();
				head = head.getNext();
			}
		}
		else if(priority == headPriority){
			while(head != null && getPriority(head.getInfo()) == priority){
				operators += head.getInfo();
				head = head.getNext();
			}
		}
		return operators;
	}
	public void push(char input){
		StackNode temp = new StackNode(input);
		if(head != null){
			temp.setNext(head);
		}
		head = temp;
	}
	private int getPriority(char operator){
		int priority = 0;
		System.out.println("in getPriority with operator: " + operator);
		switch (operator){
			case '(': priority = 0; break;
			case '+': priority = 1;	break;
			case '-': priority = 1;	break;
			case '*': priority = 2;	break;
			case '/': priority = 2;	break;
			case '^': priority = 3;	break;
			case ')': priority = 4;	break;
		}
		System.out.println("this character has priority of: " + priority);
		return priority;
	}
}
