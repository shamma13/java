package Second;
import First.Airplane;

/**
 * Date: March 4th 2022
 * This is the Helicopter class that extends Airplane which is used to obtain the number of cylinders, the current year and the capacity of people of the helicopter
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */

public class Helicopter extends Airplane {

	/**
	 * int value for number of cylinders
	 */
	protected int nbCyl;
	/**
	 * int value for the current year 
	 */
	protected int cYear;
	/**
	 * int value for the capacity of people 
	 */
	protected int pCapacity;

	/**
	 *  default constructor for helicopter class
	 */
	public Helicopter() {
		nbCyl = 0;
		cYear = 0;
		pCapacity = 0;
	}

	/**
	 * constructor for helicopter class
	 * @param nbCyl int number of cylinders
	 * @param cYear int current year
	 * @param pCapacity int capacity of people
	 */
	public Helicopter(int nbCyl, int cYear, int pCapacity) {
		this.nbCyl = nbCyl;
		this.cYear = cYear;
		this.pCapacity = pCapacity;
	}

	/**
	 * copy constructor
	 * @param h Helicopter pointer
	 */
	public Helicopter(Helicopter h) {
		setBrand(h.getBrand());
		setPrice(h.getPrice());
		setHorsepower(h.getHorsepower());
		this.nbCyl = h.nbCyl;
		this.cYear = h.cYear;
		this.pCapacity = h.pCapacity;
	}

	/**
	 * copy constructor 
	 * @param brand String value
	 * @param price double value
	 * @param horsepower int value
	 * @param nbCyl int value
	 * @param cYear int value
	 * @param pCapacity int value
	 */
	public Helicopter(String brand, double price, int horsepower, int nbCyl, int cYear, int pCapacity) {
		this(nbCyl, cYear, pCapacity);
		setBrand(brand);
		setPrice(price);
		setHorsepower(horsepower);
	}

	/**
	 * setter for helicopter class
	 * @param nc int value for number of cylinders
	 */
	public void setNbCyl(int nc) {
		this.nbCyl = nc;
	}

	/**
	 * getter for helicopter class
	 * @return int value for number of cylinders
	 */
	public int getNbCyl() {
		return this.nbCyl;
	}
	
	/**
	 * setter for helicopter class
	 * @param cy int value of current year
	 */
	public void setCYear(int cy) {
		this.cYear = cy;
	}
	
	/**
	 * getter for helicopter class
	 * @return int value for current year
	 */
	public int getCYear() {
		return this.cYear;
	}
	
	/**
	 * getter for helicopter class
	 * @return int value for capacity of people
	 */
	public int getPCapacity() {
		return this.pCapacity;
	}
	
	/**
	 * setter for helicopter class
	 * @param pc int value of capacity of people
	 */
	public void setPCapacity(int pc) {
		this.pCapacity = pc;
	}
	
	/**
	 * equals boolean method that overrides super method and verifies if the passed object (to compare to) is null and if it is of 
		a different type than the calling object 
	 */
	public boolean equals(Object e2) {
		if (e2 == null || this.getClass() != e2.getClass())
			return false;
		else {
			Helicopter h = (Helicopter) e2;
			return this.nbCyl == h.nbCyl && this.cYear == h.cYear && this.pCapacity == h.pCapacity;
		}
	}
	
	/**
	 * toString method that overrides super method to display information on the object. 
	 */
	public String toString() {
		return "The Helicopter is manufactured by the " + this.brand + " company and it was created in " + this.cYear
				+ ". It contains " + this.nbCyl + " cylinders and has a passenger capacity of " + this.pCapacity + ". It costs "
				+ this.price + "$ with a horsepower of " + this.horsepower + ".";
	}
}
