package First;
import allObjects.FlyingObjects;

/**
 * Date: March 4th 2022
 * This is the Airplane class that extends FlyingObjects which is used to obtain the brand, the price and horsepower of an airpane
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */

public class Airplane extends FlyingObjects {
	
	/**
	 * String value for the brand of the airplane
	 */
	protected String brand;
	/**
	 * double value for the price of the airplane     
	 */
	protected double price;
	/**
	 * int value for the horsepower of the airplane     
	 */
	protected int horsepower;

	/**
	 * default constructor for airplane class
	 */
	public Airplane() {
		brand = "Unknown";
		price = 0.0;
		horsepower = 0;
	}

	/**
	 * constructor for airplane class
	 * @param brand String for name of brand
	 * @param price double 
	 * @param horsepower int
	 */
	public Airplane(String brand, double price, int horsepower) {
		this.brand = brand;
		this.price = price;
		this.horsepower = horsepower;
	}

	/**
	 * copy constructor for airplane class
	 * @param a Airplane pointer
	 */
	public Airplane(Airplane a) {
		this.brand = a.brand;
		this.price = a.price;
		this.horsepower = a.horsepower;
	}

	/**
	 * setter for airplane class
	 * @param b String for brand name
	 */
	public void setBrand(String b) {
		this.brand = b;
	}

	/**
	 * getter for airplane class
	 * @return String value of brand name
	 */
	public String getBrand() {
		return this.brand;
	}

	/**
	 * setter for airplane class
	 * @param p double value of price 
	 */
	public void setPrice(double p) {
		this.price = p;
	}

	/**
	 * getter for airplane class
	 * @return double value of price 
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * setter for airplane class
	 * @param h int value of horsepower
	 */
	public void setHorsepower(int h) {
		this.horsepower = h;
	}

	/**
	 * getter for airplane class
	 * @return int value of horse power
	 */
	public int getHorsepower() {
		return this.horsepower;
	}
	
	/**
	 * toString method that overrides super method to display information on the object. 
	 */
	public String toString() {
		return "The Airplane is manufactured by the " + this.brand + " company. It costs " + this.price
				+ "$ and has a horsepower of " + this.horsepower + ".";
	}
	
	/**
	 * equals boolean method that overrides super method and verifies if the passed object (to compare to) is null and if it is of 
		a different type than the calling object 
	 */
	public boolean equals(Object e1) {
		if (e1 == null || this.getClass() != e1.getClass())
			return false;
		else {
			Airplane a = (Airplane) e1;
			return this.brand == a.brand && this.price == a.price && this.horsepower == a.horsepower;
		}
	}
}

