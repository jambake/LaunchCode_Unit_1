package lab5;

public class Lab5Methods {

	public static int sumDownBy2(int n) {
		int sum = 0;
		while (n >= 0){
			sum = sum + n;
			n = n - 2;
		}
		return sum;
	}

	public static double harmonicSum(int n) {

		double sum = 0.0;
		while (n > 0) {
			sum = sum + (1.0/n);
			n--;
		}
		return sum;
	}

	public static double geometricSum(int k) {
		double sum = 0.0;
		while (k >= 0) {
			sum = sum + (1/Math.pow(2, k));
			k--;
		}
		return sum;
	}

	public static int multPos(int j, int k) {
		int sum = 0; 
		for (int i = 0; i < k; i++) {
			sum = sum + j;
		}
		return sum;
	}


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

	public static int expt(int n, int k) {
		if (k < 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < k; i++) {

		}
	}



	public static void main(String[] args) {
		System.out.println(mult(-6, -2));
	}
}
