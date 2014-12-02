
package com.jamiestorey.uni.java.labs.week11.lectureExercises;

/**
 * A counter class for use in demonstrating testing
 * 
 * @author Ian Bradley
 * @version 12-10-2006
 */

public class Counter
{

	// count should only take positive values.
	// 0 is counted as positive for this example
	private int count;

	/**
	 * Effects : Constructs a Counter object with count set to 0
	 * 
	 * Modifies: count
	 */
	public Counter()
	{
		count = 0;

	}

	/**
	 * Requires : i>= 0
	 * 
	 * Effects : Constructs a Counter object with count set to i
	 * 
	 * Modifies : count
	 * 
	 * @param i
	 *            initial value for counter
	 */
	public Counter(int i)
	{

		if (i >= 0) count = i;
	}

	/**
	 * Requires : i>= 0
	 * 
	 * Effects : count set to i
	 * 
	 * Modifies : count
	 * 
	 * @param i
	 *            new value for counter
	 */
	public void setCounter(int i)
	{
		if (i >= 0) count = i;
	}

	/**
	 * Effects : returns a String representation of count
	 * 
	 * Modifies : nothing
	 * 
	 * @return the current value of the counter as a String
	 */

	public String toString()
	{
		return "" + count;
	}

	/**
	 * Effects : returns int value of count
	 * 
	 * Modifies nothing
	 * 
	 * @return current value of counter
	 */
	public int getCounter()
	{
		return count;
	}

	/**
	 * Effects : increments Counter by 1
	 * 
	 * Modifies: count
	 */
	public void incCounter()
	{
		count++;
	}

	/**
	 * Effects : decements Counter by 1 if counter >0
	 * 
	 * Modifies count
	 */

	public void decCounter()
	{

		if (okCounter()) count--;
	}

	/**
	 * Effects : returns true if count > 0 otherwise false
	 * 
	 * Modifies : nothing
	 * 
	 * @return true when count > 0 otherwise false
	 */
	private boolean okCounter()
	{
		return count >= 0;
	}
}
