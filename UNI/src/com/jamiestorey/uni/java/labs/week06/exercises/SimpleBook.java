
package com.jamiestorey.uni.java.labs.week06.exercises;

/**
 * A class that maintains information on a book. This might form part of a
 * larger application such as a libray system, for instance.
 * 
 * Simplified for Week 6 lectoral exercise 2
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleBook
{

	// The fields
	private String author;
	private String title;

	/**
	 * Set the author and title fields when this object is constructed.
	 * 
	 * @param bookAuthor
	 *            the name of the authorof the book
	 * @param bookTitle
	 *            the name of the book.
	 */
	public SimpleBook(String bookAuthor, String bookTitle)
	{
		author = bookAuthor;
		title = bookTitle;
	}

	/**
	 * Returns the author of this book.
	 */
	public String getAuthor()
	{
		return author;
	}

	/**
	 * Returns the title of this book.
	 */
	public String getTitle()
	{
		return title;
	}

	public boolean equals(Object o)
	{
		// Check to make sure o is not null
		if (o == null) return false;
		// Check you if have same reference
		if (this == o) return true;
		// cast o to be a Student
		SimpleBook other = (SimpleBook) o;
		if ((other.getAuthor().equals(author))
				&& (other.getTitle().equals(title)))
			return true;
		else
			return false;
	}
}
