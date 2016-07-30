package lab7;

public class Point 
{
	private double x, y;

	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}
	
	public String toString()
	{
		return "[" + this.x + ", " + this.y + "]";
	}
	
	public Point plus(Vector n)
	{
		Point newP = new Point((this.x+n.getDeltaX()), (this.y+n.getDeltaY()));
		return newP;
	}
	
	public Vector minus(Point n)
	{
		Vector newV = new Vector((this.x-n.x), (this.y-n.y));
		return newV;
	}
	
	public double distance(Point n)
	{
		double distN = Math.sqrt((this.x - n.x)*(this.x - n.x) + (this.y - n.y)*(this.y - n.y));
		return distN;
	}
}
