package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void test() {
		assertEquals(0, Sum.sum(0));
		assertEquals(1, Sum.sum(1));
		assertEquals(3, Sum.sum(2));
		//
		// recall Gauss' findings
		//	1 + 2 + ... + 99 + 100
		//	1 + 100 = 101
		//	2 +  99 = 101 
		//	etc...
		// n/2 pairs of integers that add to n+1
		for (int i = 0; i < 1000; i++) {
			int ans = i * (i+1)/2;
			assertEquals(ans, Sum.sum(i));
		}
	}

}
