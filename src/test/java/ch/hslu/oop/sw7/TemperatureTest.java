/**
 * 
 */
package ch.hslu.oop.sw7;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author silvan
 *
 */
public class TemperatureTest {

	/**
	 * Test method for {@link ch.hslu.oop.sw7.Temperature#hashCode()}.
	 */
	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw7.Temperature#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw7.Temperature#compareTo(ch.hslu.oop.sw7.Temperature)}.
	 */
	@Test
	public void testCompareTo0() {
		Temperature temp1 = new Temperature(3.5);
		Temperature temp2 = new Temperature(3.5);
		assertEquals(0,temp1.compareTo(temp2));
		
	}
	
	/**
	 * Test method for {@link ch.hslu.oop.sw7.Temperature#compareTo(ch.hslu.oop.sw7.Temperature)}.
	 */
	@Test
	public void testCompareTo1() {
		Temperature temp1 = new Temperature(3.6);
		Temperature temp2 = new Temperature(3.5);
		assertEquals(1,temp1.compareTo(temp2));
		
	}
	
	/**
	 * Test method for {@link ch.hslu.oop.sw7.Temperature#compareTo(ch.hslu.oop.sw7.Temperature)}.
	 */
	@Test
	public void testCompareTo_1() {
		Temperature temp1 = new Temperature(3.4);
		Temperature temp2 = new Temperature(3.5);
		assertEquals(-1,temp1.compareTo(temp2));
		
	}
	
	

}
