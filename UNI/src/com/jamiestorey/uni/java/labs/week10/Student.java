
package com.jamiestorey.uni.java.labs.week10;

/**
 * The Student class represents a student in a student administration system. It
 * holds the student details relevant in our context. Modified to include an
 * equals method
 * 
 * @author Michael Kolling and David Barnes & Ian Bradley
 * @version October 2010
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
	 *            student's full name in format surname,forname
	 * @param studentID
	 *            the ID assigned to the student
	 */
	public Student(String fullName, String studentID)
	{
		name = fullName;
		id = studentID;
		credits = 0;
	}

	/**
	 * Return the full name of this student.
	 * 
	 * @return name of student
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Set a new name for this student.
	 * 
	 * @param replacementName
	 *            updated name
	 */
	public void changeName(String replacementName)
	{
		name = replacementName;
	}

	/**
	 * Return the student ID of this student.
	 * 
	 * @return id of student
	 */
	public String getStudentID()
	{
		return id;
	}

	/**
	 * Add some credit points to the student's accumulated credits.
	 * 
	 * @param additionalPoints
	 *            credits to add to student's total
	 */
	public void addCredits(int additionalPoints)
	{
		credits += additionalPoints;
	}

	/**
	 * Return the number of credit points this student has accumulated.
	 * 
	 * @return number of credits
	 */
	public int getCredits()
	{
		return credits;
	}

	/**
	 * Return the login name of this student. The login name is a combination of
	 * the first four characters of the student's name and the first three
	 * characters of the student's ID number.
	 * 
	 * @return student login name
	 */
	public String getLoginName()
	{
		return name.substring(0, 4) + id.substring(0, 3);
	}

	/**
	 * provides the current values for this student in format: Name: xxx ID: nnn
	 * Credits: nnn.
	 * 
	 * @return current values of atributes
	 */
	public String toString()
	{
		return "Name: " + name + " ID: " + id + " Credits: " + credits;
	}

	/**
	 * Indicates whether some other object is "equal to" this one. Checks for
	 * matches of both name and id
	 * 
	 * @return true if a match found otherwise false
	 */
	public boolean equals(Object o)
	{
		if (o == this) return true;
		Student s = (Student) o;
		if ((name.equals(s.getName())) && (id.equals(s.getStudentID())))
			return true;
		return false;
	}
}
