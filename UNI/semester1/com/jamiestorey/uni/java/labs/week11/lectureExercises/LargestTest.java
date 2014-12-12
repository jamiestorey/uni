
package com.jamiestorey.uni.java.labs.week11.lectureExercises;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LargestTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LargestTest
{

	/**
	 * Default constructor for test class LargestTest
	 */
	public LargestTest()
	{
	}

	@Test
	public void testOrder()
	{
		int[] theArray1 =
		{ 7, 8, 9 };
		Largest largest1 = new Largest();
		assertEquals(9, largest1.largest(theArray1));
	}

	@Test
	public void testOrder2()
	{
		int[] theArray1 =
		{ 7, 8, 9 };
		int[] theArray2 =
		{ 8, 9, 7 };
		int[] theArray3 =
		{ 9, 8, 7 };
		Largest largest1 = new Largest();
		assertEquals(9, largest1.largest(theArray1));
		assertEquals(9, largest1.largest(theArray2));
		assertEquals(9, largest1.largest(theArray3));
	}

	@Test
	public void testDuplicates()
	{
		int[] theArray =
		{ 7, 9, 9, 8 };
		Largest largest1 = new Largest();
		// 9 = 9 > 8 > 7
		assertEquals(9, largest1.largest(theArray));
	}

	@Test
	public void testNegatives()
	{
		int[] theArray =
		{ -7, -8, -9 };
		Largest largest1 = new Largest();
		// -7 > -8 > -9
		assertEquals(-7, largest1.largest(theArray));
	}

	/**
	 * Sets up the test fixture.
	 *
	 * Called before every test case method.
	 */
	@Before
	public void setUp()
	{
	}

	/**
	 * Tears down the test fixture.
	 *
	 * Called after every test case method.
	 */
	@After
	public void tearDown()
	{
	}
}
