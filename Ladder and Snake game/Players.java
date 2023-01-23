
/**
 * Date: February 7th, 2022
 * @author Shamma_and_Ihana
 *
 */
public class Players {
// attributes for 
	/**
	 * int value for the position of the player
	 * 
	 */
	private int position;
	/**
	 * String value of the name of the player
	 * 
	 */
	private String name;
	/**
	 * int value for the number on the dice rolled by the player
	 * 
	 */
	private int diceNum;

	/**
	 * constructor for players class
	 * @param name String for the name of players
	 * @param diceNum int for the dice num obtained by the player
	 * @param position int for the position of the player
	 */
	public Players(String name, int diceNum, int position) {
		this.name = name;
		this.diceNum = diceNum;
		this.position = position;
	}
	
	/**
	 * getter for name
	 * @return name for the name of the player
	 */
	public String get_name() {
		return name;
	}
	
	/**
	 * getter for dice number
	 * @return dice number on the dice
	 */
	public int get_diceNum() {
		return diceNum;
	}

	/**
	 * getter for position of player
	 * @return position to obtain the position of the player
	 */
	public int get_position() {
		return position;
	}

	/**
	 * setter for position of player
	 * @param position sets the position of the player
	 */
	public void set_position(int position) {
		this.position = position;
	}

	/**
	 * setter for name of player
	 * @param name sets the the name of the player
	 */
	public void set_name(String name) {
		this.name = name;
	}
	
	/**
	 * setter for dice number of player
	 * @param diceNum dice number for player 
	 */
	public void set_diceNum(int diceNum) {
		this.diceNum = diceNum;
	}

	
	/**
	 * method for all possibles movements a player can execute after rolling the dice. the position will change accordingly.
	 * @param steps the number of steps will be determined by the number on the dice roll
	 * @return the new position of the player after adding their current position and the number of steps they need to take
	 */
	public int newPosition(int steps) {
		if (this.position + steps == 100) {
			position += steps;
		}

		else if (this.position + steps > 100) {
			position = 200 - (position + steps);
		}

		else {
			position = position + steps;
		}
		return position;
	}
}
