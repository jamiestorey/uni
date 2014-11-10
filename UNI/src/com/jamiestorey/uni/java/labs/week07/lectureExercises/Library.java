
package com.jamiestorey.uni.java.labs.week07.lectureExercises;

import java.util.ArrayList;

/**
 * Write a description of class Library here.
 * 
 * @author Jamie Storey
 * @version 2/11/14
 */
public class Library
{

	private ArrayList<SimpleBook> books;

	/**
	 * Constructor for objects of class Library
	 */
	public Library()
	{
		books = new ArrayList<SimpleBook>();
	}

	public void addBook(SimpleBook book)
	{
		books.add(book);
	}

	public int getNumberOfBooks()
	{
		return books.size();
	}

	public int findFirstIndexOf(SimpleBook book)
	{
		return books.indexOf(book);
	}

	public int findLastIndexOf(SimpleBook book)
	{
		return books.lastIndexOf(book);
	}

	public int search3(SimpleBook targetBook)
	{
		for (SimpleBook book : books)
		{
			if (book.equals(targetBook)) { return books.indexOf(book); }
		}
		return -1;
	}

}
