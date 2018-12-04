/**
 * 
 */
package ch.hslu.oop.sw6;

/**
 * Create Calculator object which provides some calculation methods
 * @author silvan
 *
 */
public class Calculator implements CalculatorService {

	
	private int value;
	public Calculator() {
		this.value = 0;
	}
	
	@Override
	public int addition(int i, int j) {
		this.value = i + j;
		return this.value;
	}

}
