
package com.jamiestorey.uni.java.labs.week10;

/**
 * Write a description of class ReverseArray here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReverseArray
{

	int[] numbers =
	{ 44, 55, 33, 21, 105 };

	public ReverseArray()
	{
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		System.out.println();

		reverse(numbers);
	}

	public void reverse(int[] data)
	{
		int left = 0;
		int right = data.length - 1;

		while (left < right)
		{
			// swap the values at the left and right indices
			int temp = data[left];
			data[left] = data[right];
			data[right] = temp;

			// move the left and right index pointers in toward the center
			left++;
			right--;
		}

		for (int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
	}

}
