
package com.jamiestorey.uni.java.labs.week12.christmasLecture;

import java.util.Scanner;

/**
 * This class represents Santa.
 * 
 * @author Ian Bradley
 * @version December 2010
 */
public class Santa
{

	private Scanner keyboard;
	private RandomSack sack;

	/**
	 * Constructor for objects of class Santa
	 */
	public Santa(RandomSack sack)
	{
		keyboard = new Scanner(System.in);
		this.sack = sack;
	}

	public void santaMenu()
	{
		introduction();
		while (sack.isSackLoaded())
		{
			givePresent();
		}
		wishHappyChristmas();
	}

	private void introduction()
	{
		System.out.println("Hello children ");
		System.out.println("I'm Santa ");
		System.out.println("I am going to give you presents");
	}

	private void givePresent()
	{
		Present present = sack.removeFromSack();
		if (present != null)
		{
			System.out.println("This is for " + present.readTo());
			System.out.println("It is from " + present.readFrom());
			System.out.println(present.readMessage());
			present.openPresent();
			System.out.println(" It is a " + present.getDescription());
			System.out.print("What do you say? ");
			keyboard.nextLine();
		}
		else
			System.out.println(" No more presents left");
	}

	private void wishHappyChristmas()
	{
		System.out.println("HAPPY CHRISTMAS");
	}

}
