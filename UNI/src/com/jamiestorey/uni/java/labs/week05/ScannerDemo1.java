
package com.jamiestorey.uni.java.labs.week05;

import java.util.Scanner;

/**
 * Write a description of class Week5 here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScannerDemo1
{

	private Scanner myScanner;

	public ScannerDemo1()
	{
		myScanner = new Scanner(System.in);
	}

	public void demo1()
	{
		System.out.println("Enter number of students" + " & then assignments");

		int students = myScanner.nextInt();
		int assignments = myScanner.nextInt();

		int total = (students * assignments);
		System.out.println("Total assignemtns: " + total);
	}

	public void ehcoLine()
	{
		System.out.print("Enter a line ");
		String text = myScanner.nextLine();
		System.out.println("you entered: " + text);
	}

	public void problem()
	{
		System.out.println("Enter an int followed by tow strings");
		int i = myScanner.nextInt();
		String s1 = myScanner.nextLine();
		String s2 = myScanner.nextLine();
		System.out.println("i= " + i);
		System.out.println("s1= " + s1);
		System.out.println("s2= " + s2);
	}

}
