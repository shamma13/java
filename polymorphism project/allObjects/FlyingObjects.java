package allObjects;

/**
 * Date: March 4th 2022
 * This is the FlyingObjects class which is used on top of all the others to be able to create an array that stores all the flying objects
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */

public class FlyingObjects {
	/**
	 * Double value for the price of the flying objects
	 */
	private Double price;

	/**
	 * constructor for the FlyingObjects class
	 */
	public FlyingObjects() {
		
	}
	
	/**
	 * copy constructor for the FlyingObjects class to create the copyFlyingObject method in Driver 2
	 * @param flyingObjects FlyingObjects pointer
	 * @param price 
	 */
	public FlyingObjects(FlyingObjects flyingObjects) {
		
	}

	/**
	 * getter for FlyingObjects class
	 * @return the price of the flying object
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * setter for FlyingObjects class
	 * @param price of type double
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

}

