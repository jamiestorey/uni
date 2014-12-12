
package com.jamiestorey.uni.java.labs.week03.betterTicketMachine;

/**
 * TicketMachine models a naive ticket machine that issues flat-fare tickets.
 * The price of a ticket is specified via the constructor. It is a naive machine
 * in the sense that it trusts its users to insert enough money before trying to
 * print a ticket. It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2003.12.01
 */
public class TicketMachine
{

	// The price of a ticket from this machine.
	private int price;
	// The amount of money entered by a customer so far.
	private int balance;
	// The total amount of money collected by this machine.
	private int total;

	/**
	 * Create a machine that issues tickets of a given price which must be
	 * greater than zero.
	 * 
	 * @param ticketCost
	 *            the cost of a ticket
	 */
	public TicketMachine(int ticketCost)
	{
		price = ticketCost;
		balance = 0;
		total = 0;
	}

	/**
	 * Return the price of a ticket.
	 * 
	 * @return the price of a ticket
	 */
	public int getPrice()
	{
		return price;
	}

	/**
	 * Return the amount of money already inserted for the next ticket.
	 * 
	 * @return the amount already inserted for the next ticket
	 */
	public int getBalance()
	{
		return balance;
	}

	/**
	 * Receive an amount of money in cents from a customer.
	 * 
	 * @param amount
	 *            value of the money entered
	 */
	public void insertMoney(int amount)
	{

		if (amount > 0)
		{
			balance = balance + amount;
		}
		else
		{
			System.err
					.println("Error: You must enter a positive integer value.");
		}
	}

	/**
	 * Print a ticket. Update the total collected and reduce the balance to
	 * zero.
	 */
	public void printTicket()
	{
		if (balance >= price)
		{
			// Simulate the printing of a ticket.
			System.out.println("##################");
			System.out.println("# The BlueJ Line");
			System.out.println("# Ticket");
			System.out.println("# " + price + " pence.");
			System.out.println("##################");
			System.out.println();

			// Update the total collected with the amount paid.
			total = total + balance;
			// Clear the balance.
			balance -= price;
		}
		else
		{
			System.err.println("Error: You can't afford a ticket!");
		}
	}
}
