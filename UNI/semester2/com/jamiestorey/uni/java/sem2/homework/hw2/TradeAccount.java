package com.jamiestorey.uni.java.sem2.homework.hw2;
/**
 * Write a description of class TradeAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TradeAccount extends Account
{
    private String accountName;
    private Address companyAddress;
    private String vatNumber;

    /**
     * TradeAccount Constructor
     *
     * @param firstName A parameter
     * @param lastName A parameter
     * @param accountNumber A parameter
     * @param street A parameter
     * @param town A parameter
     * @param postcode A parameter
     * @param accountName A parameter
     * @param cStreet A parameter
     * @param cTown A parameter
     * @param cPostCode A parameter
     * @param vatNumber A parameter
     */
    public TradeAccount(String firstName, String lastName, String accountNumber, String street, String town, String postcode, String accountName, String cStreet, String cTown, String cPostCode, String vatNumber)
    {
        super(firstName, lastName, accountNumber, street, town, postcode);
        this.accountName = accountName;
        this.companyAddress = new Address(cStreet, cTown, cPostCode);
        this.vatNumber = vatNumber;
    }

    /**
     * TradeAccount Constructor
     *
     * @param firstName A parameter
     * @param lastName A parameter
     * @param accountNumber A parameter
     * @param street A parameter
     * @param town A parameter
     * @param postcode A parameter
     * @param accountName A parameter
     * @param cStreet A parameter
     * @param cTown A parameter
     * @param cPostCode A parameter
     * @param vatNumber A parameter
     * @param points A parameter
     */
    public TradeAccount(String firstName, String lastName, String accountNumber, String street, String town, String postcode, String accountName, String cStreet, String cTown, String cPostCode, String vatNumber, int points)
    {
        super(firstName, lastName, accountNumber, points, street, town, postcode);
        this.accountName = accountName;
        this.companyAddress = new Address(cStreet, cTown, cPostCode);
        this.vatNumber = vatNumber;
    }

    /**
     * Method getAccountName
     *
     * @return The return value
     */
    public String getAccountName()
    {
        return this.accountName;
    }

    /**
     * Method getCompanyAddress
     *
     * @return The return value
     */
    public String getCompanyAddress()
    {
        return this.companyAddress.toString();
    }

    /**
     * Method getVatNumber
     *
     * @return The return value
     */
    public String getVatNumber()
    {
        return this.vatNumber;
    }

    /**
     * Method print
     *
     */
    public void print()
    {
        System.out.print("Trade Account: ");
        super.printAccountDetails();
    }

    /**
     * Method toString
     *
     * @return The return value
     */
    public String toString()
    {
        print();
        return "Account: " + this.getAccountName() + ", " + this.getCompanyAddress() + "\n" + "VAT Number:" + " " + this.getVatNumber() + "\n";
    }

}
