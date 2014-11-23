
package com.jamiestorey.uni.java.labs.week09.lectureExercises;

/**
 * Write a description of class Exercise here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise
{

	private int[] array =
	{ -20, 19, 1, 5, -1, 27, 19, 5, 102, 103, -77, -103 };

	public int maxArray()
	{
		int max = array[0];

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}

		return max;
	}

	public int minArray()
	{
		int min = array[0];

		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < min)
			{
				min = array[i];
			}
		}

		return min;
	}
}
