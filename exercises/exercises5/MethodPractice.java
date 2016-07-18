package exercises5;

public class MethodPractice {

	//Method that takes in two values called a and b 
	//	should return the remainder of a/b
	//	cannot use % operator

	public static int remainder(int a, int b) 
	{
		while (a >= b)
		{
			a = a - b;
		}
		return a;
	}

	//Method called isEven that takes an int and
	//	returns if the int is even

	public static boolean isEven(int n) 
	{
		return remainder(n, 2) == 0;
	}

	//Method that takes in two arrays and determines
	//	if the arrays are exactly the same (length and values)
	//	return true or false

	public static boolean sameArray(int[] a, int[] b)
	{	
		if (a.length != b.length)
		{
			return false;
		} 
		for (int i = 0; i < a.length; i++)
		{
			if(a[i] != b[i])
			{
				return false;
			}
		}
		return true;
	}

	//Method that takes in String and counts how many
	//	times a letter shows up
	
	public static int letterCount(String s, char findMe)
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == findMe)
			{
				count++;
			}
		}
		return count;	
	}
	
	
	public static int[] callie(int[] a, int[] b) {
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}
		
	
		
	public static void main(String[] args) 
	{

		//System.out.println(remainder(7,3));
		
		//int ans = remainder(7, 3);
		//System.out.println(ans);
		
		//System.out.println(isEven(25));
		
		//boolean even = isEven(25);
		//System.out.println(even);

		/*int[] a = {1, 2, 3};
		int[] b = {1, 2, 3};
		boolean same = sameArray(a, b);
		System.out.println(same);*/
		
		//System.out.println(letterCount("google", 'o'));
		
		int[] c = callie(new int[]{1, 2, 3}, new int[]{4, 5, 6});
		System.out.println(c[0] + " " + c[1] + " " + c[2]);
	}
}
