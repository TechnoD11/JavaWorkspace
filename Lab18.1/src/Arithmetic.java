/**
 * 
 * @author Derek Wider
 * APCS Lab 18.1
 *
 */
public class Arithmetic {
	public static int gcd(int a, int b){
		if(a == 0){ //if a is 0, return b
			return b;
		}
		else if(b == 0){ //but if b is 0, return a
			return a;
		}
		else if(a > b){ //if a is > b, recur with modulus of a
			return gcd(a % b, b);
		}
		else{ //if b is > a, recur with modulus of b
			return gcd(b % a, a);
		}
	}
}
