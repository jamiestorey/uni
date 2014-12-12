
package com.jamiestorey.uni.java.labs.week09.lectureExercises;

import java.util.Scanner;

/**
 * Array of Primitive Type Example. Holds rainData values. For convience we
 * include the IO in this class - BAD PRACTICE
 * 
 * @author Ian Bradley
 * @version October 2010
 */
public class rainData
{

	// ADD CODE declare an array called rainData
	private Scanner keyboard;
	private double[] rainData;

	/**
	 * Constructor for objects of class rainData
	 * 
	 * @param numberMonths
	 *            number of months of data
	 */
	public rainData(int numberValues)
	{
		rainData = new double[5];
		keyboard = new Scanner(System.in);
	}

	/**
	 * Obtains the rainData data from the user
	 * 
	 */
	public void inputRainData()
	{
		for (int i = 0; i < rainData.length; i++)
		{
			System.out.println("Enter rainData value:");
			rainData[i] = keyboard.nextDouble();
		}

	}

	/**
	 * Outputs the rainData values
	 * 
	 */
	public void printrainDataReport()
	{
		System.out.println("rainData");
		for (int i = 0; i < rainData.length; i++)
		{
			System.out.println("Rain for " + i + " is " + rainData[i]);
		}
		System.out.println("Average rainData is " + averagerainData());
		System.out.println("Maximum rainData is " + getMax());
		System.out.println("Minimum rainData is " + getMin());
	}

	/**
	 * finds the maximum rainData
	 * 
	 * @return the maximum rainData in the data
	 */
	private double getMax()
	{
		double max = rainData[0];

		for (int i = 0; i < rainData.length; i++)
		{
			if (rainData[i] > max)
			{
				max = rainData[i];
			}
		}

		return max;
	}

	/**
	 * finds the minimum rainData
	 * 
	 * @return the minimum rainData in the data
	 */
	private double getMin()
	{
		double min = rainData[0];

		for (int i = 1; i < rainData.length; i++)
		{
			if (rainData[i] < min)
			{
				min = rainData[i];
			}
		}

		return min;
	}

	/**
	 * Calculates the average rainData
	 * 
	 * @return the average rainData
	 */
	private double averagerainData()
	{
		double avg = 0;
		for (int i = 0; i < rainData.length; i++)
		{
			avg = avg + rainData[i];
		}

		return avg / rainData.length;
	}
}
