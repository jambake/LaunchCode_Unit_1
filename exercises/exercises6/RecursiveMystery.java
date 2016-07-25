package exercises6;

import sedgewick.StdOut;

public class RecursiveMystery
{
	/*
	 * mystery(2, 25) = mystery(4, 12) + 2
	 * 		  (4, 12) = 	   (8, 6)  + 4
	 * 		  (8, 6)  = 	   (16, 3) + 8
	 * 		  (16, 3) =		   (32, 1) + 16
	 * 		  (32, 1) = 	   (64, 0) + 32
	 * 		  (64, 0) = 0
	 * mystery(32, 1) = 0 + 32 = 32
	 * 		  (16, 3) = 32 + 16 = 48
	 * 		  (8, 6)  = 48 (2nd if statement)
	 * 		  (4, 12) = 48 (2nd if statement)
	 * 		  (2, 25) = 48 + 2 = 50 (final return)
	 */
	public static int mystery(int a, int b) {
		if (b == 0) {
			return 0;
		}
		if (b % 2 == 0) {
			return mystery(a + a, b/2);
		}
		return mystery(a + a, b/2) + a;
	}
	
	/*
	 * mystery2(0, 8) = mystery2(0, 4) (m = 4)
	 * 		   (0, 4) = mystery2(0, 2) (m = 2)
	 * 		   (0, 2) = mystery2(0, 1) (m = 1)
	 * 		   (0, 1) = mystery2(0, 0) (m = 0)
	 * mystery2(0, 0) = done
	 * print 0
	 * mystery2(0, 1) = mystery2(0, 0) (m = 0)
	 * mystery2(0, 0) = done
	 * print 0
	 * mystery2(0, 1) = mystery2(0, 0) (m = 0)
	 * mystery2(0, 0) = done
	 * print 0
	 * mystery2(0, 1) = mystery2(0, 0) (m = 0)
	 * mystery2(0, 0) = done
	 * print 0
	 * BROKEN
	 */
	public static void mystery2(int a, int b) {
		a = 0;
		b = 8;
		if (a != b) {
			int m = (a + b) / 2;
			mystery2(a, m);
			System.out.println(m);
			mystery2(m,b);
		}
	}

	public static void main(String[] args)
	{
		mystery2(0, 8);
	}

}
