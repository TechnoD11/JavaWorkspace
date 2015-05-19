package number1year2011;

import java.util.Random;

public class Sound {
	private int[] samples;
	
	public Sound(){
		samples = new int[10];
		Random rand = new Random();
		samples[0] = 0;
		samples[1] = 0;
		samples[2] = 0;
		for(int i = 3; i < samples.length; i++){
			samples[i] = rand.nextInt(4000);
		}
	}
	// 2011 #1 a)
	public int limitAmplitude(int limit) {
		int count = 0;
		for (int i = 0; i < samples.length; i++) {
			if (Math.abs(samples[i]) > limit) {
				samples[i] = limit;
				count++;
			}
		}
		return count;
	}

	// 2011 #1 b)
	public void trimSilenceFromBeginning() {
		int[] newSamples;
		int count = 0;
		for (int i = 0; i < samples.length; i++) {
			if (samples[i] == 0) {
				count++;
			} else {
				break;
			}
		}
		newSamples = new int[(samples.length) - count];
		for (int i = 0; i < newSamples.length; i++) {
			newSamples[i] = samples[i + count];
		}
		samples = newSamples;
	}
	public String toString(){
		String data = "";
		for(int i = 0; i < samples.length; i++){
			data += i + ": " + samples[i] + " ";
		}
		return data;
	}
}