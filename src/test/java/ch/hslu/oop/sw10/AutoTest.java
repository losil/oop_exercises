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
public class AutoTest {

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Auto#hashCode()}.
	 */
	@Test
	public void testHashCode() {
		Auto auto1 = new Auto();
		assertNotNull(auto1.hashCode());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Auto#Auto()}.
	 */
	@Test
	public void testAuto() {
		Auto auto1 = new Auto();
		assertNotNull(auto1);
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Auto#switchOn()}.
	 */
	@Test
	public void testSwitchOn() {
		Auto auto1 = new Auto();
		auto1.switchOn();
		assertTrue(auto1.isSwitchedOn());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Auto#switchOff()}.
	 */
	@Test
	public void testSwitchOff() {
		Auto auto1 = new Auto();
		auto1.switchOff();
		assertTrue(auto1.isSwitchedOff());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Auto#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		Auto auto1 = new Auto();
		Auto auto2 = auto1;
		Auto auto3 = new Auto();
		assertTrue(auto1.equals(auto2));
		auto3.switchOn();
		assertFalse(auto1.equals(auto3));
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw10.Auto#compareTo(ch.hslu.oop.sw10.Auto)}.
	 */
//	@Test
	public void testCompareTo() {
		Auto auto1 = new Auto();
		Auto auto2 = auto1;
		Auto auto3 = new Auto();
		//assertEquals(0, auto1.compareTo(auto2));
		auto3.switchOn();
		//assertEquals(1, auto1.compareTo(auto3));
		
	}

}
