/**
 * 
 */
package ch.hslu.oop.sw10;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author silvan
 *
 */
public class MotorTest {

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Motor#hashCode()}.
	 */
	@Test
	public void testHashCode() {
		Motor mot1 = new Motor();
		assertNotNull(mot1.hashCode());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Motor#Motor()}.
	 */
	@Test
	public void testMotor() {
		Motor mot1 = new Motor();
		assertNotNull(mot1);
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Motor#switchOn()}.
	 */
	@Test
	public void testSwitchOn() {
		Motor mot1 = new Motor();
		mot1.switchOn();
		assertTrue(mot1.isSwitchedOn());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Motor#switchOff()}.
	 */
	@Test
	public void testSwitchOff() {
		Motor mot1 = new Motor();
		mot1.switchOff();
		assertTrue(mot1.isSwitchedOff());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Motor#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		Motor mot1 = new Motor();
		Motor mot2 = mot1;
		Motor mot3 = new Motor();
		assertTrue(mot1.equals(mot2));
		mot3.switchOn();
		assertFalse(mot1.equals(mot3));
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Motor#compareTo(ch.hslu.oop.sw10.Motor)}.
	 */
	@Test
	public void testCompareTo() {
		Motor mot1 = new Motor();
		Motor mot2 = mot1;
		Motor mot3 = new Motor();
		assertEquals(0, mot1.compareTo(mot2));
		mot3.switchOn();
	    assertEquals(-1, mot1.compareTo(mot3));
	    assertEquals(1, mot3.compareTo(mot1));
	}
	

}
