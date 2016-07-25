package lab5;

public class Lab5Methods {

	/**
	 * Sums down n by 2
	 * @param n is the integer input
	 * @return sum of n down by 2
	 */
	public static int sumDownBy2(int n) {
		int sum = 0;
		while (n >= 0){
			sum = sum + n;
			n = n - 2;
		}
		return sum;
	}

	/**
	 * Returns the harmonic sum of n
	 * @param n is the integer input
	 * @return sum of 1/n to n
	 */
	public static double harmonicSum(int n) {

		double sum = 0.0;
		while (n > 0) {
			sum = sum + (1.0/n);
			n--;
		}
		return sum;
	}

	/**
	 * Returns the geometric sum of k
	 * @param k is the double input
	 * @return sum of k to 1/(2^k)
	 */
	public static double geometricSum(int k) {
		double sum = 0.0;
		while (k >= 0) {
			sum = sum + (1/Math.pow(2, k));
			k--;
		}
		return sum;
	}

	/**
	 * Returns the product of positive ints j and k
	 * @param j first positive integer input
	 * @param k second positive integer input
	 * @return product of j and k
	 */
	public static int multPos(int j, int k) {
		int sum = 0; 
		for (int i = 0; i < k; i++) {
			sum = sum + j;
		}
		return sum;
	}

	/**
	 * Returns the product of any int j and k
	 * @param j first integer input
	 * @param k second integer inout
	 * @return product of any int j and k
	 */
	public static int mult(int j, int k) {
		if (j == 0 && k == 0) {
			return 0;
		} 
		else if ((j > 0 && k > 0) || (j < 0 && k < 0)) {
			return multPos(Math.abs(j), Math.abs(k));
		}
		else {
			return -multPos(Math.abs(j), Math.abs(k));
		}
	}

	/**
	 * Returns the exponential result of n^k
	 * @param n integer input
	 * @param k exponential input
	 * @return result of n^k
	 */
	public static int expt(int n, int k) {
		int sum = 0;
		if (k < 0) {
			return 0;
		} else if (k == 0) {
			return 1;
		} else {
			sum = n;
		}
		for (int i = 0; i < k - 1; i++) {
			sum = sum * n;
		}
		return sum;
	}



	public static void main(String[] args) {
	
	}
}
