/**
 * 
 * @author Derek Wider
 * Program Assignment 14
 * 
 * This class handles the creation of a postfix notation. This class also has a stack built in, that handles the 
 * input and output of the operators. The method getPostfix returns the postfix notation of the
 * string that is inputted to the method.
 *
 */
public class Postfix {
	//head of the operators stack
	private StackNode head;

	/**
	 * Constructor, just establishes the stack as null
	 */
	public Postfix(){
		head = null;
	}
	/**
	 * 
	 * @param infix
	 * @return
	 * 
	 * This is the primary method of this class. The method takes in a parameter of infix and returns a String
	 * representation of the postfix.
	 * To do this, a for loop is used that iterates the length of the infix string. 
	 * Inside the for loop, an integer representation (ASCII) of the character is generated (intVal)
	 * Then, there is an if-else statement. If the character that has been read is a number, 
	 * it is concatenated to the postfix string.
	 * if it is not a number, then the priority of the operator is gotten from the getpriority method
	 * The operator and the priority are then supplied to the manageStack method, which returns the necessary stack output
	 * The managestack output is then concatenated to the postfix string
	 * Finally, after the for loop has finished, the stack is emptied and the postfix is returned.
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
		//	System.out.println(intVal);
			if(intVal >= 49 && intVal <= 57){
				postfix += infix.charAt(i);
			}
			else{
				int priority = getPriority(infix.charAt(i));
				//System.out.println("entering managestack with character " + infix.charAt(i) + " that has priority of " + priority);
				String manageStackOutput = manageStack(infix.charAt(i), priority); 
				postfix += manageStackOutput;
			//	System.out.println("managestack printout: " + manageStackOutput);
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
	/**
	 * Determines what to add or remove from the stack. Takes in a priority and an operator.
	 * If the head is null, the operator is pushed into the stack
	 * If the head isn't null, then the priority is generated.
	 * If the passed-in operator's priority is:
	 * 		-equal to 4 ( ')' right parenthesis), then the stack is emptied until the first '(' is hit
	 * 		
	 * 		-greater than the head's priority: operator is pushed into the stack
	 * 
	 * 		-less than the head's priority: empties the stack until the stack is empty or the 
	 * 			first operator with a lower priority is reached. Then, the operator that was passed in
	 * 			is pushed into the stack.
	 * 
	 * 		-equal to the head priority: empties the stack until the stack is empty or the first operator that is not
	 * 			equal to the passed-in operator's priority is reached. Then, the operator is pushed.
	 * 
	 * Finally, the string of operator(s) is returned
	 * 
	 * @param operator
	 * @param priority
	 * @return the operators to append to the postfix string
	 */
	private String manageStack(char operator, int priority){
		String operators = "";
		if(head == null){
			push(operator);
			return operators;
		}
		int headPriority = getPriority(head.getInfo());
		if(priority == 0){
			push(operator);
		}
		else if(priority == 4){
			while(head != null && head.getInfo() != '('){
				operators += head.getInfo();
				head  = head.getNext();
			}
			if(head != null){
				head = head.getNext();
			}
		}
		else if(priority > headPriority){
			push(operator);
			return operators;
		}
		else if(headPriority > priority){
			while(head != null && getPriority(head.getInfo()) >= priority){
				operators += head.getInfo();
				head = head.getNext();
			}
			push(operator);
		}
		else if(priority == headPriority){
			while(head != null && getPriority(head.getInfo()) == priority){
				operators += head.getInfo();
				head = head.getNext();
			}
			push(operator);
		}
		return operators;
	}
	/**
	 * Pushes an item into the stack. Takes in a character (operator) and pushes it. 
	 * @param input
	 */
	public void push(char input){
		StackNode temp = new StackNode(input);
		if(head != null){
			temp.setNext(head);
		}
		head = temp;
	}
	/**
	 * gets the priority of the passed-in operator. priorities range from 0 to 4, 
	 * with 4 being the highest (right parenthesis) and 0 being the lowest (left parenthesis).
	 * @param operator
	 * @return
	 */
	private int getPriority(char operator){
		int priority = 0;
	//	System.out.println("in getPriority with operator: " + operator);
		switch (operator){
			case '(': priority = 0; break;
			case '+': priority = 1;	break;
			case '-': priority = 1;	break;
			case '*': priority = 2;	break;
			case '/': priority = 2;	break;
			case '^': priority = 3;	break;
			case ')': priority = 4;	break;
		}
	//	System.out.println("this character has priority of: " + priority);
		return priority;
	}
}
