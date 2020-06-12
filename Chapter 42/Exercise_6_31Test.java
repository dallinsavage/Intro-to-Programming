import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise_6_31Test {

	@Test
	public void testIsValid() {
		assertFalse(Exercise_6_31.isValid(43885760184026265l));	
		assertFalse(Exercise_6_31.isValid(438857601840l));
		assertFalse(Exercise_6_31.isValid(2388576018402626l));
		assertFalse(Exercise_6_31.isValid(4388576018402626l));
		assertTrue(Exercise_6_31.isValid(4388576018410707l));
	}
	
	@Test
	public void testsumOfDoubleEvenPlace() {
		assertEquals(Exercise_6_31.sumOfDoubleEvenPlace(4388576018402626l), 37);
	}

	@Test
	public void testGetDigit() {
		assertEquals(Exercise_6_31.getDigit(5), 5);
	}

	@Test
	public void testsumOfOddPlace() {
		assertEquals(Exercise_6_31.sumOfOddPlace(4388576018402626l), 38);
	}
	
	@Test
	public void testPrefixMatched() {
		assertTrue(Exercise_6_31.prefixMatched(4388576018402626l, 4));
		assertFalse(Exercise_6_31.prefixMatched(4388576018402626l, 2));
	}
	
	@Test
	public void testGetSize() {
		assertEquals(Exercise_6_31.getSize(4388576018402626l), 16);
	}
	
	@Test
	public void testGetPrefix() {
		assertEquals(Exercise_6_31.getPrefix(4388576018402626l, 1), 4);
	}
}
