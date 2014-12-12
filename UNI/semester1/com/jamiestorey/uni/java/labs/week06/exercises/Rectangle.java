
package com.jamiestorey.uni.java.labs.week06.exercises;

/**
 * A simple class representing a rectangle. Intended to be used in lecture 1 of
 * Programming 1.
 * 
 * @author Ian Bradley
 * @version July 2010
 */
public class Rectangle
{

	// instance variables
	private int length;
	private int breadth;

	/**
	 * Constructor for objects of class Rectangle.
	 */
	public Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	/**
	 * obtains the current value of length.
	 *
	 * @return the length
	 */
	public int getLength()
	{
		return length;
	}

	/**
	 * obtains the current value of breadth.
	 *
	 * @return the breadth
	 */
	public int getBreadth()
	{
		return breadth;
	}

	/**
	 * Calculates the area of the rectangle.
	 *
	 * @return the area of the rectangle
	 */
	public int calculateArea()
	{
		return length * breadth;
	}

	/**
	 * Calculate perimeter
	 * 
	 * @return the perimeter of the rectangle
	 */
	public int calculatePerimeter()
	{
		return 2 * (length + breadth);
	}

	public boolean equals(Object o)
	{
		// Check to make sure o is not null
		if (o == null) return false;
		// Check you if have same reference
		if (this == o) return true;
		// cast o to be a Student
		Rectangle other = (Rectangle) o;
		if ((other.getLength() == length) && (other.getBreadth() == breadth))
			return true;
		else
			return false;
	}

}
