import java.util.Scanner;
/**
 * Date: February 7th, 2022
 * This is a Ladder and Snake game where the players will start the game
 * @author Shamma_and_Ihana
 * @version 1.0
 * 
 */
public class PlayLadderAndSnake {
	/**
	 * The main method of this application
	 * @param args  the method will call methods from Ladder and snake class (play()) to be able to start the game
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Ladder and Snake game! Please follow the given instructions\n");
	
		// prompt user to enter the number of players
		System.out.print("Enter the number of players for your game - Number must be between 2 and 4 inclusively: ");
		int numPlayers = sc.nextInt();
		
		int attempt;
		/**
		 *verifies if the number of player provided is between 2 and 4. if not, the game ends.
		 */
		
		for (attempt = 1; attempt <= 4; attempt++) {

			if (attempt < 4) {
				if (numPlayers < 2 || numPlayers > 4) {
					System.out.println("Bad Attempt " + attempt
							+ " - Invalid # of players. Please enter a # between 2 and 4 inclusively:");
					numPlayers = sc.nextInt();
				}
			} else if (attempt == 4) 
				if (numPlayers < 2 || numPlayers > 4) {
					System.out.println("Bad Attempt 4! You have exhausted all your chances. Program will terminate!");
				System.exit(1);
				}
		}
		
		// creating a pointer ladderGame to the LadderAndSnake object and calling the play method to start the game.
		LadderAndSnake ladderGame = new LadderAndSnake(numPlayers);
		
		ladderGame.play(); // complete move() method 
		
	}
}


