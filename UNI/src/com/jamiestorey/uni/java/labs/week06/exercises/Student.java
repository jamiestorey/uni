
package com.jamiestorey.uni.java.labs.week06.exercises;

/**
 * The Student class represents a student in a student administration system. It
 * holds the student details relevant in our context.
 * 
 * ************************************************************** AMENDED TO
 * INCLUDE AN EQUALITY METHOD FOR WEEK 6's LECTORAL
 * **************************************************************
 * 
 * @author Michael Kolling and David Barnes
 * @version 2001.05.24
 */
public class Student
{

	// the student's full name
	private String name;
	// the student ID
	private String id;
	// the amount of credits for study taken so far
	private int credits;

	/**
	 * Create a new student with a given name and ID number.
	 * 
	 * @param fullName
	 *            student's full name
	 * @param studentID
	 *            student's id
	 */
	public Student(String fullName, String studentID)
	{
		name = fullName;
		id = studentID;
		credits = 0;
	}

	/**
	 * Return the full name of this student.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Set a new name for this student.
	 */
	public void changeName(String replacementName)
	{
		name = replacementName;
	}

	/**
	 * Return the student ID of this student.
	 */
	public String getStudentID()
	{
		return id;
	}

	/**
	 * Add some credit points to the student's accumulated credits.
	 */
	public void addCredits(int additionalPoints)
	{
		credits = credits + additionalPoints;
	}

	/**
	 * Return the number of credit points this student has accumulated.
	 */
	public int getCredits()
	{
		return credits;
	}

	/**
	 * Return the login name of this student. The login name is a combination of
	 * the first four characters of the student's name and the first three
	 * characters of the student's ID number.
	 */
	public String getLoginName()
	{
		return name.substring(0, 4) + id.substring(0, 3);
	}

	public boolean equals(Object o)
	{
		// Check to make sure o is not null
		if (o == null) return false;
		// Check you if have same reference
		if (this == o) return true;
		// cast o to be a Student
		Student other = (Student) o;
		if ((other.getName().equals(name)) && (other.getStudentID().equals(id)))
			return true;
		else
			return false;
	}

}
