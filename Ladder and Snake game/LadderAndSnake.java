
//Names and IDs: Ihana Fahmy (40209686) and Shamma Markis (40211998)
//COMP 249
//Assignment # 1
//Due date: February 4th 2022
import java.util.Scanner;

/**
 * Date: February 7th 2022
 * This is the ladder and snake class which will have methods that will allow players to move on the game board and start the game. 
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */
public class LadderAndSnake {
	/**
	 * int value for the number of players in the game;
	 */
	private int numPlayers;
	/**
	 * String value for the name of each player
	 */
	private String playerName;
	/**
	 * int for the dice value rolled
	 */
	private int diceValue;
	/**
	 * Ladder array declared to store the int for the bottom and top placements of the ladders on the board 
	 */
	Ladders[] Ladder;
	/**
	 * snake array declared to store the int for the head and the tail placements of the snakes on the board
	 */
	Snakes[] snake;
	/**
	 * allPlayers array created in order to make the change in position when the players roll the dice
	 */
	Players[] allPlayers = new Players[5];

	
	/**
	 * method that initializes an array of players
	 */
	public void setallPlayersArray() {

		for (int i = 0; i < numPlayers; i++) {
			allPlayers[i] = new Players(allPlayers[i].get_name(), allPlayers[i].get_diceNum(),
					allPlayers[i].get_position());
		}
	}
	/**
	 * constructor for LadderAndSnake class which also prompts and sets the player names in the array of players
	 * @param numPlayers number of players in the game
	 */
	public LadderAndSnake(int numPlayers) {

		this.numPlayers = numPlayers;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numPlayers; i++) {

			if (i == 0) {
				System.out.print("\nEnter the Player 1 name : ");

				playerName = sc.nextLine();
				allPlayers[0] = new Players(playerName, 0, 0);
				allPlayers[0].set_name(playerName);
			}
			if (i == 1) {
				System.out.print("Enter the Player 2 name: ");

				playerName = sc.nextLine();
				allPlayers[1] = new Players(playerName, 0, 0);
				allPlayers[1].set_name(playerName);
			}
			if (i == 2) {
				System.out.print("Enter the Player 3 name: ");

				playerName = sc.nextLine();
				allPlayers[2] = new Players(playerName, 0, 0);
				allPlayers[2].set_name(playerName);
			}
			if (i == 3) {
				System.out.print("Enter the Player 4 name: ");

				playerName = sc.nextLine();
				allPlayers[3] = new Players(playerName, 0, 0);
				allPlayers[3].set_name(playerName);
			}
		}
	}
	
	
	/**
	 * getter for number of players
	 * @return number of players in the game
	 */
	public int get_numPlayers() {
		return this.numPlayers;
	}
	
	
	/**
	 * setter for number of players
	 * @param numPlayers number of players in the game
	 */
	public void set_numPlayers(int numPlayers) {
			this.numPlayers = numPlayers;
	}

	/**
	 * method that sets the dice value rolled into the array of players
	 * @param numPlayers number of players in the game
	 */
	public void diceRollOrder(int numPlayers) {

		setallPlayersArray();
		int roll;
		for (int i = 0; i < numPlayers; i++) {

			roll = flipDice();
			System.out.println(allPlayers[i].get_name() + " got a dice value of " + roll);

			if (i == 0) {
				allPlayers[0].set_diceNum(roll);
			}
			if (i == 1) {
				allPlayers[1].set_diceNum(roll);
			}
			if (i == 2) {
				allPlayers[2].set_diceNum(roll);
			}
			if (i == 3) {
				allPlayers[3].set_diceNum(roll);
			}
		}
	}

	
	/**
	 * method that adds into an array all the bottom and top cases that touch the ladders and changes the position of the player accordingly.
	 */
	public void ladder() {
		Ladders l_one = new Ladders(1, 38);
		Ladders l_two = new Ladders(4, 14);
		Ladders l_three = new Ladders(9, 31);
		Ladders l_four = new Ladders(28, 84);
		Ladders l_five = new Ladders(36, 44);
		Ladders l_six = new Ladders(21, 42);
		Ladders l_seven = new Ladders(51, 67);
		Ladders l_eight = new Ladders(80, 100);
		Ladders l_nine = new Ladders(71, 91);

		Ladders[] Ladder = { l_one, l_two, l_three, l_four, l_five, l_six, l_seven, l_eight, l_nine };

		setallPlayersArray();

		for (int i = 0; i < numPlayers; i++) {
			for (int j = 0; j < Ladder.length; j++) {
				if (Ladder[j].get_bottom() == allPlayers[i].get_position()) {
					allPlayers[i].set_position(Ladder[j].get_top());
					allPlayers[i].get_position();
					System.out.print("You can climb the ladder! ");
				}
			}
		}
	}

	/**
	 * method that adds into an array all the head and tail cases that touch the snakes and changes the position of the player accordingly.
	 */
	public void snake() {
		Snakes s_one = new Snakes(6, 16);
		Snakes s_two = new Snakes(19, 62);
		Snakes s_three = new Snakes(24, 95);
		Snakes s_four = new Snakes(30, 48);
		Snakes s_five = new Snakes(60, 64);
		Snakes s_six = new Snakes(68, 93);
		Snakes s_seven = new Snakes(76, 97);
		Snakes s_eight = new Snakes(78, 98);

		Snakes[] snake = {s_one, s_two, s_three, s_four, s_five, s_six, s_seven, s_eight };

		setallPlayersArray();

		for (int i = 0; i < numPlayers; i++) {
			for (int j = 0; j < snake.length; j++) {
				if (snake[j].get_head() == allPlayers[i].get_position()) {
					allPlayers[i].set_position(snake[j].get_tail());
					allPlayers[i].get_position();
					System.out.print("Oh no! You got a eaten by a snake! ");
				}
			}
		}

	}
	
	/**
	 * method that flips the dice to generate a random number from 1 to 6
	 * @return the number rolled
	 */
	public int flipDice() {

		int diceValue = (int) (Math.random() * 6) + 1; 
		return diceValue;
	}
	
	
	/**
	 * methods that sets the order of play according to the order of the biggest dice value obtained by each player.
	 * @param numPlayers the number of players
	 */
	public void playerOrder(int numPlayers) {
		setallPlayersArray();

		allPlayers[4] = new Players(null, 0, 0);

		diceRollOrder(numPlayers);

		for (int i = 0; i < numPlayers; i++) {
			for (int j = i + 1; j < numPlayers; j++) {

				if (allPlayers[i].get_diceNum() < allPlayers[j].get_diceNum()) {
					allPlayers[4] = allPlayers[i];
					allPlayers[i] = allPlayers[j];
					allPlayers[j] = allPlayers[4];
				}
			}
		}
		for (int i = 0; i < numPlayers; i++) {
			for (int j = i + 1; j < numPlayers; j++) {
				
				while (allPlayers[i].get_diceNum() == allPlayers[j].get_diceNum()) {
					System.out.println("\nA tie was achieved between " + allPlayers[i].get_name() + " and "
							+ allPlayers[j].get_name() + ". " + allPlayers[i].get_name() + " and "
							+ allPlayers[j].get_name() + " please reroll the dice.\n");

					int s;
					s = flipDice();
					allPlayers[i].set_diceNum(s);
					System.out
							.println(allPlayers[i].get_name() + " got a dice value of " + allPlayers[i].get_diceNum());

					s = flipDice();
					allPlayers[j].set_diceNum(s);
					System.out
							.println(allPlayers[j].get_name() + " got a dice value of " + allPlayers[j].get_diceNum());

					if (allPlayers[i].get_diceNum() < allPlayers[j].get_diceNum()) {
						allPlayers[4] = allPlayers[i];
						allPlayers[i] = allPlayers[j];
						allPlayers[j] = allPlayers[4];
					}
				}
			}

		}
		System.out.println("\nReached final decision on order of playing: ");

		for (int i = 0; i < numPlayers; i++) {
			if (i == numPlayers - 1)
				System.out.print(allPlayers[i].get_name());
			else
				System.out.print(allPlayers[i].get_name() + ", ");
		}
	}

	/**
	 * method that updates the player on their new positions after every dice flip until a player arrives at case 100.
	 */
	public void move() {
		setallPlayersArray();

		boolean end = true;
		endFor: while (end) {
			System.out.println("\nRoll the dice");

			for (int i = 0; i < numPlayers; i++) {
				int steps;
				steps = flipDice();

				allPlayers[i].set_position(allPlayers[i].newPosition(steps));

				System.out.print(allPlayers[i].get_name() + " got a dice value of " + steps + ". ");
				snake();
				ladder();
				System.out.println("Your new position is " + allPlayers[i].get_position());

				if (allPlayers[i].get_position() == 100) {
					System.out.println("The game is over, " + allPlayers[i].get_name() + " won!");

					break endFor;
				}
			}
			System.out.println("The game is not over. Flipping again!");
		}
	}

	/**
	 * method that starts the game by calling the playerOrder() and move() methods.
	 */
	public void play() {
		
		System.out.println("\nLet's determine the order of play! Players, please take turns rolling the dice: \n");
		playerOrder(numPlayers);
		System.out.println("\n\nLet's Start!");
		move();
	}
	
}
