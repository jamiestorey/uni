
package com.jamiestorey.uni.java.labs.week05;

import java.util.Scanner;

/**
 * Write a description of class WhileTest here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhileTest
{

	private Scanner myScanner = new Scanner(System.in);

	public void slide31()
	{
		int i = 0;
		while (i < 10)
		{
			System.out.println(i);
			i++;
		}
	}

	public void slide34()
	{
		int count = 0;
		while (count <= 3)
		{
			System.out.println("count is:" + count);
			count++;
		}
		System.out.println("Done with the loop");
	}

	public void slide36()
	{
		int i, n, sum;
		i = 1;
		sum = 0;
		System.out.println("Enter a positive integer: ");
		n = myScanner.nextInt();

		while (i <= n)
		{
			sum = sum + i * i;
			System.out
					.println("[" + i + "} " + "Sum currently equals : " + sum);
			i++;
		}
		System.out.println("the sum is " + sum);
	}

	public void slide43()
	{
		int n;
		System.out.println("Enter a positve integer: ");
		n = myScanner.nextInt();
		while (n != 0)
		{
			System.out.println("" + n * n);
			System.out.println("Enter a positive integer:");
			n = myScanner.nextInt();
		}
	}
}
