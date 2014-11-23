
package com.jamiestorey.uni.java.labs.week09.exercises;

import java.util.Scanner;

/**
 * This program uses three arrays to hold infomation about CDs the first element
 * in each array relates to a particular CD and so does the second etc. This
 * information is then manipulated in several ways.
 * 
 * @author (Your name)
 * @version (Your date)
 */

public class Books
{

	private Scanner keyboard;
	private String authors[] =
	{ "Sierra", "Savich", "Deitel", "Liang", "Barnes" };
	private String titles[] =
	{ "Head First Java", "Absolute Java", "How To Program", "Intro to Java",
			"Java with BlueJ" };
	private int cost[] =
	{ 22, 35, 52, 34, 40 };

	public Books()
	{
		keyboard = new Scanner(System.in);
	}

	/**
	 * This method prints out a heading for the Books info then prints each
	 * book's details on a separate line.
	 */
	public void printBooks()
	{
		for (int i = 0; i < titles.length; i++)
		{
			System.out.println(titles[i]);
			System.out.println(authors[i]);
			System.out.println(cost[i]);
			System.out.println();
		}

	} // end printBooks

	/**
	 * This method obtains an author'sname then checks each book in turn to see
	 * if the input author matches with any of the books using
	 * author.equals(authors[i])) and if it does outputs the book details on one
	 * line.
	 */
	public void printAuthorsBooks()
	{
		System.out.println("Enter the name of the Author to search for:");
		String author = keyboard.nextLine();
		for (int i = 0; i < authors.length; i++)
		{
			if (author.equals(authors[i]))
			{
				System.out.println("Title: " + titles[i] + "  Author: "
						+ authors[i] + " Cost: " + cost[i]);
				System.out.println();
			}
		}
	} // end printAuthorBooks

	/**
	 * This method printBooksLessThan40 - checks the cost of each book and if it
	 * is less than £40 outputs the book's info.
	 */
	public void printBooksLessThan40()
	{
		for (int i = 0; i < cost.length; i++)
		{
			if (cost[i] < 40)
			{
				System.out.println("Books that cost less than £40");
				// System.out.println("Title: " + titles[i] + "  Author: " +
				// authors[i] + " Cost: " + cost[i]);
				System.out.println(titles[i]);
				System.out.println(authors[i]);
				System.out.println(cost[i]);
				System.out.println();
			}
		}
	} // end printBooksLessThan40
} // end class
