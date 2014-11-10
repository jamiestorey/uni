package com.jamiestorey.uni.java.labs.week06.triangle;

/**
 * Write a description of class TwoDPoint here.
 * 
 * @author Jamie Storey
 * @version 29/10/14
 */
public class TwoDPoint
{

	private double x;
	private double y;

	public TwoDPoint()
	{
		x = 0;
		y = 0;
	}

	public TwoDPoint(double x, double y)
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

	public void setX(double x)
	{
		this.x = x;
	}

	public void setY(double y)
	{
		this.y = y;
	}

	public double distanceTo(TwoDPoint point)
	{
		double dx = x - point.getX();
		double dy = y - point.getY();

		// Math.hypot returns the sqrt (x^2 + y^2)
		double distance = Math.hypot(dx, dy);
		return distance;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o == null)
		{
			return false;
		}

		if (!(o instanceof TwoDPoint))
		{
			return false;
		}

		TwoDPoint otherPoint = (TwoDPoint) o;

		if ((otherPoint.getX() == x) && (otherPoint.getY() == y))
		{
			return true;
		} else
		{
			return false;
		}

	}
}
