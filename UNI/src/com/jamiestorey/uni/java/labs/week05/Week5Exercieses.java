
package com.jamiestorey.uni.java.labs.week05;

import java.util.Scanner;

/**
 * Using loops and the Scanner class.
 * 
 * @author Jamie Storey
 * @version 23/10/2014
 */
public class Week5Exercieses
{

	private Scanner keyboard;
	public final static int NO_OF_INFINITE_LOOPS = 5;

	public Week5Exercieses()
	{
		keyboard = new Scanner(System.in);
	}

	public void ex1()
	{
		System.out.println("Enter a mark. (It must equal 0-100)");
		int mark = keyboard.nextInt();
		String grade = "";
		if ((mark > 0) && (mark <= 100))
		{
			if (mark < 40)
			{
				grade = "Fail";
			}
			else if ((mark >= 40) && (mark <= 49))
			{
				grade = "Third";
			}
			else if ((mark >= 50) && (mark <= 59))
			{
				grade = "Lower Second";
			}
			else if ((mark >= 60) && (mark <= 69))
			{
				grade = "Upper Second";
			}
			else if (mark >= 70)
			{
				grade = "First";
			}

			System.out.println(mark + " is Grade: " + grade);
		}
		else
		{
			if (mark < 0)
			{
				System.err.println("Mark entered was less than 0: " + mark);
			}
			else
			{
				System.err.println("Mark entered was over 100: " + mark);
			}

		}
	}

	public void ex2()
	{
		System.out.println("Enter a grade inital");
		String gradeChar = keyboard.next();
		String grade = "";

		switch (gradeChar)
		{
			case "d":
				grade = "Distinction";
				break;
			case "m":
				grade = "Merit";
				break;
			case "p":
				grade = "Pass";
				break;
			case "f":
				grade = "Fail";
				break;
			case "a":
				grade = "Absent from assessment";
				break;
			default:
				System.err.println("Illegal character entered: " + gradeChar);
		}
		if (grade != "")
		{
			System.out.println("Grade = " + grade);
		}
	}

	public void ex3()
	{
		int count = 1;
		while (count <= 10)
		{
			// System.out.println(count + "\t" + count * 2 + "\t" + count * 3);
			System.out.printf("%d\t%d\t%d%n", count, count * 2, count * 3);
			// times I created an infanite loop = 2
			count++;
		}
	}

	public void ex4()
	{
		int count = 1;
		do
		{
			System.out.printf("%d\t%d\t%d%n", count, count * 2, count * 3);
			count++;
		}
		while (count <= 10);
	}

	// public void ex5()
	// {
	// int sum = 0;
	// int count = 1;
	// int first;
	// int numbers = 0;
	// System.out.println("Enter numbers greater than 0. Enter 0 to exit.");
	// int input = keyboard.nextInt();
	// //times I created an infanite loop = 3
	// while (input != 0)
	// {
	//
	// numbers = keyboard.nextInt();
	// if (numbers == 0)
	// {
	// input = 0;
	// }
	// if (count == 1)
	// {
	// first = numbers;
	// sum = sum + numbers + first;
	// }
	// else
	// {
	//
	// sum = sum + numbers;
	// count++;
	// }
	//
	// }
	//
	// //sum++;
	// double average = sum / (count);
	// System.out.println("Sum is: " + sum);
	// System.out.println("Count is: " + count);
	// System.out.println("Average is: " + average);
	// }

	public void ex5()
	{
		int count = 0;
		double average;
		int sum = 0;
		System.out
				.println("Enter some numbers greater than 0. Enter 0 to exit.");
		int input = keyboard.nextInt();
		sum += input;

		while (input > 0)
		{
			input = keyboard.nextInt();
			sum += input;
			count++;
		}
		System.out.println("Sum: " + sum + "Count: " + count);
		average = (double) sum / count;

		System.out.println("The average is: " + average);
	}

	public void ex6()
	{
		int count = 0;
		double average;
		int sum = 0;
		System.out
				.println("Enter some numbers greater than 0. Enter 0 to exit.");
		int input = keyboard.nextInt();
		sum += input;

		do
		{

			input = keyboard.nextInt();
			sum += input;
			count++;
		}
		while (input > 0);

		System.out.println("Sum: " + sum + "Count: " + count);
		average = (double) sum / count;

		System.out.println("The average is: " + average);
	}

	public void ex7()
	{
		int count = 0;
		int sum = 0;
		System.out
				.println("Enter some numbers greater than 0. Enter 0 to exit.");
		int input = keyboard.nextInt();
		sum += input;
		while (input > 0)
		{
			input = keyboard.nextInt();
			sum += input;
			count++;
		}
		System.out.println("The sum is: " + sum);
	}

	public void ex8()
	{
		int count = 0;
		int sum = 0;
		System.out
				.println("Enter some numbers greater than 0. Enter 0 to exit.");
		int input = keyboard.nextInt();
		sum += input;
		if (input < 0)
		{
			System.err.println("You entered a negative number!");
			return;
		}
		while (input > 0)
		{

			input = keyboard.nextInt();
			sum += input;
			count++;
		}
		if (input < 0)
		{
			System.err.println("You entered a negative number!");
			return;
		}
		System.out.println("The sum is: " + sum);
	}

	public void ex9()
	{
		@SuppressWarnings("unused")
		int count = 0;
		int sum = 0;
		System.out
				.println("Enter some numbers greater than 0. Enter 0 to exit.");
		int input = keyboard.nextInt();
		sum += input;
		if (input < 0)
		{
			sum -= input;
			System.err.println("You entered a negative number!");
			input = keyboard.nextInt();
			sum += input;
		}
		while (input > 0)
		{

			input = keyboard.nextInt();
			sum += input;
			count++;
		}
		if (input < 0)
		{
			sum -= input;
			System.err
					.println("You entered a negative number! Enter a new number");
			input = keyboard.nextInt();
			sum += input;
		}
		System.out.println("The sum is: " + sum);
	}
}
