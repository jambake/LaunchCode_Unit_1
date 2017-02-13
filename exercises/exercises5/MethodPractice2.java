package exercises5;

public class MethodPractice2 {

	public static long factorial(int n) {
		if (n<0){
			throw new IllegalArgumentException();
		}
		long ans = 1;
		while(n>0) {
			ans = n*ans;
			n--;
		}
		return ans;
	}

	public static int[] fibo(int n) {
		int[] a = new int[n];
		if(n == 0) {
			return a;
		}
		else if (n == 1) {
			a[0] = 1;
			return a;
		}
		else {
			a[0] = 1;
			a[1] = 1;
			for(int i = 2; i < n; i++) {
				a[i] = a[i-2] + a[i-1];
			}
			return a;
		}
	}
	public static void main(String[] args) {
		long resultFact = factorial(5);
		System.out.println(resultFact);
		
		int[] resultFib = fibo(10);
		for(int i = 0; i < resultFib.length; i++) {
			System.out.print(resultFib[i] + " ");
		}
	}

}
