import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise_6_31Test {

	@Test
	public void testIsValid() {
		assertTrue(Exercise_6_31.isValid(4388576018402626l));
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
		assertTrue(Exercise_6_31.prefixMatched(4388576018402626l));
	}
	
	@Test
	public void testGetSize() {
		assertEquals(Exercise_6_31.getSize
	}
	
	@Test
	public void testGetPrefix() {
		assertEquals(Exercise_6_31.getPrefix(4388576018402626l), );
	}
}
