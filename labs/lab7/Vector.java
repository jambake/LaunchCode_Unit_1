package lab7;

public class Vector 
{
	private double deltaX, deltaY;

	public Vector(double deltaX, double deltaY)
	{
		this.deltaX = deltaX;
		this.deltaY = deltaY;
	}

	public String toString()
	{
		return "[" + this.deltaX + ", " + this.deltaY + "]";
	}

	public double getDeltaX()
	{
		return deltaX;
	}

	public double getDeltaY()
	{
		return deltaY;
	}

	public double magnitude()
	{
		return Math.sqrt((this.deltaX * this.deltaX) + (this.deltaY * this.deltaY));
	}

	public Vector deflectX()
	{
		if (this.deltaX == 0)
		{
			Vector zeroX = new Vector(this.deltaX, this.deltaY);
			return zeroX;
		}
		else if (this.deltaX > 0)
		{
			Vector negX = new Vector(-this.deltaX, this.deltaY);
			return negX;
		}
		else
		{
			Vector posX = new Vector(Math.abs(this.deltaX), this.deltaY);
			return posX;
		}
	}
	public Vector deflectY()
	{
		if (this.deltaY == 0)
		{
			Vector zeroY = new Vector(this.deltaX, this.deltaY);
			return zeroY;
		}
		else if (this.deltaY > 0)
		{
			Vector negY = new Vector(this.deltaX, -this.deltaY);
			return negY;
		}
		else
		{
			Vector posY = new Vector(this.deltaX, Math.abs(this.deltaY));
			return posY;
		}
	}

	public Vector plus(Vector n)
	{
		Vector plusAns = new Vector((this.deltaX+n.deltaX), (this.deltaY+n.deltaY));
		return plusAns;
	}
	
	public Vector minus(Vector n)
	{
		Vector minusAns = new Vector((this.deltaX-n.deltaX), (this.deltaY-n.deltaY));
		return minusAns;
	}
	
	public Vector scale(double factor)
	{
		Vector factorAns = new Vector((this.deltaX*factor), (this.deltaY*factor));
		return factorAns;
	}
	
	public Vector rescale(double magnitude)
	{
		double scaleFactor = magnitude();
		if (scaleFactor == 0)
		{
			Vector magZero = new Vector(magnitude, 0);
			return magZero;
		}
		else
		{
		Vector rescaleAns = new Vector((this.deltaX*magnitude/scaleFactor), (this.deltaY*magnitude/scaleFactor));
		return rescaleAns;
		}
	}
}

