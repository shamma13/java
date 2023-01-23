
/**
 * Date: February 7th 2022
 * This is the ladders class used to obtain the top and bottom  placement of the ladders on the board game
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */
public class Ladders {
	/**
	 * int value for the placement of the top of the ladder
	 */
	private int top;
	/**
	 * int value for the placement of the bottom of the ladder
	 */
	private int bottom;
	
	/**
	 * constructor for ladders class
	 * @param bottom int for the bottom of the ladder
	 * @param top int for the top of the ladder
	 */
	public Ladders(int bottom, int top) {
		this.top = top;
		this.bottom = bottom;
	}
	
	/**
	 * getters for ladders class
	 * @return top value of the top of the ladder
	 */
	public int get_top() {
		return top;
	}
	
	/**
	 * getters for ladders class
	 * @return bottom placement of the ladder
	 */
	public int get_bottom() {
		return bottom;
	}
	
	
	/**
	 * setters for ladder class
	 * @param topValue placement of the top of the ladder
	 */
	public void set_top(int topValue) {
		this.top = topValue;
	}
	
	/**
	 * setters for ladder class
	 * @param bottomValue bottom of the ladder placement
	 */
	public void set_bottom(int bottomValue) {
		this.bottom = bottomValue;
	}
	
}
