package studio7;

public class Fraction
{
	private int num, denom;
	
	
	public Fraction(int num, int denom)
	{
		this.num = num;
		this.denom = denom;
		
	}
	
	public String addFrac(Fraction x)
	{
		int newDenom = this.denom * x.denom;
		int newNum = (this.num * x.denom) + (this.denom * x.num);
		Fraction sumFrac = new Fraction(newNum, newDenom);
		//System.out.println(sumFrac.num + " / " + sumFrac.denom);
		return this.num + " / " + this.denom + " + " + x.num + " / " + x.denom + " = " + sumFrac.num + " / " + sumFrac.denom;
	}
	
	
	
	public static void main(String[] args)
	{
		Fraction f1 = new Fraction(1, 4);
		Fraction f2 = new Fraction(3, 6);
		System.out.println(f1.addFrac(f2));
	}
}
