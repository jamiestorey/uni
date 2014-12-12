
package com.jamiestorey.uni.java.labs.week11.lectureExercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CounterTest.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CounterTest
{

	/**
	 * Default constructor for test class CounterTest
	 */
	public CounterTest()
	{
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

	@Test
	public void testDefaultConstructorNotNull()
	{
		Counter counter1 = new Counter();
		assertNotNull(counter1);
	}

	@Test
	public void testDefaultConstructorValue()
	{
		Counter counter1 = new Counter();
		assertEquals("0", counter1.toString());
	}

	@Test
	public void testAltConstructorZero()
	{
		Counter counter1 = new Counter(0);
		assertEquals(0, counter1.getCounter());
	}

	@Test
	public void testAltConstructorMinusOne()
	{
		Counter counter1 = new Counter(-1);
		assertEquals(0, counter1.getCounter());
	}

	@Test
	public void testIncCounterDefault()
	{
		Counter counter1 = new Counter();
		counter1.incCounter();
		assertEquals(1, counter1.getCounter());
	}

	@Test
	public void testSetCounterNagative()
	{
		Counter counter1 = new Counter(1);
		counter1.setCounter(-1);
		assertEquals("1", counter1.toString());
	}
}
