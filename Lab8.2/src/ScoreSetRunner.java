/**
 * 
 * @author Derek Wider
 *Lab 8.2
 */
public class ScoreSetRunner {

	public static void main(String[] args) {
		ScoreSet scores = new ScoreSet();
		scores.add(95);
		scores.add(80);
		scores.add(68);
		scores.add(68);
		scores.add(78);
		scores.add(68);
		scores.add(90);
		scores.add(90);
		System.out.println(scores.averageWithoutLowest2());
		System.out.println(scores.toString());
	}

}
