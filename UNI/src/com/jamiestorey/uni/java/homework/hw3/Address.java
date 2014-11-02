
package com.jamiestorey.uni.java.homework.hw3;

/**
 * The Address class allows you to store address information such as a postcode,
 * street and town.
 * 
 * @author Jamie Storey / w14017480
 * @version 13/10/2014
 */
public class Address
{

	private String postcode;
	private String street;
	private String town;

	/**
	 * Constructor for objects of Address Class
	 *
	 * @param street
	 *            The street where the Account holder lives.
	 * @param town
	 *            The town where the Account holder lives.
	 * @param postcode
	 *            The postcode where the Account holder lives.
	 */
	public Address(String street, String town, String postcode)
	{
		this.street = street;
		this.town = town;
		this.postcode = postcode;
	}

	/**
	 * gets the full Account holder's address.
	 *
	 * @return The full Address of the Account holder.
	 */
	public String getFullAddress()
	{
		return street + "\n" + town + "\n" + postcode + "\n";
	}

	/**
	 * gets the Account holder's postcode.
	 *
	 * @return The Account holder's postcode.
	 */
	public String getPostcode()
	{
		return postcode;
	}

	/**
	 * gets the Account holder's street.
	 *
	 * @return The Account holder's street.
	 */
	public String getStreet()
	{
		return street;
	}

	/**
	 * gets the Account holder's town.
	 *
	 * @return The Account holder's town.
	 */
	public String getTown()
	{
		return town;
	}

	/**
	 * prints the Account holder's Address in a readable fornat.
	 *
	 */
	public void printAddress()
	{
		System.out.println(street + "\n" + town + "\n" + postcode);
	}

	/**
	 * sets the full Address of the Account holder.
	 *
	 * @param street
	 *            The street where the Account holder lives.
	 * @param town
	 *            The town where the Account holder lives.
	 * @param postcode
	 *            The postcode where the Account holder lives.
	 */
	public void setFullAddress(String street, String town, String postcode)
	{
		this.street = street;
		this.town = town;
		this.postcode = postcode;
	}

	/**
	 * sets the Account holder's postcode.
	 *
	 * @param postcode
	 *            The postcode where the Account holder lives.
	 */
	public void setPostcode(String postcode)
	{
		this.postcode = postcode;
	}

	/**
	 * sets the Account holder's street.
	 *
	 * @param street
	 *            The street where the Account holder lives.
	 */
	public void setStreet(String street)
	{
		this.street = street;
	}

	/**
	 * sets the Account holder's town.
	 *
	 * @param town
	 *            The town where the Account holder lives.
	 */
	public void setTown(String town)
	{
		this.town = town;
	}
}
