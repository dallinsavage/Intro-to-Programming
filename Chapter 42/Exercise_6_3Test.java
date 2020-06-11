import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise_6_3Test {

	@Test
	public void testReverse() {
		assertEquals(Exercise_6_3.reverse(123), 321);
		assertEquals(Exercise_6_3.reverse(456), 654);
		assertEquals(Exercise_6_3.reverse(4269), 9624);
	}
	
	@Test
	public void testIsPalendrome() {
		assertTrue(Exercise_6_3.isPalindrome(1221));
		assertTrue(Exercise_6_3.isPalindrome(123321));
		assertFalse(Exercise_6_3.isPalindrome(123));

}
}