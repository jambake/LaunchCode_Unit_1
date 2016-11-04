package studio7;

public class Die
{
	private int n, rolls;
	
	public Die(int n, int rolls)
	{
		this.n = n;
		this.rolls = rolls;
	}
	
	public int dieRolls()
	{
		for (int i = 0; i < this.rolls; i++)
		{
			n = (int) Math.random();
		}
		return n;
	}
}
