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
public class LichtTest {

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Licht#hashCode()}.
	 */
	@Test
	public void testHashCode() {
		Licht licht1 = new Licht();
		assertNotNull(licht1.hashCode());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Licht#Licht()}.
	 */
	@Test
	public void testLicht() {
		Licht licht1 = new Licht();
		assertNotNull(licht1);
		assertTrue(licht1.isSwitchedOff());
		
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Licht#switchOn()}.
	 */
	@Test
	public void testSwitchOn() {
		Licht licht1 = new Licht();
		licht1.switchOn();
		assertTrue(licht1.isSwitchedOn());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Licht#switchOff()}.
	 */
	@Test
	public void testSwitchOff() {
		Licht licht1 = new Licht();
		licht1.switchOff();
		assertTrue(licht1.isSwitchedOff());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Licht#toString()}.
	 */
	@Test
	public void testToString() {
		Licht licht1 = new Licht();
		assertNotNull(licht1.toString());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Licht#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		Licht licht1 = new Licht();
		Licht licht2 = licht1;
		Licht licht3 = new Licht();
		assertTrue(licht1.equals(licht2));
		licht3.switchOn();
		assertFalse(licht1.equals(licht3));
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Licht#compareTo(ch.hslu.oop.sw10.Licht)}.
	 */
	@Test
	public void testCompareTo() {
		Licht licht1 = new Licht();
		Licht licht2 = licht1;
		Licht licht3 = new Licht();
		assertEquals(0,licht1.compareTo(licht2));
		licht3.switchOn();
		assertEquals(-1, licht1.compareTo(licht3));
		assertEquals(1, licht3.compareTo(licht1));
	}

}
