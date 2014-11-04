
public class Test {

	public static void main(String[] args) throws InterruptedException{
		while(true){
			System.out.println("VIAGRA ACTIVATED");
			for(int i = 1; i<=4; i++){
				Thread.sleep(50);
				viagra(i);
			}
			System.out.println("FAT WOMAN SPOTTED");
			for(int i = 4; i>=0; i--){
				Thread.sleep(50);
				viagra(i);
			}
		}
	}

/*
 * public boolean catDog(String str) {
			  int counter = 0;
			  int cat = 0;
			  int dog = 0;
			  boolean resp = false;
			  char first, second, third;
			    while((counter+2) < str.length()){
			      first = str.charAt(counter);
			      second = str.charAt(counter+1);
			      third = str.charAt(counter+2);
			      if(first == 'c' && second == 'a' && third == 't'){
			        cat++;
			      }
			      else if(first == 'd' && second == 'o' && third == 'g'){
			        dog++;
			      }
			      counter++;
			    }
			    if(cat == dog){
			      resp = true;
			    }
			    else{
			      resp = false;
			    }  
			  return resp;
			}

 */
	public static void viagra(int counter){
		if(counter == 1){
			System.out.println("8==D");
		}
		else if(counter == 2){
			System.out.println("8===D");
		}
		else if(counter == 3){
			System.out.println("8====D");
		}
		else if(counter == 4){
			System.out.println("8=====D");
		}
		else if(counter == 5){
			System.out.println("8=====D");
		}
		else if(counter == 6){
			System.out.println("8====D");
		}
		else if(counter == 7){
			System.out.println("8===D");
		}
		else if(counter == 8){
			System.out.println("8==D");
		}
		
		}
	}
	