
/**
 * Date: February 7th 2022
 * This is a snake class which stores the position of the head and the tail of the snakes on the game board
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */
public class Snakes {
	/**
	 * int value for the head placement
	 *
	 */
	private int head;
	/**
	 * int value for the tail placement
	 */
	private int tail;
	
	
	/**
	 * constructor for snake class
	 * @param tail the tail value on the board
	 * @param head the head value on the board
	 */
	public Snakes(int tail, int head) {
		this.head = head;
		this.tail = tail;
	}
	
	/**
	 * getter method for head value 
	 * @return the head value on the board
	 */
	public int get_head() {
		return head;
	}
	
	/**
	 * getter method for tail value
	 * @return the tail value on the board
	 */
	public int get_tail() {
		return tail;
	}

	/**
	 * setter method for head value 
	 * @param head sets the placement of the head on the board
	 */
	public void set_head(int head) {
		this.head = head;
	}
	
	/**
	 * setter method for head value
	 * @param tail sets the placement of the tail on the board
	 */
	public void set_tail(int tail) {
		this.tail = tail;
	}
}
