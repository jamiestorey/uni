
package com.jamiestorey.uni.java.labs.week12.christmasLecture;

import java.util.ArrayList;
import java.util.Random;

/**
 * The Sack is a collection data structure. Items must be added to a Sack before
 * it can be used. When a Sack is loaded items can be removed. Items are removed
 * in random order. During the remove phase items cannot be added to a Sack. The
 * remove phase ends when the Sack is empty.
 * 
 * @author Ian Bradley
 * @version December 201
 */
public class RandomSack
{

	private ArrayList<Present> sack;
	private boolean loaded;
	private Random randomGenerator;

	/**
	 * Constructor for objects of class Sack
	 */
	public RandomSack()
	{
		sack = new ArrayList<Present>();
		loaded = false;
		randomGenerator = new Random();

	}

	public void addToSack(Present present)
	{
		if (!loaded) sack.add(present);

	}

	public Present removeFromSack()
	{
		if (loaded)
		{
			if (sack.isEmpty())
			{
				loaded = false;
				return null;
			}
			else
			{
				int index = getIndex();
				return sack.remove(index);
			}
		}
		else
			return null;
	}

	private int getIndex()
	{
		return randomGenerator.nextInt(sack.size());
	}

	public void closeSack()
	{
		loaded = true;
	}

	public boolean isSackLoaded()
	{
		return loaded;
	}

}
