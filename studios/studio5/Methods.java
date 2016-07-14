package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return x*y;  
	}
	
	/**
	 * 
	 * @param x first int
	 * @param y second int
	 * @param z third int
	 * @return the average of the three ints
	 */
	public static double avg3(int x, int y, int z) { 
		return (x+y+z)/3;
	}
	
	/**
	 * 
	 * @param a is an array of doubles
	 * @return the sum of a[]
	 */
	public static double sumArray(double[] a) {
		double sum = 0.0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	/**
	 * 
	 * @param x is an array of doubles
	 * @return the average of x[]
	 */
	public static double average(double[] x) {
		return (sumArray(x)/x.length);
	}
	
	/**
	 * 
	 * @param s provided String
	 * @return moves first letter of string to end of string 
	 * 			then adds ay to end
	 */
	public static String pig(String s) {
		/*String a = s.substring(1);
		String b = s.substring(0, 1);
		String c = "ay";
		return a + b + c;*/
		return s.substring(1) + s.substring(0, 1) + "ay";
	}
	
	
	public static int[] callie(int[] a, int[] b) {
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}
}
