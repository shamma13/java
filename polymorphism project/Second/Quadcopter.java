package Second;

/**
 * Date: March 4th 2022
 * This is the Quadcopter class that extends Helicopter which is used to obtain maximal final speed
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */

public class Quadcopter extends Helicopter {

	/**
	 * int value of maximal final speed
	 */
	protected int mFSpeed;

	/**
	 * default constructor for Quadcopter class
	 */
	public Quadcopter() {
		mFSpeed = 0;
	}

	/**
	 * constructor for Quadcopter class
	 * @param brand String value
	 * @param price double value
	 * @param horsepower int value
	 * @param nbCyl int value
	 * @param cYear int value
	 * @param pCapacity int value
	 * @param mFSpeed int value
	 */
	public Quadcopter(String brand, double price, int horsepower, int nbCyl, int cYear, int pCapacity, int mFSpeed) {
		super(brand, price, horsepower, nbCyl, cYear, pCapacity);
		this.mFSpeed = mFSpeed;
	}

	/**
	 * copy constructor
	 * @param q Quadcopter pointer
	 */
	public Quadcopter(Quadcopter q) {
		setBrand(q.getBrand());
		setPrice(q.getPrice());
		setHorsepower(q.getHorsepower());
		setNbCyl(q.getNbCyl());
		setCYear(q.getCYear());
		setPCapacity(q.getPCapacity());
		this.mFSpeed = q.mFSpeed;
	}

	/**
	 * setter for Quadcopter class
	 * @param mfs int for Maximal final speed
	 */
	public void setMFSpeed(int mfs) {
		this.mFSpeed = mfs;
	}

	/**
	 * getter for Quadcopter class
	 * @return int value of maximal final speed
	 */
	public int getMFSpeed() {
		return this.mFSpeed;
	}
	
	/**
	 * equals boolean method that overrides super method and verifies if the passed object (to compare to) is null and if it is of 
		a different type than the calling object 
	 */
	public boolean equals(Object e3) {
		if (e3 == null || this.getClass() != e3.getClass())
			return false;
		else {
			Quadcopter q = (Quadcopter) e3;
			return this.mFSpeed == q.mFSpeed;
		}
	}
	
	/**
	 * toString method that overrides super method to display information on the object. 
	 */
	public String toString() {
		return "The Quadcopter is manufactured by the " + this.brand + " company and it was created in " + cYear
				+ ". It contains " + this.nbCyl + " cylinders and has a passenger capacity of " + this.pCapacity + ". It costs "
				+ this.price + "$ with a horsepower of " + this.horsepower + " and a maximum flying speed of " + this.mFSpeed + " km/h.";
	}
}

