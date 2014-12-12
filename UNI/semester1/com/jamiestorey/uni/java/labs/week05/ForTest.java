
package com.jamiestorey.uni.java.labs.week05;

/**
 * Write a description of class ForTest here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForTest
{

	// From
	// http://stackoverflow.com/questions/23625196/nested-loop-centering-characters
	public void tree(int height)
	{

		int counter = 1;
		int spaces = height - 1;
		for (int row = 1; row <= height; row++)
		{

			for (int j = 1; j <= spaces; j++)
			{
				System.out.print(" ");
			}

			for (int j = 1; j <= counter; j++)
			{
				System.out.print("*");
			}

			System.out.println("");
			counter += 2;
			spaces--;
		} // end of outer loop

		counter -= 2; // length of last line

		for (int i = 1; i <= counter / 2 - 1; i++)
		{
			System.out.print(" ");
		}
		System.out.print("===");
	}

	// http://stackoverflow.com/questions/19551794/draw-a-christmas-tree-with-x
	public static void drawChristmasTree(int n)
	{
		for (int i = 0; i < n; i++)
		{
			triangle(i + 1, n);
		}
	}

	// http://stackoverflow.com/questions/19551794/draw-a-christmas-tree-with-x
	public static void triangle(int n, int max)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < max - i - 1; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++)
			{
				System.out.print("X");
			}
			System.out.println("");
		}
	}
}
