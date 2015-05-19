package number1year2011;

public class APTester {

	public static void main(String[] args) {
		Sound mySound = new Sound();
		//mySound.limitAmplitude(2000);
		mySound.trimSilenceFromBeginning();
		System.out.println(mySound.toString());
	}

}
