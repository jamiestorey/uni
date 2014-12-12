
package com.jamiestorey.uni.java.homework.hw5;

/**
 * Write a description of class AccountCollection here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class AccountCollection
{

	private Account[] accounts;
	private int currentIndex;

	/**
	 * Constructor for objects of class AccountCollection
	 */
	public AccountCollection(int maxNoOfAccounts)
	{
		accounts = new Account[maxNoOfAccounts];
		currentIndex = 0;
	}

	public void addAccount(Account account)
	{
		if (currentIndex < accounts.length)
		{
			accounts[currentIndex] = account;
			currentIndex++;
		}
		else
		{
			System.out
					.println("AccountCollection full. Could not add account!");
		}
	}

	public int getCapacity()
	{
		return accounts.length;
	}

	public int getNumberOfAccounts()
	{
		return currentIndex;
	}

	public boolean printAccount(String accountNumber)
	{
		int index = 0;
		boolean found = false;
		while (index < currentIndex && !found)
		{
			if (accounts[index].getAccountNumber().equals(accountNumber))
			{
				found = true;
			}
			else
			{
				index++;
			}
		}

		if (found)
		{
			accounts[index].printAccountDetails();
			return true;
		}
		else
		{
			System.out.println("Account with account number: " + accountNumber
					+ " not found.");
			return false;
		}

	}

	public void printAllAccounts()
	{
		for (int index = 0; index < accounts.length; index++)
		{
			if (accounts[index] != null)
			{
				accounts[index].printAccountDetails();
				System.out.println();
			}
		}
	}

	public boolean removeAccount(String accountNumber)
	{
		int index = 0;
		while (index < currentIndex)
		{
			if (accounts[index].getAccountNumber().equals(accountNumber))
			{
				squash(index);
				return true;
			}
			else
			{
				index++;
			}
		}
		return false;
	}

	public int search(String accountNumber)
	{
		int index = 0;
		while (index < currentIndex)
		{
			if (accounts[index].getAccountNumber().equals(accountNumber))
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

	private void squash(int index)
	{
		if (index >= 0)
		{
			for (int i = index; i < currentIndex - 1; i++)
			{
				accounts[i] = accounts[i + 1];
			}

			accounts[currentIndex - 1] = null;
			currentIndex--;
		}
	}

}
