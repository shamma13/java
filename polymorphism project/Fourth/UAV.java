package Fourth;
import allObjects.FlyingObjects;
import java.text.DecimalFormat;

/**
 * Date: March 4th 2022
 * This is the UAV class that extends FlyingObjects which is used to obtain the weight and the price of an UAV
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */

public class UAV extends FlyingObjects{

	/**
	 * to obtain 2 numbers behind the decimal
	 */
	private static final DecimalFormat f = new DecimalFormat("0.00"); 

	
	/**
	 * double weight value
	 */
	protected double weight;
	/**
	 * double price value
	 */
	protected double price;

	/**
	 * default constructor for the UAV class
	 */
	public UAV() {
		this.weight = 0.0;
		this.price = 0.0;
	}

	/**
	 * constructor for the UAV class
	 * @param weight double value
	 * @param price double value
	 */
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}

	/**
	 * copy constructor
	 * @param u UAV pointer
	 */
	public UAV(UAV u) {
		this.weight = u.weight;
		this.price = u.price;
	}

	/**
	 * setter for UAV class
	 * @param w double value of weight
	 */
	public void setWeight(double w) {
		this.weight = w;
	}

	/**
	 * getter for UAV class
	 * @return weight double value
	 */
	public double getWeight() {
		return this.weight;
	}
	
	/**
	 * setter for UAV class
	 * @param p double value of price
	 */
	public void setPrice(double p) {
		this.price = p;
	}
	
	/**
	 * getter for UAV class
	 * @return price double value
	 */
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * toString method that overrides super method to display information on the object. 
	 */
	public String toString() {
		return "The UAV (Unmanned Aerial Vehicle / Drone) has a weight of " + f.format(this.weight) + " pounds, and costs "
				+ f.format(this.price) + "$.";
	}
	
	/**
	 * equals boolean method that overrides super method and verifies if the passed object (to compare to) is null and if it is of 
		a different type than the calling object 
	 */
	public boolean equals(Object e5) {
		if (e5 == null || this.getClass() != e5.getClass())
			return false;
		else {
			UAV uav = (UAV) e5;
			return this.weight == uav.weight && this.price == uav.price;
		}
	}

}

