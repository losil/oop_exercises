/**
 * 
 */
package ch.hslu.oop.sw8;

/**
 * Enum which describes Aggregatszustand.
 * @author silvan
 *
 */
public enum Aggregatszustand {
	SOLID("fest"), LIQUID("fluessig"), GAS("gasfoermig");
	
	private final String description;
	
	private Aggregatszustand(final String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}

}

