
package com.jamiestorey.uni.java.labs.week09.exercises;

import java.util.Scanner;

/**
 * Write a description of class Week9Exercises here.
 * 
 * @author Jamie Storey
 * @version 20/11/2014
 */
public class Week9Exercises
{

	private Scanner keyboard;

	public Week9Exercises()
	{
		keyboard = new Scanner(System.in);
	}

	public void ex1()
	{
		int[] nums =
		{ 9, 15, -23, 4, 10 };

		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("Nums [" + i + "] " + nums[i]);
		}
	}

	public void ex2()
	{
		int[] nums = new int[5];

		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("Enter the value for the array");
			nums[i] = keyboard.nextInt();
		}

		System.out.println("Nums in order:");
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println("Nums [" + i + "] " + nums[i]);
		}

		System.out.println("\nNums in reverse order:");
		for (int i = nums.length - 1; i >= 0; i--)
		{
			System.out.println("Nums [" + i + "] " + nums[i]);
		}
	}

	public void ex3()
	{
		String[] names = new String[4];

		for (int i = 0; i < names.length; i++)
		{
			System.out.println("Enter a name for the array:");
			names[i] = keyboard.nextLine();
		}

		System.out.println("Names in order:");
		for (int i = 0; i < names.length; i++)
		{
			System.out.println("Name [" + i + "] " + names[i]);
		}

		System.out.println("\nNames one one line:");
		for (int i = 0; i < names.length; i++)
		{
			System.out.print(names[i] + ", ");
		}

	}

	public void ex5()
	{
		// Missing Code - declare and construct your array here
		int[] numbers = new int[10];
		int count = 0;
		int num;

		// Missing Code - ask for the 1st value and store it in num
		System.out
				.println("Eneter Posotive numbers for the array one at a time;");
		System.out
				.println("After entering the 9th index. On the 10th index enter 0 to continue on the 10th index");
		num = keyboard.nextInt();
		while (num != 0 && num > 0)
		{
			// Missing Code - assign num to array element
			numbers[count] = num;
			// Missing Code - increment count
			count++;
			// Missing Code - get and assign the next number num
			System.out.println("Eneter the next number for the array at index "
					+ count);
			num = keyboard.nextInt();
		}

		// Missing Code - check if only value entered was 0 (zero)
		int counter = 0;
		for (int i : numbers)
		{
			if (i == 0)
			{
				counter++;
			}
		}
		if (counter == numbers.length)
		{
			System.out.println("No values entered into array:");
		}
		// Missing Code - if this was not the case print out the contents of the
		// array
		// else print out the no values message
		else
		{
			for (int i = 0; i < numbers.length; i++)
			{
				System.out.println("Value [" + i + "] " + numbers[i]);
			}
		}
		// (Hint: What variable holds information as to the number of elements
		// that have values?)
	}

	public int[] numbers = new int[10];

	public void ex6()
	{
		int count = 0;
		int num;

		System.out
				.println("Eneter Posotive numbers for the array one at a time;");
		System.out
				.println("After entering the 9th index. On the 10th Index enter 0 to continue");
		num = keyboard.nextInt();
		while (num != 0 && num > 0)
		{
			numbers[count] = num;
			count++;
			System.out.println("Eneter the next number for the array at index "
					+ count);
			num = keyboard.nextInt();
		}

		int counter = 0;
		for (int i : numbers)
		{
			if (i == 0)
			{
				counter++;
			}
		}
		if (counter == numbers.length)
		{
			System.out.println("No values entered into array:");
		}
		else
		{
			for (int i = 0; i < numbers.length; i++)
			{
				System.out.println("Array in order");
				System.out.println("Value [" + i + "] " + numbers[i]);
			}

			System.out.println("\nThe max is: " + getMax() + "\n");
			System.out.println("The min is: " + getMin() + "\n");
			System.out.println("The aveage is: " + getAverage());
		}
	}

	private int getMax()
	{
		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] > max)
			{
				max = numbers[i];
			}
		}

		return max;
	}

	private int getMin()
	{
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++)
		{
			if (numbers[i] < min)
			{
				min = numbers[i];
			}
		}

		return min;
	}

	private double getAverage()
	{
		double avg = 0;

		for (int i = 0; i < numbers.length; i++)
		{
			avg = avg + numbers[i];
		}

		return avg / numbers.length;
	}
}
