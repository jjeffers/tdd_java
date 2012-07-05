package Money;

import junit.framework.TestCase;

public class MoneyTest extends TestCase {

	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(new Dollar(10), product);
		product = five.times(3);
		assertEquals(new Dollar(15), product);
	}

	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
}
