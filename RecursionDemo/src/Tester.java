
public class Tester {

	public static void main(String[] args) {
		/*String[] names = {"Pat", "Joe", "Ann", "Cal", "Amy"};
		printVals(names, names.length-1);*/
		//mystery(123456);
		System.out.println(triangle(0));
		System.out.println(triangle(1));
		System.out.println(triangle(2));
		
	}
	public static void printVals(String[] items, int k){
		System.out.println("in printVals");
		if(k > 1){
			printVals(items, k - 1);
			System.out.print(items[k] + " ");
			printVals(items, k - 2);
		}
	}
	public static void mystery(int x){
		if((x/10) != 0){
			mystery(x / 10);
		}
		System.out.print(x % 10);
	}
	public static int triangle(int rows){
		int sum = 0;
		if(rows != 0){
			return sum + triangle(rows - 1);
		}
		return 0;
		String str = " ";
		str.l
	}

}
