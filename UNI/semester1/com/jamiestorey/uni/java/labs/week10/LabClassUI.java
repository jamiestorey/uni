
package com.jamiestorey.uni.java.labs.week10;

import java.util.Scanner;

/**
 * User Interface for Lab Class. To support array example
 * 
 * @author Ian Bradley. Amended by Alan Maughan
 * @version November 2012
 */
public class LabClassUI
{

	private Scanner keyboard;
	private LabClass labClass;
	private static final int MAX_ARRAY_ELEMENTS = 10;

	/**
	 * Constructor for LabClass
	 */
	public LabClassUI()
	{

		keyboard = new Scanner(System.in);
		labClass = new LabClass(MAX_ARRAY_ELEMENTS);
	}

	/**
	 * The main menu for the user interface.
	 */
	public void menu()
	{
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
		System.out.println("Options are:");
		System.out.println("   Add Student             1");
		System.out.println("   Remove Student          2");
		System.out.println("   Get Class Size          3");
		System.out.println("   Get a Student's Details 4");
		System.out.println("   Print Class List        5");
		System.out.println("   Quit                    0");
		System.out.println();
	}

	private int getCommand()
	{
		System.out.print("Enter command: ");
		int command = keyboard.nextInt();
		keyboard.nextLine();
		return command;
	}

	private void execute(int command)
	{
		if (command == 1)
			addStudent();
		else if (command == 2)
			removeStudent();
		else if (command == 3)
			getSize();
		else if (command == 4)
			getStudent();
		else if (command == 5)
			printList();
		else if (command == 0)
		{
			System.out.println(" Program closing down");
			System.exit(0);
		}
		else
			System.out.println("Unknown command");
	}

	private void addStudent()
	{
		String studentName = getString("Student Name");
		String id = getString("Student ID");
		labClass.enrolStudent(new Student(studentName, id));
	}

	private void removeStudent()
	{
		String studentName = getString("Student Name");
		boolean done = labClass.removeStudent(studentName);
		if (done)
			System.out.println("Student removed");
		else
			System.out.println("Student not found");
	}

	private void getSize()
	{
		System.out.println("There are " + labClass.getNumberOfStudents()
				+ " in the class");
	}

	private void getStudent()
	{
		String name = getString("Name");
		System.out.println(labClass.showStudent(name));
	}

	private void printList()
	{
		System.out.println(labClass.getClassList());
	}

	private String getString(String item)
	{
		System.out.print("Enter " + item + " : ");
		return keyboard.nextLine();
	}

}
