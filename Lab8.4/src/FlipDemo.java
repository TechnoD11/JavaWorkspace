/**
 * 
 * @author Derek Wider
 *Lab 8.4
 */
public class FlipDemo {

	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.set(0, 0, "x");
		game.set(0, 1, "o");
		game.set(0, 2, "o");
		game.set(1, 0, "o"); //set board with random status
		game.set(2, 1, "x");
		System.out.println(game.toString());
		System.out.println("Flipped Vertical:");
		System.out.println(game.flipVertical());
		System.out.println("Flipped Horizontal:");
		System.out.println(game.flipHorizontal()); //print out board and flipped boards
	}

}
