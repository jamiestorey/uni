
package com.jamiestorey.uni.java.labs.week10;

/**
 * Write a description of class LabClass here.
 * 
 * @author Jamie Storey
 * @version 24/11/14
 */
public class LabClass
{

	private int currentIndex;
	private Student[] students;

	/**
	 * Constructor for objects of class LabClass
	 */
	public LabClass(int arraySize)
	{
		students = new Student[arraySize];
		currentIndex = 0;
	}

	public void enrolStudent(Student student)
	{
		students[currentIndex] = student;
		currentIndex++;
	}

	public String getClassList()
	{
		String output = "Class List:\n";
		for (int i = 0; i < currentIndex; i++)
		{
			output += students[i].toString() + "\n";
		}

		return output;
	}

	public int getNumberOfStudents()
	{
		return currentIndex;
	}

	// public boolean removeStudent(String studentName)
	// {
	// for (int i = 0; i < currentIndex; i++)
	// {
	// if (students[i].getName().equals(studentName))
	// {
	// squash(i);
	// return true;
	// }
	// }
	// return false;
	// }

	public boolean removeStudent(String studentName)
	{
		if (findStudent(studentName) != -1)
		{
			squash(findStudent(studentName));
			return true;
		}
		return false;
	}

	public String showStudent(String studentName)
	{
		if (findStudent(studentName) != -1) { return students[findStudent(studentName)]
				.toString(); }

		return "No such student: " + studentName;
	}

	private void squash(int index)
	{
		if (index >= 0)
		{
			for (int i = index; i < currentIndex - 1; i++)
			{
				students[i] = students[i + 1];
			}

			students[currentIndex - 1] = null;
			currentIndex--;
		}
	}

	private int findStudent(String studentName)
	{

		for (int i = 0; i < currentIndex; i++)
		{
			if (students[i].getName().equals(studentName)) { return i; }
		}
		return -1;
	}
}
