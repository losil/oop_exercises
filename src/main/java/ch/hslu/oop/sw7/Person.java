/**
 *Class Person creates Person object with some basic attributes.
 *
 * 
 */
package ch.hslu.oop.sw7;

import java.util.Objects;
import java.util.Random;

/**
 * @author silvan
 *
 */

public class Person implements Comparable<Person> {
	private final long id;
	private String surname;
	private String prename;
	private String address;
	private String place;
	private int postalcode;
	
	public Person(String surname, String prename) {
		Random rand = new Random();
		this.id = Math.abs(rand.nextLong());
		this.surname = surname;
		this.prename = prename;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the prename
	 */
	public String getPrename() {
		return prename;
	}

	/**
	 * @param prename the prename to set
	 */
	public void setPrename(String prename) {
		this.prename = prename;
	}
	
	/**
	 * @return the full name
	 */
	public String getFullName() {
		return this.surname + " " + this.prename;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return the postalcode
	 */
	public int getPostalcode() {
		return postalcode;
	}

	/**
	 * @param postalcode the postalcode to set
	 */
	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * @return Object to String
	 */
	@Override
	public String toString() {
		return this.id + ";" + this.surname + ";" + this.prename;
	}
	
	/**
	 * Override of method equals() for Class Person.
	 */
	@Override
	public final boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		}
		
		if (!(obj instanceof Person)) {
			return false;
		}
		
		final Person other = (Person) obj;
		return (Objects.equals(other.surname, this.surname)) && (Objects.equals(other.prename, this.prename)) && (other.id == this.id);
	}
	
	
	/**
	 * Override of method hashCode() specialized for Person
	 */
	@Override
	public final int hashCode() {
		return Objects.hash(this.surname, this.prename, this.id);
	}
	
	
	/**
	 * Override of method compareT=()
	 */
	@Override
	public int compareTo(Person other) {
		
		return Long.compare(this.id, other.id);
	}
	
	


	
	

}
