
public class Test2 {

	public static void main(String[] args) {
		boolean resp = gHappy("gg");
		System.out.println(resp);
	}
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
