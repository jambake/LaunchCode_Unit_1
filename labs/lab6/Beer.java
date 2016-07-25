package lab6;

public class Beer {


	public static String bottlesOfBeer(int n) {
		String beer = n + " bottles of beer on the wall, ";
		String beer2 = n + " bottles of beer;";
		String beer3 = " you take one down, pass it around, ";
		String beer4 = n-1 + " bottles of beer on the wall!";
		System.out.print(beer + beer2);
		if (n == 1) {
			return beer3 + "no more bottles of beer on the wall!";
		} 
		else {
			System.out.println(beer3 + beer4);
			return bottlesOfBeer(n-1);
		}
	}


	public static void main(String[] args) {
		System.out.println(bottlesOfBeer(5));
	}

}
