package factorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
	// @Test directive below is necessary for 
	//	  the method below it to be run
	//	  as a unit test
	@Test
	public void test() {
		assertEquals(1, Factorial.factorial(0));
		assertEquals(1, Factorial.factorial(1));
		assertEquals(6, Factorial.factorial(3));
	}

}
