
package com.jamiestorey.uni.java.labs.week08.exercises.labClassUI;

import java.util.Scanner;

/**
 * Write a description of class TextUI here.
 * 
 * @author Jamie Storey
 * @version 10/11/2014
 */
public class TextUI
{

	private Scanner myScanner;
	private LabClass lab;

	public TextUI()
	{
		myScanner = new Scanner(System.in);
		lab = new LabClass();
	}

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
		System.out.println("Enter number denoting action to perform:");
		System.out.println("Display Class Details......[1]");
		System.out.println("Find Student by Name.......[2]");
		System.out.println("Add Student................[3]");
		System.out.println("Set Instructor.............[4]");
		System.out.println("Set Room Number............[5]");
		System.out.println("Set Time and Day...........[6]");
		System.out.println("Remove Student.............[7]");
		System.out.println("Get Class Size.............[8]");
		System.out.println("Quit.......................[0]");
		System.out.println();
	}

	private void execute(int command)
	{
		switch (command)
		{
			case 1:
				lab.printList();
				break;

			case 2:
				findStudentByName();
				break;

			case 3:
				addStudent();
				break;

			case 4:
				System.out.println("Enter the Instructor's name:");
				String instructorInput = myScanner.nextLine();
				instructorInput = myScanner.nextLine();
				lab.setInstructor(instructorInput);
				break;

			case 5:
				System.out.println("Eneter the Room number:");
				String roomInput = myScanner.nextLine();
				roomInput = myScanner.nextLine();
				lab.setRoom(roomInput);
				break;

			case 6:
				System.out
						.println("Enter the time and day in this format:  Tue 13:00");
				String timeAndDayInput = myScanner.nextLine();
				timeAndDayInput = myScanner.nextLine();
				lab.setTime(timeAndDayInput);
				break;

			case 7:
				removeStudent();
				break;

			case 8:
				System.out.println("The size of the class is "
						+ lab.numberOfStudents());
				break;

			case 0:
				System.exit(0);
				break;

			default:
				System.err.println("Unknown Command");
		}
	}

	private int getCommand()
	{
		System.out.print("Enter command: ");

		return myScanner.nextInt();
	}

	private void addStudent()
	{

		System.out.println("Eneter the Student's name:");
		String name = myScanner.nextLine();
		name = myScanner.nextLine();

		System.out.println("Enter the Student's ID");
		String id = myScanner.nextLine();

		Student newStudent = new Student(name, id);
		lab.enrollStudent(newStudent);
	}

	private void findStudentByName()
	{
		String name = "";
		System.out.println("Enter the name of the Student to search for");
		name = myScanner.nextLine();
		name = myScanner.nextLine();
		int pos = lab.findStudent(name);
		System.out.println(name + " is at " + pos + " in the list.");
	}

	private void removeStudent()
	{
		System.out.println("Enter the name of the Student to remove");
		String name = myScanner.nextLine();
		name = myScanner.nextLine();
		int studentIndex = lab.findStudent(name);

		lab.removeStudent(studentIndex);
	}

}
