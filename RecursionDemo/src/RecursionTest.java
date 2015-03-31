
public class RecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(fib(7));
		System.out.println(recur(27));
	}
	public static int fib(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		else{
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static int recur(int m){
		if(m <= 10){
			return 2 *m;
		}
		else{
			return recur(recur(m/3));
		}
	}
}
