
package com.jamiestorey.uni.java.labs.week10.lectureExercises;

/**
 * Example to demonstrate use of Array of Objects. Manages a list of names. No
 * IO code
 * 
 * @author Ian Bradley
 * @version October 2010
 */
public class NameList
{

	// DECLARE ARRAY OF STRING CALLED names
	private String[] names;
	private int currentIndex;

	/**
	 * Constructor for objects of class NameList
	 */
	public NameList(int capacity)
	{
		names = new String[capacity];
		currentIndex = 0;
	}

	/**
	 * Adds a name to the list
	 *
	 * @param name
	 *            to add
	 */
	public boolean addName(String name)
	{
		// If there is space in the array then add the name
		if (currentIndex < names.length)
		{
			names[currentIndex] = name;
			currentIndex++;

			return true;
		}
		return false;
	}

	/**
	 * gets name for a given index
	 *
	 * @param index
	 *            position of name
	 * @return the name at position index
	 * 
	 */
	public String getName(int index)
	{
		if (index < currentIndex)
		{
			return names[index];
		}
		else
		{
			return "Index too large.";
		}
	}

	/**
	 * prints size of list
	 *
	 * @return the size of the list
	 */
	public int getSize()
	{
		return currentIndex;
	}

	/**
	 * replace an element with a new value
	 *
	 * @param index
	 *            position of name to remove
	 * @param name
	 *            the replacement value
	 */
	public boolean setName(int index, String name)
	{
		if (index < currentIndex)
		{
			names[index] = name;
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * remove a name
	 *
	 * @param index
	 *            position of name to remove
	 */
	public boolean removeName(int index)
	{
		if (index < currentIndex)
		{
			squash(index);
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * a search using a while loop
	 *
	 * @param targetName
	 *            name to search for
	 * @return the position of name in list
	 */
	public int search(String targetName)
	{
		int index = 0;
		boolean found = false;
		while (index < currentIndex && !found)
		{
			if (names[index].equals(targetName))
			{
				found = true;
			}
			else
			{
				index++;
			}
		}

		if (found)
		{
			return index;
		}
		else
		{
			return -1;
		}
	}

	/**
	 * @return the list of names
	 */
	public String toString()
	{
		String output = "";
		for (String nm : names)
		{
			output = output + nm + "\n";
		}
		return output;
	}

	private void squash(int index)
	{
		if (index >= 0)
		{
			for (int i = index; i < currentIndex - 1; i++)
			{
				names[i] = names[i + 1];
			}

			names[currentIndex - 1] = null;
			currentIndex--;
		}
	}

	public void makeSpace(int index)
	{
		if (currentIndex < names.length)
		{
			for (int i = currentIndex; i > index; i--)
			{
				names[i] = names[i - 1];
			}
			currentIndex--;
		}
	}

	public void printArray()
	{
		System.out.println(this);
	}

}
