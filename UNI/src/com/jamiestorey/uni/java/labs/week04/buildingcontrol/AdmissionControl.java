
package com.jamiestorey.uni.java.labs.week04.buildingcontrol;

/**
 * Write a description of class AdmissionControl here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class AdmissionControl
{

	// instance variables - replace the example below with your own
	private BoundedCounter noInBuilding;

	/**
	 * Constructor for objects of class AdmissionControl
	 * 
	 * @param maxOccupancy
	 *            the maximum nunber of people allowed in
	 */
	public AdmissionControl(int maxOccupancy)
	{
		noInBuilding = new BoundedCounter(maxOccupancy);
	}

	/**
	 * Controls entry to the buidling. Provided the building is not full the
	 * number inside is incremented and a message output If the building is full
	 * entry is refused.
	 * 
	 */
	public void enterBuilding()
	{
		boolean success = noInBuilding.incrementCount();
		if (success)
		{
			System.out.println(" number in building is "
					+ noInBuilding.getCount());
		}
		else
		{
			System.out.println("no entry building full");
		}
	}

	/**
	 * Controls exit from the building. Provided there was someone in the total
	 * inside is decremented If the building was supposed to be empty an erro
	 * message is output
	 * 
	 */
	public void leaveBuilding()
	{
		boolean success = noInBuilding.decrementCount();
		if (success)
		{
			System.out.println(" number in building is "
					+ noInBuilding.getCount());
		}
		else
		{
			System.out.println("Error - should be no one in building");
		}
	}

	/**
	 * Gets the number inside the building
	 *
	 * @return the number in the building
	 */
	public int getNumberInBuilding()
	{
		return noInBuilding.getCount();
	}

	/**
	 * Gets the maximum permitted cocupancy for the building
	 *
	 * @return the maximum occupancy
	 */
	public int getMaxOccupancy()
	{
		return noInBuilding.getMaxAllowed();
	}

}
