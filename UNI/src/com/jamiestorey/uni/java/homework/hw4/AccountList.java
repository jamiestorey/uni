
package com.jamiestorey.uni.java.homework.hw4;

import java.util.ArrayList;

/**
 * Creates a List of Accounts. You can add and remove Accounts and search for an
 * Account by account number. This class also allows you to print the details of
 * all the Accounts in the list.
 * 
 * @author Jamie Storey
 * @version 17/11/2014
 */
public class AccountList
{

	private ArrayList<Account> accounts;

	/**
	 * Constructor for objects of class AccountList
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
	 * Gets the number of Accounts in the list
	 *
	 * @return The number of Accounts in the list
	 */
	public int getNumberOfAccounts()
	{
		return accounts.size();
	}

	/**
	 * Prints the details of an Account at a speicifc index in the list
	 *
	 * @param accountEntry
	 *            The index of the list to get the Account from
	 */
	public void getAccount(int accountEntry)
	{
		if (accountEntry < 0)
		{
			System.out.println("Negative entry: " + accountEntry);
		}
		else if (accountEntry < getNumberOfAccounts())
		{
			Account account = accounts.get(accountEntry);
			account.printAccountDetails();
		}
		else
		{
			System.out.println("No such entry: " + accountEntry);
		}
	}

	/**
	 * Prints the details of an Account specified by the Account's account
	 * number
	 *
	 * @param accountNumber
	 *            The account number of the Account
	 * @return Returns true if the the Account was found else will return false
	 */
	public boolean getAccount(String accountNumber)
	{
		int index = 0;
		for (Account account : accounts)
		{
			if (accountNumber.equals(account.getAccountNumber()))
			{
				account.printAccountDetails();
				return true;
			}
			index++;
		}
		return false;
	}

	/**
	 * Prints the details of each Account in the list
	 *
	 */
	public void getAllAccounts()
	{
		for (Account account : accounts)
		{
			account.printAccountDetails();
			System.out.println();
		}
	}

	/**
	 * Removes an Account at specific index in the list
	 *
	 * @param accountEntry
	 *            The index of the Account to remove
	 */
	public void removeAccount(int accountEntry)
	{
		if (accountEntry < 0)
		{
			System.out.println("Negative entry :" + accountEntry);
		}
		else if (accountEntry < getNumberOfAccounts())
		{
			accounts.remove(accountEntry);
		}
		else
		{
			System.out.println("No such entry :" + accountEntry);
		}
	}

	/**
	 * Removes an Account based on the Account's account number
	 *
	 * @param accountNumber
	 *            The account number of the Account to remove
	 * @return Returns true if the Account was removed otherwise it will return
	 *         false
	 */
	public boolean removeAccount(String accountNumber)
	{
		int index = 0;
		for (Account account : accounts)
		{
			if (accountNumber.equals(account.getAccountNumber()))
			{
				accounts.remove(index);
				return true;
			}
			index++;
		}
		return false;
	}

	/**
	 * Searches for an Account with a specific account number
	 *
	 * @param accountNumber
	 *            The account number of the Account to search for
	 * @return Returns the index of the Account if it was found else returns -1
	 *         if the Account was not found.
	 */
	public int search(String accountNumber)
	{
		int index = 0;
		for (Account account : accounts)
		{
			if (accountNumber.equals(account.getAccountNumber()))
			{
				return index;
			}
			else
			{
				index++;
			}
		}
		return -1;
	}
}
