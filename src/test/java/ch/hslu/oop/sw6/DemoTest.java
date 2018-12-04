/**
 * 
 */
package ch.hslu.oop.sw6;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * @author silvan
 *
 */
public class DemoTest {

	/**
	 * Test method for {@link ch.hslu.oop.sw6.Demo#max(int, int)}.
	 */
	@Test
	public void testMaxIntInt() {
		assertEquals(1,2,2);
	}

	/**
	 * Test method for {@link ch.hslu.oop.sw6.Demo#max(int, int, int)}.
	 */
	@Test
	public void testMaxIntIntInt() {
		Demo demo1 = new Demo();
		int i = demo1.max(1, 3,5);
		assertEquals( 5, i );
	}
	
	@Test
	public void testTest() {
		System.out.println("@Test");
	}
	
	@Ignore
	public void testIgnore() {
		System.out.println("@Ignore");
	}
	
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@Before
	public void testBefore() {
		System.out.println("@Before");
	}
	
	@After
	public void testAfter() {
		System.out.println("@After");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("@AfterClass");
	}
	

}
