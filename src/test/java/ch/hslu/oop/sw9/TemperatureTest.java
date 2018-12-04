/**
 * 
 */
package ch.hslu.oop.sw9;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author silvan
 *
 */
public class TemperatureTest {

	/**
	 * Test method for {@link ch.hslu.oop.sw9.Temperature#createFromCelsius(double)}.
	 */
	@Test
	public void testCreateFromCelsius() {
		assertNotNull(Temperature.createFromCelsius(20));

	}

	/**
	 * Test method for {@link ch.hslu.oop.sw9.Temperature#createFromKelvin(double)}.
	 */
	@Test
	public void testCreateFromKelvin() {
		assertNotNull(Temperature.createFromKelvin(10));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptionMinKelvinValue() {
		Temperature.createFromKelvin(-20);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testExceptionMinKelvin2() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("No temperatures below 0 Kelvin possible!");
		Temperature.createFromKelvin(-1);
		
	}
	
	
	
	

}
