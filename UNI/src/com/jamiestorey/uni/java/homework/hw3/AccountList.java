
package com.jamiestorey.uni.java.homework.hw3;

import java.util.ArrayList;

/**
 * Creates a List of Accounts. You can add and remove Accounts and search for an
 * Account by account number. This class also allows you to print the details of
 * all the Accounts in the list.
 * 
 * @author Jamie Storey / w14017480
 * @version 27/10/2014
 */
public class AccountList
{

	private ArrayList<Account> accounts;

	/**
	 * Initialises the ArrayList to an empty ArrayList that can only contain
	 * Account objects.
	 *
	 */
	public AccountList()
	{
		accounts = new ArrayList<Account>();
	}

	/**
	 * Adds an Account to the list
	 *
	 * @param account
	 *            The Account to add
	 */
	public void addAccount(Account account)
	{
		accounts.add(account);
	}

	/**
	 * Gets an Account at a certain position in the list and prints the account
	 * details of that Account
	 *
	 * @param accountEntry
	 *            The position of list to get the Account from
	 */
	public void getAccount(int accountEntry)
	{
		if ((accountEntry < 0) || (accountEntry > accounts.size()))
		{
			System.err
					.println("Error: The index value you entered is either to low or too large.");
		}
		else
		{
			accounts.get(accountEntry).printAccountDetails();
		}
	}

	/**
	 * Prints all Account details of all Accounts in the list
	 *
	 */
	public void getAllAccounts()
	{
		// for (int i = 0; i < accounts.size(); i++)
		// {
		// accounts.get(i).printAccountDetails();
		// }

		for (Account account : accounts)
		{
			account.printAccountDetails();
		}
	}

	/**
	 * gets the number of Accounts in the list
	 *
	 * @return The amount of Accounts in the list
	 */
	public int getNumberOfAccounts()
	{
		return accounts.size();
	}

	/**
	 * Inserts an Account a chosen position in the list
	 *
	 * @param accountEntry
	 *            The position of the list to add the new Account
	 */
	public void removeAccount(int accountEntry)
	{
		accounts.remove(accountEntry);
	}

	/**
	 * Removes an Account based upon the Account's account number.
	 * 
	 * @param accountNumber
	 *            The account number of the Account to remove
	 * @return Returns true if the account number was found and the account was
	 *         removed. Returns false if the account number could not be found.
	 */
	public boolean removeAccount(String accountNumber)
	{
		// for (int i = 0; i < accounts.size(); i++)
		// {
		// if (accounts.get(i).getAccountNumber().equals(accountNumber))
		// {
		// accounts.remove(i);
		// return true;
		// }
		// }

		for (Account account : accounts)
		{
			if (account.getAccountNumber().equals(accountNumber))
			{
				accounts.remove(account);
				return true;
			}
		}

		return false;
	}

	/**
	 * Searches through the list of Accounts for an Account with a certain
	 * account number
	 *
	 * @param accountNumber
	 *            The account number to search for
	 * @return Returns the Accounts position in the list if the Account was
	 *         found. Returns -1 if the Account was not found
	 */
	public int search(String accountNumber)
	{
		// for (int i = 0; i < accounts.size(); i++)
		// {
		// if (accounts.get(i).getAccountNumber().equals(accountNumber))
		// {
		// return i;
		// }
		// }

		for (Account account : accounts)
		{
			if (account.getAccountNumber().equals(accountNumber)) { return accounts
					.indexOf(account); }
		}

		return -1;
	}
}
