
package com.jamiestorey.uni.java.labs.week06.triangle;

/**
 * Write a description of class Triangle here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle
{

	private TwoDPoint p1;
	private TwoDPoint p2;
	private TwoDPoint p3;

	public Triangle()
	{
		p1 = new TwoDPoint();
		p2 = new TwoDPoint();
		p3 = new TwoDPoint();
	}

	public Triangle(TwoDPoint p1, TwoDPoint p2, TwoDPoint p3)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public boolean secondEquals(Object obj)
	{
		Triangle otherTriangle = (Triangle) obj;

		double x1 = otherTriangle.p1.getX();
		double y1 = otherTriangle.p1.getY();

		double x2 = otherTriangle.p2.getX();
		double y2 = otherTriangle.p2.getY();

		double x3 = otherTriangle.p3.getX();
		double y3 = otherTriangle.p3.getY();

		double px1 = p1.getX();
		double py1 = p1.getY();

		double px2 = p2.getX();
		double py2 = p2.getY();

		double px3 = p3.getX();
		double py3 = p3.getY();

		// if p1 == p1 and p2 == p2 and p3 == p3
		if ((x1 == p1.getX()) && (y1 == p1.getY()))
		{
			if ((x2 == p2.getX()) && (y2 == p2.getY()))
			{
				if ((x3 == p3.getX()) && (y3 == p3.getY()))
				{
					System.out
							.println("All P's match exact: p1 == p1, p2 == p2, p3 == p3");
					return true;
				}
			}
		}

		if ((y1 == py1) && (x1 == px1) || (y1 == py2) && (x1 == px2)
				|| (y1 == py3) && (x1 == px3))
		{
			if ((y2 == py1) && (x2 == px1) || (y2 == py2) && (x2 == px2)
					|| (y2 == py3) && (x2 == px3))
			{
				if ((y3 == py1) && (x3 == px1) || (y3 == py2) && (x3 == px2)
						|| (y3 == py3) && (x3 == px3))
				{
					// System.out.println("Last If statement reached...");
					return true;
				}
			}
		}

		return false;
	}

	public boolean equals(Object obj)
	{
		if (obj == null) { return false; }

		if (!(obj instanceof Triangle)) { return false; }

		if (secondEquals(obj))
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	public double area()
	{
		double a = p1.distanceTo(p2);
		double b = p2.distanceTo(p3);
		double c = p3.distanceTo(p1);

		System.out.printf("A = %f B = %f C = %f\n", a, b, c);

		double s = (a + b + c) / 2;

		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.err.println("Area is " + area);
		return area;
	}
}
