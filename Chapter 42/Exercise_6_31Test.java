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
		assertEquals(Exercise_6_31.sumOfDoubleEvenPlace(4388576018402636l), 39);
		assertEquals(Exercise_6_31.sumOfDoubleEvenPlace(43885760184026l), 33);
	}

	@Test
	public void testGetDigit() {
		assertEquals(Exercise_6_31.getDigit(5), 5);
		assertEquals(Exercise_6_31.getDigit(8), 8);
		assertEquals(Exercise_6_31.getDigit(12), 3);
	}

	@Test
	public void testsumOfOddPlace() {
		assertEquals(Exercise_6_31.sumOfOddPlace(4388576018402626l), 38);
		assertEquals(Exercise_6_31.sumOfOddPlace(4488576018402626l), 39);
		assertEquals(Exercise_6_31.sumOfOddPlace(43885760184026l), 32);
	}
	
	@Test
	public void testPrefixMatched() {
		assertTrue(Exercise_6_31.prefixMatched(4388576018402626l, 4));
		assertFalse(Exercise_6_31.prefixMatched(4388576018402626l, 2));
		assertTrue(Exercise_6_31.prefixMatched(5388576018402626l, 5));
	}
	
	@Test
	public void testGetSize() {
		assertEquals(Exercise_6_31.getSize(4388576018402626l), 16);
		assertEquals(Exercise_6_31.getSize(438857601840262l), 15);
		assertEquals(Exercise_6_31.getSize(43885760184026l), 14);
	}
	
	@Test
	public void testGetPrefix() {
		assertEquals(Exercise_6_31.getPrefix(4388576018402626l, 1), 4);
		assertEquals(Exercise_6_31.getPrefix(5388576018402626l, 1), 5);
		assertEquals(Exercise_6_31.getPrefix(3788576018402626l, 2), 37);
	}
}
