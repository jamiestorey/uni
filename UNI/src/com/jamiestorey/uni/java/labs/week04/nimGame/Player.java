
package com.jamiestorey.uni.java.labs.week04.nimGame;

/**
 * A Player fro a simple nim game.
 * 
 * @author Ian Bradley
 * @version 1.0
 */
public class Player
{

	private String name;
	private int numberTaken;

	/**
	 * Constructor for objects of class Player
	 * 
	 * @param name
	 *            the name of the palyer
	 */
	public Player(String name)
	{
		this.name = name;
		numberTaken = 0;
	}

	/**
	 * gets the name of the player
	 * 
	 * @return the name of the player
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Get the number of sticks taken on last turn
	 *
	 * @return the number of sticks taken on last turn
	 */
	public int getNumberTaken()
	{
		return numberTaken;
	}

	/**
	 * Remove the number of sticks specified from the given pile.
	 *
	 * @param number
	 *            number of sticks to to be removed, >0
	 * @param pile
	 *            the pile to be reduced
	 * @return true if successful otherwise false
	 */
	public boolean takeTurn(int number, Pile pile)
	{
		boolean success = pile.removeSticks(number);
		if (success)
		{
			numberTaken = number;
		}
		else
		{
			numberTaken = 0;
		}
		return success;
	}

}
