
package com.jamiestorey.uni.java.labs.week06.triangle;

/**
 * Write a description of class TestPoints here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestPoints
{

	public TestPoints()
	{
		// TwoDPoint p1 = new TwoDPoint();
		// TwoDPoint p2 = new TwoDPoint(0.0,0.0);
		// System.out.println(p1.equals(p2));
		// p2.setX(10);
		// System.out.println(p1.equals(p2));

		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		Triangle t3 = new Triangle(new TwoDPoint(0, 0), new TwoDPoint(0, 1),
				new TwoDPoint(1, 0));

		Triangle t4 = new Triangle(new TwoDPoint(0, 1), new TwoDPoint(1, 0),
				new TwoDPoint(0, 0));

		Triangle t5 = new Triangle(new TwoDPoint(1, 1), new TwoDPoint(2, 2),
				new TwoDPoint(3, 3));

		Triangle t6 = new Triangle(new TwoDPoint(3, 3), new TwoDPoint(1, 1),
				new TwoDPoint(2, 2));

		Triangle t7 = new Triangle(new TwoDPoint(3, 2), new TwoDPoint(1, 1),
				new TwoDPoint(2, 2));

		Triangle t8 = new Triangle(new TwoDPoint(3, 2), new TwoDPoint(1, 2),
				new TwoDPoint(2, 2));

		Triangle t9 = new Triangle(new TwoDPoint(3, 2), new TwoDPoint(1, 2),
				new TwoDPoint(2, 4));

		Triangle t10 = new Triangle(new TwoDPoint(3, 2), new TwoDPoint(1, 2),
				new TwoDPoint(2, 4));

		System.err.println("t1 equals t2 " + t1.equals(t2)); // true and true :)
		System.err.println("t1 equals t3 " + t1.equals(t3)); // false and false
																// :)
		System.err.println("t3 equals t4 " + t3.equals(t4)); // true and true :)
		System.err.println("t5 equals t6 " + t5.equals(t6)); // true and true :)
		System.err.println("t5 equals t3 " + t5.equals(t3)); // false and false
																// :)
		System.err.println("t6 equals t7 " + t6.equals(t7)); // false and false
																// :)
		System.err.println("t7 equals t8 " + t7.equals(t8)); // false and false
																// :)
		System.err.println("t8 equals t9 " + t8.equals(t9)); // false and false
																// :)
		System.err.println("t9 equals t10 " + t9.equals(t10)); // true and true
																// :)
	}
}
