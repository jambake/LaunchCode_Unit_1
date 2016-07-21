package factorial;

public class Factorial {

	// modeled after codes from the slides
	
	public static int factorial(int n) {
		if (n <= 0) {
			return 1;
		} 
		else {
			return n * factorial(n-1);
		}
	}
}
/*
	fact(3) = 3 * fact(3-1)
			= 3 * fact(2)
			= 3 * 2 * fact(2-1)
			= 3 * 2 * 1 * fact(0)
			= 3 * 2 * 1 * 1  <---
			= 3 +   2 +	1
*/