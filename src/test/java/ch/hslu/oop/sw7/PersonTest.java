/**
 * 
 */
package ch.hslu.oop.sw7;

import static org.junit.Assert.*;
import org.junit.Test;
import nl.jqno.equalsverifier.EqualsVerifier;

/**
 * @author silvan
 *
 */
public class PersonTest {
	
	
	/**
	 * Test method for Person constructor
	 */
	
	public void testPerson() {
		Person pers1 = new Person("surname", "prename");
		assertNotNull(pers1.getSurname());
		assertNotNull(pers1.getPrename());
		assertNotNull(pers1.getId());
		
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw7.Person#getSurname()}.
	 */
	@Test
	public void testGetSurname() {
		Person pers1 = new Person("surname", "prename");
		assertEquals("surname" ,pers1.getSurname());
	}


	/**
	 * Test method for {@link ch.hslu.oop.sw7.Person#getPrename()}.
	 */
	@Test
	public void testGetPrename() {
		Person pers1 = new Person("surename", "prename");
		assertEquals("prename", pers1.getPrename());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw7.Person#setPrename(java.lang.String)}.
	 */
	@Test
	public void testSetPrename() {
		Person pers1 = new Person("surname", "prename");
		pers1.setPrename("newprename");
		assertEquals("newprename",pers1.getPrename());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw7.Person#getFullName()}.
	 */
	@Test
	public void testGetFullName() {
		Person pers1 = new Person("surname", "prename");
		assertEquals("surname prename", pers1.getFullName());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw7.Person#getAddress()}.
	 */
	@Test
	public void testGetAddress() {
		Person pers1 = new Person("surname", "prename");
		pers1.setAddress("javastreet");
		assertEquals("javastreet", pers1.getAddress());
	}


	/**
	 * Test method for {@link ch.hslu.oop.sw7.Person#getPlace()}.
	 */
	@Test
	public void testGetPlace() {
		Person pers1 = new Person("surname", "prename");
		pers1.setPlace("rotkreuz");
		assertEquals("rotkreuz", pers1.getPlace());
	}


	/**
	 * Test method for {@link ch.hslu.oop.sw7.Person#getPostalcode()}.
	 */
	@Test
	public void testGetPostalcode() {
		Person pers1 = new Person("surname", "prename");
		pers1.setPostalcode(6374);
		assertEquals(6374, pers1.getPostalcode());

	}


	/**
	 * Test method for {@link ch.hslu.oop.sw7.Person#getId()}.
	 */
	@Test
	public void testGetId() {
		Person pers1 = new Person("surname", "prename");
		assertNotNull(pers1.getId());

	}
	
	/**
	 * Test method equals for Person.equals()
	 */
	@Test
	public void testEqualsContract() {
		EqualsVerifier.forClass(Person.class).verify();
		
	}
	
	/**
	 * Test the hashcode method
	 */
	@Test
	public void testHashCode() {
		Person pers1 = new Person("surname", "prename");
		Person pers2 = pers1;
		assertEquals(pers1.hashCode(), pers2.hashCode());
	}
	
	/**
	 * Test method equals for objects with same reference
	 * 
	 */
	@Test
	public void testEqualsSameRef() {
		Person pers1 = new Person("surname", "prename");
		Person pers2 = pers1;
		assertTrue(pers1.equals(pers2));
	}
	
	/**
	 * Test method equals with different objects
	 */
	@Test
	public void testEqualsDiffRef() {
		Person pers1 = new Person("surname", "prename");
		Person pers2 = new Person("surname", "prename");
		assertFalse(pers1.equals(pers2));
	}
	
	/**
	 * Test method of compareTo().
	 */
	@Test
	public void testCompareTo0() {
		Person pers1 = new Person("surname","prename");
		Person pers2 = pers1;
		assertEquals(0,pers1.compareTo(pers2));
	}
	
	@Test
	public void testCompareTo1() {
		Person pers1 = new Person("surname", "prename");
		Person pers2 = new Person("surname", "prename");
		if (pers1.compareTo(pers2) == 1) {
			assertEquals(1,pers1.compareTo(pers2));
		}
		
	}
	
	@Test
	public void testCompareTo_1() {
		Person pers1 = new Person("surname", "prename");
		Person pers2 = new Person("surname", "prename");
		if (pers1.compareTo(pers2) == -1) {
			assertEquals(-1,pers1.compareTo(pers2));
		}
		
	}
	

}
