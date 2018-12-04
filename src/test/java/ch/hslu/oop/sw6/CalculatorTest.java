/**
 * 
 */
package ch.hslu.oop.sw6;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author silvan
 *
 */
public class CalculatorTest {

	@Test
	public void testAdditionNormal() {
		CalculatorService calc1 = new Calculator();
		int res = calc1.addition(3, 4);
		assertEquals(7,res);
		
	}
		
	@Test
	public void testAdditionZero() {
		Calculator calc2 = new Calculator();
		int res2 = calc2.addition(0,0);
		assertEquals(0,res2);
	}
	
	@Test
	public void testAdditionNegative() {
		Calculator calc3 = new Calculator();
		int res3 = calc3.addition(-4, -10);
		assertEquals(-14, res3);
	}
	
	
		
	}

