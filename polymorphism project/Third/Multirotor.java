package Third;
import Second.Helicopter;

/**
 * Date: March 4th 2022
 * This is the Multirotor class that extends Helicopter which is used to obtain the number of rotors
 * @author Shamma_and_Ihana
 * @version 1.0
 *
 */


public class Multirotor extends Helicopter {

	/**
	 * int value of the nb of rotors
	 */
	private int nbRotors;

	/**
	 * default constructor
	 */
	public Multirotor() {
		nbRotors = 0;
	}

	/**
	 * constructor 
	 * @param brand String value
	 * @param price double value
	 * @param horsepower int value
	 * @param nbCyl int value
	 * @param cYear int value
	 * @param pCapacity int value
	 * @param nbRotors int value
	 */
	public Multirotor(String brand, double price, int horsepower, int nbCyl, int cYear, int pCapacity, int nbRotors) {
		super(brand, price, horsepower, nbCyl, cYear, pCapacity);
		this.nbRotors = nbRotors;
	}

	/**
	 * copy constructor
	 * @param m Multirotor pointer
	 */
	public Multirotor(Multirotor m) {
		setBrand(m.getBrand());
		setPrice(m.getPrice());
		setHorsepower(m.getHorsepower());
		setNbCyl(m.getNbCyl());
		setCYear(m.getCYear());
		setPCapacity(m.getPCapacity());
		this.nbRotors = m.nbRotors;
	}

	/**
	 * setter method
	 * @param nr int value of nb of rotors
	 */
	public void setNbRotors(int nr) {
		this.nbRotors = nr;
	}

	/**
	 * getter method
	 * @return int value of nb of rotors
	 */
	public int getNbRotors() {
		return this.nbRotors;
	}
	
	/**
	 * equals boolean method that overrides super method and verifies if the passed object (to compare to) is null and if it is of 
		a different type than the calling object 
	 */
	public boolean equals(Object e4) {
		if (e4 == null || this.getClass() != e4.getClass())
			return false;
		else {
			Multirotor m = (Multirotor) e4;
			return this.nbRotors == m.nbRotors;
		}
	}
	
	/**
	 * toString method that overrides super method to display information on the object. 
	 */
	public String toString() {
		return "The Quadcopter is manufactured by the " + this.brand + " company and it was created in " + cYear
				+ ". It contains " + this.nbCyl + " cylinders, " + this.nbRotors
				+ " rotors and has a passenger capacity of " + this.pCapacity + ". It costs " + this.price
				+ "$ with a horsepower of " + this.horsepower + ".";
	}
}

