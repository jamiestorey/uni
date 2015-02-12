package com.jamiestorey.uni.java.sem2.homework.hw2;
import com.jamiestorey.uni.java.sem2.homework.hw2.Account;


/**
 * Write a description of class PersonalAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonalAccount extends Account
{
   private String cardNumber;
   private char cardType;
    
    
    /**
     * PersonalAccount Constructor
     *
     * @param firstName A parameter
     * @param lastName A parameter
     * @param accountNumber A parameter
     * @param street A parameter
     * @param town A parameter
     * @param postcode A parameter
     * @param cardNumber A parameter
     * @param cardType A parameter
     */
    public PersonalAccount(String firstName, String lastName, String accountNumber, String street, String town, String postcode, String cardNumber, char cardType)
    {
        super(firstName, lastName, accountNumber, street, town, postcode);
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }
    
    /**
     * PersonalAccount Constructor
     *
     * @param firstName A parameter
     * @param lastName A parameter
     * @param accountNumber A parameter
     * @param street A parameter
     * @param town A parameter
     * @param postcode A parameter
     * @param cardNumber A parameter
     * @param cardType A parameter
     * @param points A parameter
     */
    public PersonalAccount(String firstName, String lastName, String accountNumber, String street, String town, String postcode, String cardNumber, char cardType, int points)
    {
        super(firstName, lastName, accountNumber, points, street, town, postcode);
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }
    
    /**
     * Method getCardNumber
     *
     * @return The return value
     */
    public String getCardNumber()
    {
        return cardNumber.substring(0, 4) + " " + cardNumber.substring(4,8) + " " + cardNumber.substring(8,12) + " " + cardNumber.substring(12,16); 
    }
    
    /**
     * Method getCardType
     *
     * @return The return value
     */
    public String getCardType()
    {
        if (cardType == 'D')
        {
            return "Debit";
        }
        else if (cardType == 'M')
        {
            return "Mastercard";
        }
        else if (cardType == 'V')
        {
            return "Visa";
        }
        else
        {
            return "Not a valid card type.";
        }
        
    }
    
    /**
     * Method print
     *
     */
    public void print()
    {
        System.out.print("Personal Account: ");
        super.printAccountDetails();
    }

    /**
     * Method toString
     *
     * @return The return value
     */
    public String toString()
    {
        this.print();
        return "Card Number: " + this.getCardNumber() + " " + "Card Type: " + this.getCardType() + "\n";
    }
    
}
