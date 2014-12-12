
package com.jamiestorey.uni.java.homework.hw4;

import java.util.Scanner;

/**
 * Provides a text interface that allows the user to execute commands by
 * inputing the command through the console. Commands include adding and
 * removing Accounts as well as searching for Accounts.
 * 
 * @author Jamie Storey / w14017480
 * @version 17/11/2014
 */
public class AccountTUI
{

	private AccountList accountList;
	private Scanner myScanner;

	/**
	 * Constructor for objects.
	 *
	 */
	public AccountTUI()
	{
		accountList = new AccountList();
		myScanner = new Scanner(System.in);
	}

	/**
	 * Displays a menu and gets the users input and then executes a command
	 * based on the users input
	 *
	 */
	public void menu()
	{
		int command = -1;
		while (command != 0)
		{
			displayMenu();
			command = getCommand();
			execute(command);
		}
	}

	/**
	 * Asks the user to input details of an Account and then creates a new
	 * Account and adds it to the list.
	 *
	 */
	private void addAccount()
	{
		System.out
				.print("To add a new Account, enter the Account holder's first name:");
		String fName = myScanner.next();
		System.out.println("Now enter the Account holder's Last Name:");
		String lName = myScanner.next();
		System.out.println("Now enter their Account Number:");
		String accNumber = myScanner.next();
		System.out.println("Now enter the Street they live at:");
		myScanner.nextLine();
		String street = myScanner.nextLine();
		System.out.println("Now enter the Town they live in:");
		String town = myScanner.nextLine();
		System.out.println("Now enter their Postcode");
		String postcode = myScanner.nextLine();

		Account newAccount = new Account(fName, lName, accNumber, street, town,
				postcode);
		accountList.addAccount(newAccount);
	}

	/**
	 * Displays a menu with a list of commands available.
	 *
	 */
	private void displayMenu()
	{
		System.out.println();
		System.out.println("Enter number denoting action to perform:");
		System.out.println("Add an Account.............[1]");
		System.out.println("Get Number of Accounts.....[2]");
		System.out.println("Remove an Account..........[3]");
		System.out.println("Show all Accounts..........[4]");
		System.out.println("Show Account...............[5]");
		System.out.println("Quit.......................[0]");
		System.out.println();
	}

	/**
	 * Executes the command the user inputted. If the command was not found then
	 * prints an error message.
	 *
	 * @param command
	 *            The command to execute
	 */
	private void execute(int command)
	{
		switch (command)
		{
			case 1:
				addAccount();
				break;

			case 2:
				getNumberOfAccounts();
				break;

			case 3:
				removeAccount();
				break;

			case 4:
				showAllAccounts();
				break;

			case 5:
				showAccount();
				break;

			case 0:
				quitCommand();
				break;

			default:
				unkownCommand(command);
				break;
		}
	}

	/**
	 * gets the command the user inputted
	 *
	 * @return Returns the users input
	 */
	private int getCommand()
	{
		System.out.println("Enter command: ");

		return myScanner.nextInt();
	}

	/**
	 * Prints the number of Accounts that are in the list
	 *
	 */
	private void getNumberOfAccounts()
	{
		System.out.println("The number of accounts is: "
				+ accountList.getNumberOfAccounts() + " accounts.");
	}

	/**
	 * Displays a message the applicitation is closing and then closes the
	 * program.
	 *
	 */
	private void quitCommand()
	{
		System.out.println("The application will now close.");
		System.exit(0);
	}

	/**
	 * Asks the user for an account number and then removes the Account that has
	 * that account number. If the Account was not found then displays a message
	 * saying so.
	 *
	 */
	private void removeAccount()
	{
		System.out
				.println("Enter the account Number of the Account to remove: ");
		String accNumber = myScanner.next();

		if (accountList.removeAccount(accNumber))
		{
			System.out.println("Account with account number: " + accNumber
					+ " removed.");
		}
		else
		{
			System.out.println("Account with account number: " + accNumber
					+ " NOT removed.");
		}
	}

	/**
	 * Asks the user for an account number and then prints the details of the
	 * Account with that account number.
	 *
	 */
	private void showAccount()
	{
		System.out.println("Enter the account Number of the Account to show: ");
		String accNumber = myScanner.next();
		System.out.println();

		if (accountList.getAccount(accNumber))
		{
			// the code in the if statement is executed and prints the result to
			// the console so just break out of
			// this method if the account was found.
			return;
		}
		else
		{
			System.out.println("Could not find that Account");
		}
	}

	/**
	 * Prints the details of all Accounts.
	 *
	 */
	private void showAllAccounts()
	{
		accountList.getAllAccounts();
	}

	/**
	 * Displays an error message informing the user that the command they
	 * entered is unknown
	 *
	 * @param command
	 *            The command the user inputted
	 */
	private void unkownCommand(int command)
	{
		System.out.println("UNKOWN COMMAND: " + command);
	}
}
