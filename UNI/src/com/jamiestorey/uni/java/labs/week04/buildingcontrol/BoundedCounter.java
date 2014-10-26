
package com.jamiestorey.uni.java.labs.week04.buildingcontrol;

/**
 * A simple counter.
 * 
 * @author Ian Bradley
 * @version 1.0
 */
public class BoundedCounter
{

	private int count;
	private int maxAllowed;

	/**
	 * Constructor for objects of class BoundedCounter Sets count to 0.
	 * 
	 * @param maxCount
	 *            the maximum value allowed
	 */
	public BoundedCounter(int maxCount)
	{
		count = 0;
		maxAllowed = maxCount;
	}

	/**
	 * Return value of counter.
	 * 
	 * @return current value of count
	 */
	public int getCount()
	{
		return count;
	}

	/**
	 * Return value of max allowed.
	 * 
	 * @return value of max allowed for count
	 */
	public int getMaxAllowed()
	{
		return maxAllowed;
	}

	/**
	 * adds 1 to the counter if counter is less than upper limit.
	 * 
	 * @return true if count incremented otherwise false
	 */
	public boolean incrementCount()
	{
		if (count < maxAllowed)
		{
			count = count + 1;
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Subtracts 1 from count provided count is greater than 0.
	 * 
	 * @return true if counter decremented otherwise false.
	 */
	public boolean decrementCount()
	{
		if (count > 0)
		{
			count = count - 1;
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * sets the counter to 0.
	 */
	public void resetCount()
	{
		count = 0;
	}
}
