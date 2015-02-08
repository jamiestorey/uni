
package com.jamiestorey.uni.java.sem2.homework.hw2;

/**
 * Write a description of class Account here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Account
{

	private String accountNumber;
	private Address address;
	private Name name;
	private int pointsHeld;

	/**
	 * Account Constructor
	 *
	 * @param fName
	 *            A parameter
	 * @param lName
	 *            A parameter
	 * @param accNumber
	 *            A parameter
	 * @param points
	 *            A parameter
	 * @param street
	 *            A parameter
	 * @param town
	 *            A parameter
	 * @param postcode
	 *            A parameter
	 */
	public Account(String fName, String lName, String accNumber, int points, String street, String town, String postcode)
	{
		this.name = new Name(fName, lName);
		this.accountNumber = accNumber;
		this.address = new Address(street, town, postcode);
		this.pointsHeld = points;
	}

	/**
	 * Account Constructor
	 *
	 * @param fName
	 *            A parameter
	 * @param lName
	 *            A parameter
	 * @param accNumber
	 *            A parameter
	 * @param street
	 *            A parameter
	 * @param town
	 *            A parameter
	 * @param postcode
	 *            A parameter
	 */
	public Account(String fName, String lName, String accNumber, String street, String town, String postcode)
	{
		this.name = new Name(fName, lName);
		this.accountNumber = accNumber;
		this.address = new Address(street, town, postcode);
	}

	/**
	 * Method addPoints
	 *
	 * @param points
	 *            A parameter
	 */
	public void addPoints(int points)
	{
		this.pointsHeld += points;
	}

	/**
	 * Method equals
	 *
	 * @param o
	 *            A parameter
	 * @return The return value
	 */
	public boolean equals(Object o)
	{
		if (o == null) { return false; }

		if (this == o) { return true; }

		Account other = (Account) o;

		if (other.toString().equals(toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Method getAccountNumber
	 *
	 * @return The return value
	 */
	public String getAccountNumber()
	{
		return this.accountNumber;
	}

	/**
	 * Method getAddress
	 *
	 * @return The return value
	 */
	public String getAddress()
	{
		return this.address.toString();
	}

	/**
	 * Method getFirstName
	 *
	 * @return The return value
	 */
	public String getFirstName()
	{
		return this.name.getFirst();
	}

	/**
	 * Method getLastName
	 *
	 * @return The return value
	 */
	public String getLastName()
	{
		return this.name.getLast();
	}

	/**
	 * Method getNoOfPoints
	 *
	 * @return The return value
	 */
	public int getNoOfPoints()
	{
		return this.pointsHeld;
	}

	/**
	 * Method printAccountDetails
	 *
	 */
	public void printAccountDetails()
	{
		System.out.print(getAccountNumber() + " " + name + "\n");
		System.out.println(getAddress());
		System.out.println("Points Held:" + " " + getNoOfPoints());
	}

	/**
	 * Method removePoints
	 *
	 * @param points
	 *            A parameter
	 */
	public void removePoints(int points)
	{
		this.pointsHeld -= points;
	}

	/**
	 * Method setAddress
	 *
	 * @param street
	 *            A parameter
	 * @param town
	 *            A parameter
	 * @param postcode
	 *            A parameter
	 */
	public void setAddress(String street, String town, String postcode)
	{
		this.address.setFullAddress(street, town, postcode);
	}

	/**
	 * Method setFirstName
	 *
	 * @param fName
	 *            A parameter
	 */
	public void setFirstName(String fName)
	{
		this.name.setFirst(fName);
	}

	/**
	 * Method setLastName
	 *
	 * @param lName
	 *            A parameter
	 */
	public void setLastName(String lName)
	{
		this.name.setLast(lName);
	}

	/**
	 * Method toString
	 *
	 * @return The return value
	 */
	public String toString()
	{
		return getAccountNumber() + " " + name.toString() + "\n" + getAddress() + "\n" + getNoOfPoints();
	}

}
