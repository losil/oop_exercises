/**
 * 
 */
package ch.hslu.oop.sw8;

/**
 * @author silvan
 *
 */
public class Quecksilber extends Element {

	
	public Quecksilber(double temp ) {
		super(temp, -38.44, 22.0);
		
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " " + "GIFTIG";
	}

}
	

