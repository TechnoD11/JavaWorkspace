//200 to 500, even only sum
public class EvenSumRunner {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 200; i <=500; i+=2){
			sum += i;
		}
		System.out.println("for loop: " + sum);
		int counter = 200;
		sum = 0;
		while(counter <= 500){
			sum += counter;
			counter += 2;
		}
		System.out.println("While loop: " + sum);
		
		counter = 200;
		sum = 0;
		do{
			sum+=counter;
			counter += 2;
		}
		while(counter <= 500);
		System.out.println("Do While Loop: " + sum);
	}

}
