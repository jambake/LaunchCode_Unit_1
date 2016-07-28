package studio7;

public class Rectangle
{
	private int length, width/*, area, perimeter*/;

	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
		//this.area = this.length*this.width;
		//this.perimeter = (length*2) + (width*2);
	}

	public int getArea()
	{
		return this.length * this.width;
	}

	public int getPerimeter()
	{
		return (this.length*2) + (this.width*2);
	}


	public boolean isSmaller(Rectangle n)
	{
		if(n.getArea() > this.getArea())
		{
			System.out.println("I am smaller!");
			return true;
		} else
		{
			System.out.println("I am larger!");
			return false;
		}
	}

	public boolean isSquare()
	{
		if (this.length == this.width)
		{
			System.out.println("I am a square!");
			return true;
		} 
		else
		{
			System.out.println("I am a rectangle!");
			return false;
		}
	}

	public static void main(String[] args)
	{
		Rectangle R1 = new Rectangle(4, 2);
		Rectangle R2 = new Rectangle(6, 4);
		Rectangle R3 = new Rectangle(5, 5);
		System.out.println("R1 Area: " + R1.getArea());
		System.out.println("R2 Area " + R2.getArea());
		R1.isSmaller(R2);
		R2.isSmaller(R1);
		R3.isSquare();
		
	}
}
