package exercises6;

public class RecursionPractice {

	public static void main (String[] args) {

		/*
		int ans = gcd(15, 10); // 5
		int ans2 = gcd(6, 2);  // 2
		int ans3 = gcd(36, 13);// 1 (13 is prime)
		System.out.println(ans);
		System.out.println(ans2);
		System.out.println(ans3);
		*/
		
		boolean ans4 = strcmp("hello", "hello");
		boolean ans5 = strcmpR("hello", "hello");
		System.out.println(ans4);
		System.out.println(ans5);

	}

	/*
	 *  gcd(36, 13) = gcd(13, 10)
	 *  gcd(13, 10) = gcd(10, 3)
	 *  gcd(10, 3) = gcd(3, 1)
	 *  gcd(3, 1) = 1
	 *  gcd(10, 3) = 1
	 *  gcd(13, 10) = 1
	 *  gcd(36, 13) = 1
	 */


	public static int gcd(int m, int n) {

		if (m % n == 0) {
			return n;
		}
		else {
			return gcd (n, m % n);
		}
	}


	public static boolean strcmp(String x, String y) {

		if (x.length() != y.length()) {
			return false;
		}
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) != y.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean strcmpR(String x, String y) {
		if (x.length() != y.length()) {
			return false;
		}
		// start off your recursive method
		return strcmpR2(x, y, 0);
	}

	private static boolean strcmpR2(String x, String y, int i) {
		if (i == x.length()) {
			return true;
		}
		else if (x.charAt(i) != y.charAt(i)) {
			return false;
		}
		else {
			return strcmpR2(x, y, i+1);
		}
		// could also use .substring to remove first letter once checked
		//		no need to use int i and finishes when x.length == 0
	}

	// base case: end of string
	// base case: two chars that don't match

}

