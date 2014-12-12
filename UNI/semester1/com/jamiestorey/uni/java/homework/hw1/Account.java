
package com.jamiestorey.uni.java.homework.hw1;

/**
 * The Account class is used to create Accounts that store the Account holder's
 * First Name, Last Name, Account Number and the number of points in their
 * account.
 * 
 * @author Jamie Storey / w14017480
 * @version 28/09/24
 */
public class Account
{

	private String accountNumber;
	private String firstName;
	private String lastName;
	private int pointsHeld;

	/**
	 * Initializes a new instance of the Account class with a first name, last
	 * name and account number.
	 *
	 * @param fName
	 *            Account holder's first name.
	 * @param lName
	 *            Account holder's last name.
	 * @param accNumber
	 *            Account holder's account number.
	 */
	public Account(String fName, String lName, String accNumber)
	{
		firstName = fName;
		lastName = lName;
		accountNumber = accNumber;
		pointsHeld = 0;
	}

	/**
	 * Initializes a new instance of the Account class with a first name, last
	 * name, account number and an amount of points held in the Account.
	 *
	 * @param fName
	 *            Account holder's first name.
	 * @param lName
	 *            Account holder's last name.
	 * @param accNumber
	 *            Account holder's account number.
	 * @param points
	 *            The amount of points to be added to the account.
	 */
	public Account(String fName, String lName, String accNumber, int points)
	{
		firstName = fName;
		lastName = lName;
		accountNumber = accNumber;
		pointsHeld = points;
	}

	/**
	 * Increases the amount of points that are held and prints out the new
	 * amount of points that are now held.
	 *
	 * @param points
	 *            Number of points to add.
	 */
	public void addPoints(int points)
	{
		pointsHeld += points;
		System.out.println("Points now held: " + pointsHeld);
	}

	/**
	 * Gets the account number of the Account.
	 *
	 * @return The accountNumber.
	 */
	public String getAccountNumber()
	{
		return accountNumber;
	}

	/**
	 * Gets the first name of the account holder.
	 *
	 * @return The first name of the account holder.
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * Gets the last name of the account holder.
	 *
	 * @return The last name of the account holder.
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * Gets the number of points being held in the Account.
	 *
	 * @return The number of points held.
	 */
	public int getNoOfPoints()
	{
		return pointsHeld;
	}

	/**
	 * Prints all the account details in a readable format.
	 *
	 */
	public void printAccountDetails()
	{
		System.out.println(firstName + " " + lastName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Number of Points: " + pointsHeld);
	}

	/**
	 * Decreases the amount of points that are held and prints out the new
	 * amount of points that are now held.
	 *
	 * @param points
	 *            The amount of points to remove from the Account.
	 */
	public void removePoints(int points)
	{
		pointsHeld -= points;
		System.out.println("Points now held: " + pointsHeld);
	}

	/**
	 * Sets the first name of the Account holder.
	 *
	 * @param fName
	 *            The first name to be set.
	 */
	public void setFirstName(String fName)
	{
		firstName = fName;
	}

	/**
	 * Sets the last name of the Account holder.
	 *
	 * @param lName
	 *            The last name to be set.
	 */
	public void setLastName(String lName)
	{
		lastName = lName;
	}
}
