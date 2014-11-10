
package com.jamiestorey.uni.java.labs.week08.exercises.rectangleUI;

import java.util.Scanner;

/**
 * Write a description of class TextTU here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class RectangleTUI
{

	private Rectangle rectangle;
	private Scanner keyboard;

	/**
	 * Constructor for objects of class TextTU
	 */
	public RectangleTUI()
	{
		rectangle = null;
		keyboard = new Scanner(System.in);
	}

	/**
	 * Method menu
	 *
	 */
	public void menu()
	{
		createRectangle();
		int command = -1;
		while (command != 0)
		{
			displayMenu();
			command = getCommand();
			execute(command);
		}
	}

	private void displayMenu()
	{
		System.out.println();
		System.out.println("Enter number denoting action to perform:");
		System.out.println("Display length.............[1]");
		System.out.println("Display breadth............[2]");
		System.out.println("Display area...............[3]");
		System.out.println("Display perimeter..........[4]");
		System.out.println("Create new rectangle.......[5]");
		System.out.println("Exit.......................[0]");
	}

	private int getCommand()
	{
		System.out.print("Enter command: ");
		int command = keyboard.nextInt();
		keyboard.nextLine();
		return command;
	}

	/**
	 * Method execute
	 *
	 * @param command
	 *            A parameter
	 */
	private void execute(int command)
	{

		if (command == 1)
			displayLength();
		else if (command == 2)
			displayBreadth();
		else if (command == 3)
			displayArea();
		else if (command == 4)
			displayPerimeter();
		else if (command == 5)
			createRectangle();
		else if (command == 0)
			System.out.println(" Program closing down");
		else
			System.err.println("Unknown command");
	}

	private void displayLength()
	{
		System.out.println("The length is " + rectangle.getLength());
	}

	private void displayBreadth()
	{
		System.out.println("The breadth is " + rectangle.getBreadth());
	}

	private void displayArea()
	{
		System.out.println("The area is " + rectangle.calculateArea());
	}

	private void displayPerimeter()
	{
		System.out
				.println("The perimeter is " + rectangle.calculatePerimeter());
	}

	private void createRectangle()
	{
		int length;
		int width;
		length = readIntWithPrompt("Rectangle length (a non-negative integer): ");
		width = readIntWithPrompt("Rectangle width (a non-negative integer): ");
		rectangle = new Rectangle(length, width);
	}

	private int readIntWithPrompt(String prompt)
	{
		System.out.print(prompt);
		int input = keyboard.nextInt();
		keyboard.nextLine();
		return input;
	}

}
