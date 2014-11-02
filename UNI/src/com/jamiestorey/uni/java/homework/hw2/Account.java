
package com.jamiestorey.uni.java.homework.hw2;

/**
 * The Account class allows you to create accounts that store the Account
 * holder's first and last name, their account number, their address and the
 * number of points in their account.
 * 
 * @author Jamie Storey / w14017480
 * @version 13/10/2014
 */
public class Account
{

	private String firstName;
	private String lastName;
	private String accountNumber;
	private int pointsHeld;
	private Address address;

	/**
	 * Constructor for objects of class Account. The number of pointsHeld should
	 * be set to zero.
	 * 
	 * @param fName
	 *            The Account Holder's first name
	 * @param lName
	 *            The Account Holder's last name
	 * @param accNumber
	 *            The Account Holder's library number
	 * @param street
	 *            the account holder's street
	 * @param town
	 *            the account holder's town
	 * @param postcode
	 *            the account holder's postcode
	 */
	public Account(String fName, String lName, String accNumber, String street,
			String town, String postcode)
	{
		firstName = fName;
		lastName = lName;
		accountNumber = accNumber;
		pointsHeld = 0;
		address = new Address(street, town, postcode);
	}

	/**
	 * Constructor for objects of class Account. The number of pointsHeld should
	 * should be set to the supplied value.
	 * 
	 * @param fName
	 *            The Account Holder's first name
	 * @param lName
	 *            The Account Holder's last name
	 * @param accNumber
	 *            The account number
	 * @param points
	 *            the pointsHeld awarded when account is initialised
	 * @param street
	 *            the account holder's street
	 * @param town
	 *            the account holder's town
	 * @param postcode
	 *            the account holder's postcode
	 */
	public Account(String fName, String lName, String accNumber, int points,
			String street, String town, String postcode)
	{
		firstName = fName;
		lastName = lName;
		accountNumber = accNumber;
		pointsHeld = points;
		address = new Address(street, town, postcode);
	}

	/**
	 * Get the Account Holder's first name
	 * 
	 * @return the Account Holder's first name
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * Get the Account Holder's last name
	 * 
	 * @return the Account Holder's last name
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * Get the Account Holder's account Number
	 * 
	 * @return the Account Holder's account number
	 */
	public String getAccountNumber()
	{
		return accountNumber;
	}

	/**
	 * Get the number of points held
	 * 
	 * @return the number of points held
	 */
	public int getNoOfPoints()
	{
		return pointsHeld;
	}

	/**
	 * Print out the Account Holder's details to the console window
	 */
	public void printAccountDetails()
	{
		System.out.println(firstName + " " + lastName + "\n"
				+ address.getFullAddress() + "\nAccount Number: "
				+ accountNumber + "\nNumber of points: " + pointsHeld);
	}

	/**
	 * Get the account holder's address
	 * 
	 * @return the account holder's address
	 */
	public String getAddress()
	{
		return address.getFullAddress();
	}

	/**
	 * Change the first name
	 * 
	 * @param fName
	 *            the new first name
	 */
	public void setFirstName(String fName)
	{
		firstName = fName;
	}

	/**
	 * Change the last name
	 * 
	 * @param lName
	 *            the new last name
	 */
	public void setLastName(String lName)
	{
		lastName = lName;
	}

	/**
	 * Increase the number of points held by a given number and output a esage
	 * to the console window giving the revised number of points held.
	 * 
	 * @param points
	 *            the number of points to add to the total
	 */
	public void addPoints(int points)
	{
		pointsHeld = pointsHeld + points;
		System.out.println("Points now held: " + pointsHeld);
	}

	/**
	 * Remove pointsHeld by a given number and output a message to the console
	 * window giving the revised number of points held as long as the number of
	 * points would not fall below zero - otherwise output message to console
	 * window instead.
	 * 
	 * @param points
	 *            the number of pointsHeld to remove total.
	 */
	public void removePoints(int points)
	{
		if ((pointsHeld - points) >= 0)
		{
			pointsHeld = pointsHeld - points;
			System.out.println("Points now held: " + pointsHeld);
		}
		else
		{
			System.out.println("Transaction refused: "
					+ "Insufficient points available.");
		}
	}

	/**
	 * Change the account holder's address
	 * 
	 * @param street
	 *            the street
	 * @param town
	 *            the town
	 * @param postcode
	 *            the postcode
	 */
	public void setAddress(String street, String town, String postcode)
	{
		address.setFullAddress(street, town, postcode);
	}

	/**
	 * Print the account holder's address
	 */
	public void printAddress()
	{
		address.printAddress();
	}
}
