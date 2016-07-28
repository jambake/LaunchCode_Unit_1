package exercises7;

public class Cat
{
	/*
	 * has-a:
	 * 	color - String
	 * 	name - String
	 * 	age - int
	 * 	number of lives - int
	 *	fur - String
	 * 
	 * can-do:
	 * 	purr - int //"name purrs"
	 * 	meow - String //"name says meow"
	 *	shed - int // decrease amount
	 *	get older - int // increase age
	 */

	// Instance Variables
	private String name, color; 
	private int age, lives;
	private int fur;

	// Constructor (no return type, but returns the OBJECT: Cat)
	public Cat(String name, /*String color,*/ int fur)
	{
		this.name = name;
		//this.color = color;
		this.age = 0;
		this.lives = 9;
		this.fur = fur;
	}

	// Methods without "static" allows you to access the 'this.xxxxx' fields
	public /*static */ void purr()
	{
		System.out.println(this.name + " purrrrrrrrs");
	}
	public void meow()
	{
		System.out.println(this.name + " says MEEEEOOOOOOW");
	}
	public void shed(int amount)
	{
		if(amount <= this.fur)
		{
			this.fur -= amount;
			System.out.print("/");
			if(this.fur % 100 == 0)
			{
				System.out.println();
			}
		}
	}
	public void getOlder()
	{
		this.age++;
	}

	// Getters and Setters 
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setLives(int lives)
	{
		this.lives = lives;
	}

	public static void main(String[] args)
	{
		Cat po = new Cat("Po", 1000);
		System.out.println("Po has " + po.fur + " hairs before shedding");
		while (po.fur > 500) 
		{
			po.shed(1);
		}
		System.out.println("Po has " + po.fur + " hairs left");
		System.out.println();
		Cat kit = new Cat("Kit", 300);
		System.out.println("Kit has only " + kit.fur + " hairs before shedding");
		while (kit.fur > 0)
		{
			kit.shed(1);
		}
		System.out.println("Kit has " + kit.fur + " hairs left, and is now bald");
		System.out.println();
		System.out.println();
		
		po.setLives(7);
		kit.setLives(5);
		while (po.lives > 0 || kit.lives > 0)
		{
			
		}
		
	}


}
