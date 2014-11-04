/**
 * 
 * @author Derek Wider
 *
 */
public class NumberVariablesPrinter {
	public static void main(String[] args){
		double n1 = 150;
		double n2 = n1;
		n2 *= 20;
		System.out.println(n1);
		System.out.println(n2);
	}
}
/*
The output of the program is:
150.0
3000.0

This is the output because the program is creating 2 memory locations, and giving the primitive n2 the value of n1, not giving it the same
memory location. And so, when n2 is multiplied by 20, it does not affect n1.

*/