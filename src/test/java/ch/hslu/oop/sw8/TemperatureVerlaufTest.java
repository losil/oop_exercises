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
public class TemperatureVerlaufTest {

	/**
	 * Test method for {@link ch.hslu.oop.sw8.TemperatureVerlauf#add(ch.hslu.oop.sw8.Temperature)}.
	 */
	@Test
	public void testAdd() {
		TemperatureVerlauf tempverlauf1 = new TemperatureVerlauf();
		Temperature temp1 = new Temperature(3.5);
		tempverlauf1.add(temp1);
		assertEquals(1, tempverlauf1.getCount());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw8.TemperatureVerlauf#clear()}.
	 */
	@Test
	public void testClear() {
		TemperatureVerlauf tempverlauf1 = new TemperatureVerlauf();
		Temperature temp1 = new Temperature(3.5);
		Temperature temp2 = new Temperature(3.6);
		tempverlauf1.add(temp1);
		tempverlauf1.add(temp2);
		assertEquals(2, tempverlauf1.getCount());
		tempverlauf1.clear();
		assertEquals(0,tempverlauf1.getCount());
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw8.TemperatureVerlauf#getCount()}.
	 */
	@Test
	public void testGetCount() {
		TemperatureVerlauf tempverlauf1 = new TemperatureVerlauf();
		Temperature temp1 = new Temperature(3.5);
		Temperature temp2 = new Temperature(3.6);
		tempverlauf1.add(temp1);
		tempverlauf1.add(temp2);
		assertEquals(2, tempverlauf1.getCount());
	}
	
	@Test
	public void testToString() {
		TemperatureVerlauf tempverlauf1 = new TemperatureVerlauf();
		assertNotNull(tempverlauf1.toString());
	}
	
	@Test 
	public void testHashCode() {
		TemperatureVerlauf tempverlauf1 = new TemperatureVerlauf();
		TemperatureVerlauf tempverlauf2 = tempverlauf1;
		tempverlauf1.add(new Temperature(3.5));
		assertEquals(tempverlauf2.hashCode(), tempverlauf1.hashCode());
	}
	
	@Test
	public void testEquals() {
		TemperatureVerlauf tempverlauf1 = new TemperatureVerlauf();
		TemperatureVerlauf tempverlauf2 = tempverlauf1;
		TemperatureVerlauf tempverlauf3 = new TemperatureVerlauf();
		assertTrue(tempverlauf1.equals(tempverlauf2));
		tempverlauf3.add(new Temperature(3.5));
		assertFalse(tempverlauf1.equals(tempverlauf3));
		
	}
	
	public void testComapreTo() {
		TemperatureVerlauf tempverlauf1 = new TemperatureVerlauf();
		TemperatureVerlauf tempverlauf3 = new TemperatureVerlauf();
		assertEquals(0, tempverlauf1.compareTo(tempverlauf3));
		tempverlauf1.add(new Temperature(34.5));
		assertEquals(-1, tempverlauf1.compareTo(tempverlauf3));
		tempverlauf3.add(new Temperature(3.5));
		tempverlauf3.add(new Temperature(3.1));
		assertEquals(1, tempverlauf1.compareTo(tempverlauf3));
	}
	
	public void testGetMaxTemp() {
		TemperatureVerlauf tempverlauf1 = new TemperatureVerlauf();
		tempverlauf1.add(new Temperature(3.5));
		tempverlauf1.add(new Temperature(29.4));
		tempverlauf1.add(new Temperature(29.3));
		tempverlauf1.add(new Temperature(21.0));
		assertEquals(29.4, tempverlauf1.getMaxTemp(),0);
		
		TemperatureVerlauf tempverlauf2 = new TemperatureVerlauf();
		assertEquals(0,tempverlauf2.getMaxTemp(),0);
		
	}
	
	public void testGetAverageTemp() {
		TemperatureVerlauf tempverlauf1 = new TemperatureVerlauf();
		tempverlauf1.add(new Temperature(3.5));
		tempverlauf1.add(new Temperature(29.4));
		tempverlauf1.add(new Temperature(29.3));
		tempverlauf1.add(new Temperature(21.0));
		assertEquals(83.2, tempverlauf1.getAverageTemp(),0);
		
		TemperatureVerlauf tempverlauf2 = new TemperatureVerlauf();
		assertEquals(0,tempverlauf2.getAverageTemp(),0);
	}

}
