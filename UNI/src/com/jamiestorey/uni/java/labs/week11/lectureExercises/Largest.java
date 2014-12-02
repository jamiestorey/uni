
package com.jamiestorey.uni.java.labs.week11.lectureExercises;

public class Largest
{

	public int largest(int[] list)
	{
		// int index, max = Integer.MAX_VALUE;
		int index, max = 0;

		// for (index=0; index < list.length-1; index++)
		for (index = 0; index < list.length; index++)
		{
			if (list[index] > max)
			{
				max = list[index];
			}
		}
		return max;
	}
}
