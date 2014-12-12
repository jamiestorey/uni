
package com.jamiestorey.uni.java.labs.week12.christmasLecture;

import java.util.Scanner;

/**
 * Represents Sanat's helper who loads up the sack.
 * 
 * @author Ian Bradley
 * @version December 2010
 */
public class Elf
{

	private Scanner keyboard;
	private RandomSack sack;

	/**
	 * Constructor for objects of class Elf
	 */
	public Elf()
	{
		keyboard = new Scanner(System.in);
		sack = new RandomSack();
	}

	public void elfMenu()
	{
		introduction();
		String description = askForPresent();
		while (!(description.equals("")) && !(sack.isSackLoaded()))
		{
			Present present = new Present(description);
			Label label = writeLabel();
			present.wrapPresent(label);
			placeInSack(present);
			description = askForPresent();
		}
		sayThankYou();
	}

	private void introduction()
	{
		System.out.println("Hi I'm Santa's helper.");
		System.out
				.println("If you give me a present I'll wrap it and put it in the sack");
	}

	private String askForPresent()
	{
		System.out.print("Please tell me what the present is ");
		return keyboard.nextLine();
	}

	private Label writeLabel()
	{
		System.out.print("who is the present for? ");
		String receiver = keyboard.nextLine();
		System.out.print("who is the present from? ");
		String giver = keyboard.nextLine();
		System.out.print("what message go you want on the label? ");
		String message = keyboard.nextLine();
		if (giver.equals(""))
			return new Label(message);
		else
			return new Label(giver, receiver, message);
	}

	private void placeInSack(Present present)
	{
		sack.addToSack(present);
	}

	private void sayThankYou()
	{
		sack.closeSack();
		System.out.println(" the sack is loaded so no more presents");
		System.out.println("I will pass it to Santa");

	}

	public RandomSack passSack()
	{
		return sack;
	}
}
