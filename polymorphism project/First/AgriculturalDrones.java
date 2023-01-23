package Fifth;
import Fourth.UAV;

/**
 * Date: March 4th 2022
 * This is the AgriculturalDrone class that extends UAV which is used to obtain the brand and carry capacity of the miniature UAV
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */

public class AgriculturalDrone extends UAV {

	/**
	 * String value for the brand of the object
	 */
	private String brand;
	/**
	 * int value for the carry capacity of the object
	 */
	private int cCapacity;

	/**
	 * default constructor for AD class
	 */
	public AgriculturalDrone() {
		this.brand = "Unknown";
		this.cCapacity = 0;
	}

	/**
	 * constructor for AD class
	 * @param weight double from super class
	 * @param price double form super class
	 * @param brand string for the name of the brand
	 * @param cCapacity int for the carry capacity of the object
	 */
	public AgriculturalDrone(double weight, double price, String brand, int cCapacity) {
		super(weight, price);
		this.brand = brand;
		this.cCapacity = cCapacity;
	}

	/**
	 * copy constructor of AD object
	 * @param ag AgriculturalDrone pointer
	 */
	public AgriculturalDrone(AgriculturalDrone ag) {
		setWeight(ag.getWeight());
		setPrice(ag.getPrice());
		this.brand = ag.brand;
		this.cCapacity = ag.cCapacity;
	}

	/**
	 * setter of AD class
	 * @param b String for the brand
	 */
	public void setBrand(String b) {
		this.brand = b;
	}

	/**
	 * getter of AD class
	 * @return String of the name of the brand
	 */
	public String getBrand() {
		return this.brand;
	}
	
	/**
	 * setter of AD class
	 * @param cc int for the carry capacity
	 */
	public void setCCapacity(int cc) {
		this.cCapacity = cc;
	}
	
	/**
	 * getter of AD class
	 * @return int of the carry capacity
	 */
	public int getCCapacity() {
		return this.cCapacity;
	}
	
	/**
	 * toString method that overrides super method to display information on the object. 
	 */
	public String toString() {
		return "The Agricultural Drone is manufactured by the " + this.brand + ". It weighs " + this.weight
				+ " pounds, and costs " + this.price + "$. It can carry up to " + this.cCapacity + " kg.";
	}
	
	/**
	 * equals boolean method that overrides super method and verifies if the passed object (to compare to) is null and if it is of 
	a different type than the calling object 
	 */
	public boolean equals(Object e6) {
		if (e6 == null || this.getClass() != e6.getClass())
			return false;
		else {
			AgriculturalDrone ag = (AgriculturalDrone) e6;
			return this.brand == ag.brand && this.cCapacity == ag.cCapacity;
		}
	}
}

