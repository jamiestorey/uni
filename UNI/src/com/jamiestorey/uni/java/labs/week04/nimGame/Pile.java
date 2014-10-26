
package com.jamiestorey.uni.java.labs.week04.nimGame;

/**
 * Models a pile of stickes.
 * 
 * @author Ian Bradley
 * @version V1
 */
public class Pile
{

	// instance variables - replace the example below with your own
	private int sticksLeft;

	/**
	 * Constructor for objects of class Pile
	 */
	public Pile(int initialSticks)
	{
		sticksLeft = initialSticks;
	}

	/**
	 * gets the number of sticks left in the pile.
	 * 
	 * @return the number of sticks left
	 */
	public int getStcksLeft()
	{
		return sticksLeft;
	}

	/**
	 * Reduces the number of sticks by the specified amount.
	 *
	 * @param number
	 *            the number to remove, must be greater than 0 and less than
	 *            number Left
	 * @return true if succesful otherwise false
	 */
	public boolean removeSticks(int number)
	{
		if ((number > 0) && (number <= sticksLeft))
		{

			sticksLeft = sticksLeft - number;
			return true;
		}
		return false;
	}

}
