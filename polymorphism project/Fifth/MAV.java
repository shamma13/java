package Fifth;
import Fourth.UAV;

/**
 * Date: March 4th 2022
 * This is the MAV class that extends UAV which is used to obtain the model and size of the miniature UAV
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */

public class MAV extends UAV {

	/**
	 * String value for the name of the model of the object
	 */
	private String model;
	/**
	 * double value for the size of the model of the object
	 */
	private double size;

	/**
	 * constructor for MAV class
	 * @param model String for the name of the model of the object
	 * @param size double for the size of the object
	 */
	public MAV() {
		this.model = "Unknown";
		this.size = 0.0;
	}

	/**
	 * constructor for MAV class with parameters of the super class
	 * @param weight double from the super class
	 * @param price double from the super class
	 * @param model String for the name of the model the object
	 * @param size double for the size of the object
	 */
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}

	/**
	 * copy constructor to obtain a copy of MAV object
	 * @param mav that points to MAV
	 */
	public MAV(MAV mav) {
		setWeight(mav.getWeight());
		setPrice(mav.getPrice());
		this.model = mav.model;
		this.size = mav.size;
	}

	/**
	 * setter for MAV class
	 * @param m String for model
	 */
	public void setModel(String m) {
		this.model = m;
	}

	/**
	 * getter for MAV class
	 * @return a string that confirms the model of the object
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * setter for MAV class
	 * @param s double for size 
	 */
	public void setSize(double s) {
		this.size = s;
	}

	/**
	 * getter for MAV class
	 * @return a double that confirms the size of the object
	 */
	public double getSize() {
		return this.size;
	}

	/**
	 * toString method that overrides super method to display information on the object. 
	 */
	public String toString() {
		return "The MAV (Micro Air Vehicle) is of the " + this.model + " model. It weighs " + this.weight
				+ " pounds with a size of " + this.size + " ,and costs " + this.price + "$.";
	}

	/**
	 * equals boolean method that overrides super method and verifies if the passed object (to compare to) is null and if it is of 
a different type than the calling object 
	 */
	public boolean equals(Object e7) {
		if (e7 == null || this.getClass() != e7.getClass())
			return false;
		else {
			MAV mav = (MAV) e7;
			return this.model == mav.model && this.size == mav.size;
		}
	}
}
