package exercises6;

public class Sum {

	public static int sum(int n) {
		if (n <= 0) {
			// base case
			return 0;
		}
		else {
			// recursive call
			return sum(n-1) + n;
		}
	}
}
