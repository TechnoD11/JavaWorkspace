import java.io.File;
import java.io.FileNotFoundException;
import java.io.Writer;
import java.util.Random;
import java.util.Scanner;


public class Test2 {

	public static void main(String[] args) throws FileNotFoundException {
		File myFile = new File("test", "test");
		Scanner in = new Scanner(myFile);
		
		myFile.
		
	}
}
		
		
		
		
		
		/*Random rand = new Random();
		rand.nextInt(52);
		boolean resp = false;
		int tries = 0;
		Scanner in = new Scanner(System.in);
		while(!resp && tries < 3){
			System.out.println("Enter a number between 1 and 10");
			int answer = in.nextInt();
			if(answer >= 0 && answer <= 10){
				resp = true;
			}
			else{
				resp = false;
			}
			tries++;
		}
		in.close();
	}
}*/
		/*
		 * 
		 * 
		 * for(int i = 0; i < 10; i++){
		 
			for(int j = 0; j<10; j++){
				System.out.print((i*j) % 10);
			}
			System.out.println();
		}
	}
	
	/*
	
	int n = 1;
	double x = 0;
	double s;
	while(s > 0.01 || n == 1){
		s = 1.0 / (n * n);
		x += s;
		n++;
	}
	
	
	//int s = 0;
	int i = 1;
	while(i <= 10){
		s += i;
		i++;
	}
	/*
	public static boolean gHappy(String str) {
		  boolean resp = false;
		  char first, second, third;
		  for(int i = 0; (i+2) < str.length(); i++){
		    first = str.charAt(i);
		    second = str.charAt(i+1);
		    third = str.charAt(i+2);
		    if(second == 'g'){
		      if(first == 'g' || third == 'g'){
		        resp = true;
		      }
		      else{
		        resp = false;
		      }
		    }
		  }
		  return resp;
		}

}
*/