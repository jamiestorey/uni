
package com.jamiestorey.uni.java.labs.week06.nameList;

import java.util.ArrayList;

/**
 * Example to demonstrate use of ArrayList. Manages a list of names. No IO code
 * 
 * @author Ian Bradley
 * @version October 2012
 */
public class StudentNameList
{

	// DECLARE ARRAYLIST CALLED names
	ArrayList<String> names;

	/*************************************************************
	 *************************************************************
	 ********************** IMPORTANT NOTE ************************ Remove the commenting in front of
	 * each method as you go ***
	 *************************************************************
	 *************************************************************
	 *************************************************************/
	/**
	 * Constructor for objects of class NameList
	 */
	public StudentNameList()
	{
		names = new ArrayList<String>();
	}

	/**
	 * Adds a name to the list
	 *
	 * @param name
	 *            to add
	 */
	public void addName(String name)
	{
		names.add(name);
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
		return (String) names.get(index);
	}

	/**
	 * prints size of list
	 *
	 * @return the size of the list
	 */
	public int getSize()
	{
		return names.size();
	}

	/**
	 * replace an element with a new value
	 *
	 * @param index
	 *            position of name to remove
	 * @param name
	 *            the replacement value
	 */
	public void setName(int index, String name)
	{
		names.set(index, name);
	}

	/**
	 * remove a name
	 *
	 * @param index
	 *            position of name to remove
	 */
	public void removeName(int index)
	{
		names.remove(index);
	}

}
