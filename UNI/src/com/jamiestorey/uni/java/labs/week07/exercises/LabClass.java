package com.jamiestorey.uni.java.labs.week07.exercises;

import java.util.ArrayList;

/**
 * Allows enrolling students onto Lab classes. 
 * 
 * @author Jamie Storey 
 * @version 3/11/14
 */
public class LabClass
{
    private String instructor;
    private String room;
    private String timeAndDay;
    private ArrayList<Student> students;

    /**
     * Initialises objects.
     *
     */
    public LabClass()
    {
        instructor = "unkown";
        room = "unknown";
        timeAndDay = "unknown";
        students = new ArrayList<Student>();
    }

    /**
     * Gets the instructor
     *
     * @return The instructor
     */
    public String getInstructor()
    {
        return instructor;
    }

    /**
     * Gets the room
     *
     * @return The room
     */
    public String getRoom()
    {
        return room;
    }

    /**
     * Gets the time and day
     *
     * @return The time and day
     */
    public String getTimeAndDay()
    {
        return timeAndDay;
    }

    /**
     * Calculates the average number of points of the students enrolled in the class
     *
     * @return The average number of points
     */
    public double averageCredits()
    {
        int sum = 0;
        for (Student student : students)
        {
            sum += student.getCredits();
        }
        
        return sum / students.size();
    }

    /**
     * Adds a Student to the arraylist
     *
     * @param newStudent The Student to add
     */
    public void enrollStudent(Student newStudent)
    {
        students.add(newStudent);
    }

    /**
     * Finds a Student based on their name
     *
     * @param targetName The name to search for
     * @return The poition of the array where the student is stored or -1 if no student was found
     */
    public int findStudent(String targetName)
    {
        for (Student student : students)
        {
            if (student.getName().equals(targetName))
            {
                return students.indexOf(student);
            }
        }
        return -1;
    }

    /**
     * gets the number of students in the class
     *
     * @return The number of students in the class
     */
    public int numberOfStudents()
    {
        return students.size();
    }

    /**
     * Prints details of the class and all the details of each student using a for each loop
     *
     */
    public void printList()
    {
        System.out.println("Lab class " + timeAndDay);
        System.out.println("Instructor: " + instructor + "\nRoom: " + room);
        System.out.println("Class list: ");

        for (Student student : students)
        {
            student.print();
        }

        System.out.println("Number of students: " + numberOfStudents() );
    }

    /**
     * Prints details of the class and all the details of each student using a while loop
     *
     */
    public void printListUsingWhile()
    {
        System.out.println("Lab class " + timeAndDay);
        System.out.println("Instructor: " + instructor + "\nRoom: " + room);
        System.out.println("Class list: ");

        int index = 0;
        while (index < students.size())
        {
            students.get(index).print();
            index++;
        }

        System.out.println("Number of students: " + numberOfStudents() );

    }

    /**
     * Removes a Student
     *
     * @param aStudent A parameter
     */
    public void removeStudent(Student aStudent)
    {
        students.remove(aStudent);
    }

    /**
     * Removes a student at a specifed positiotn in the araay list
     *
     * @param studentEntry A parameter
     */
    public void removeStudent(int studentEntry)
    {
        if(studentEntry < 0)
        { 
            System.out.println("Negative entry :" + studentEntry);
        }
        else if(studentEntry < numberOfStudents())
        {
            students.remove(studentEntry);
        }
        else
        {
            System.out.println("No such entry :" + studentEntry);
        }

    }

    /**
     * Sets the instructor
     *
     * @param instructorName The name of the instructor
     */
    public void setInstructor(String instructorName)
    {
        instructor = instructorName;
    }

    /**
     * Sets the room
     *
     * @param roomNumber The room number to set
     */
    public void setRoom(String roomNumber)
    {
        room = roomNumber;
    }

    /**
     * Sets the time and day
     *
     * @param timeAndDay The time and day to set
     */
    public void setTime(String timeAndDay)
    {
        this.timeAndDay = timeAndDay;
    }

    /**
     * Prints the details of a student at a specific position in the array list
     *
     * @param studentEntry The position in the array list to use
     */
    public void showStudent(int studentEntry)
    {
        students.get(studentEntry).print();
    }
}
