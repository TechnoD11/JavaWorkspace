public class RecursionPractice 
{

	public static int factorial(int n) 
	{
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}
	
	
	
	public static int fib(int n) 
	{
		if (n == 0 || n == 1)
			return 1;
		else
			return (fib(n - 1) + fib(n-2));
	}
	
	
	
	public static boolean isPalindrome(String str) 
	{
		if (str.length() == 1 || str.length() == 0)
			return true;
		else if (!str.substring(0, 1).equals(str.substring(str.length() - 1)))
			return false;
		else
			return isPalindrome(str.substring(1, str.length() - 1));
	}


	
	public static void main(String[] args) 
	{
		int factorialNum = 7;
		System.out.println(factorialNum + "! = " + factorial(factorialNum));

		int fibNum = 8;
		System.out.println(fibNum + "th fibonicci number: " + fib(fibNum));

		String text = "ava";
		if (isPalindrome(text))
			System.out.println(text + " is a palindrome");
		else
			System.out.println(text + " is not a palindrome");

	}

}
