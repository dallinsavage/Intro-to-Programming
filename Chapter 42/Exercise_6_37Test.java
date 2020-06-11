import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise_6_37Test {

	@Test
	public void testFormat() {
		assertEquals(Exercise_6_37.format(22, 3), "022");
		assertEquals(Exercise_6_37.format(22, 0), "22");
		assertEquals(Exercise_6_37.format(456, 5), "00456");
	}

}
