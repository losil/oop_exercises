/**
 * 
 */
package ch.hslu.oop.sw8;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author silvan
 *
 */
public class TemperatureTest {

	/**
	 * Test method for {@link ch.hslu.oop.sw8.Temperature#hashCode()}.
	 */
	@Test
	public void testHashCode() {
		Temperature temp1 = new Temperature(2.6);
		Temperature temp2 = new Temperature(2.6);
		assertEquals(temp1.hashCode(),temp2.hashCode());
		
		Temperature temp3 = new Temperature(3.6);
		Temperature temp4 = temp3;
		assertEquals(temp3.hashCode(),temp4.hashCode());
	}



	/**
	 * Test method for {@link ch.hslu.oop.sw8.Temperature#compareTo(ch.hslu.oop.sw8.Temperature)}.
	 */
	@Test
	public void testCompareTo0() {
		Temperature temp1 = new Temperature(3.5);
		Temperature temp2 = new Temperature(3.5);
		assertEquals(0,temp1.compareTo(temp2));
		
	}
	
	/**
	 * Test method for {@link ch.hslu.oop.sw8.Temperature#compareTo(ch.hslu.oop.sw8.Temperature)}.
	 */
	@Test
	public void testCompareTo1() {
		Temperature temp1 = new Temperature(3.6);
		Temperature temp2 = new Temperature(3.5);
		assertEquals(1,temp1.compareTo(temp2));
		
	}
	
	/**
	 * Test method for {@link ch.hslu.oop.sw8.Temperature#compareTo(ch.hslu.oop.sw8.Temperature)}.
	 */
	@Test
	public void testCompareTo_1() {
		Temperature temp1 = new Temperature(3.4);
		Temperature temp2 = new Temperature(3.5);
		assertEquals(-1,temp1.compareTo(temp2));
		
	}
	
	/**
	 * Test method for convertCelsiusToKelvin() method
	 */
	@Test
	public void testConvertCelsiusToKelvin() {
		assertEquals(273.15, Temperature.convertCelsiusToKelvin(0),0);
	}
	
	/**
	 * Test method for convertKelvinToCelsius()
	 */
	
	@Test
	public void testConvertKelvintoCelsius() {
		assertEquals(-273.15, Temperature.convertKelvinToCelsius(0),0);
	}

}
