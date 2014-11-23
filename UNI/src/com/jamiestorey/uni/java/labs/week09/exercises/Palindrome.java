
package com.jamiestorey.uni.java.labs.week09.exercises;


/**
 * Write a description of class Palindrome here.
 * 
 * @author Jamie Storey
 * @version 20/11/2014
 */
public class Palindrome
{

	boolean isPalindrome(String str)
	{
		// replace whitespace with nothing, change all chars to lower case
		String newS = str.replaceAll("\\s", "").trim().toLowerCase();
		int n = newS.length();
		// loop through half of the string
		for (int i = 0; i < n / 2; i++)
		{
			// if the current char does not equal the char on the other half
			// of the string then return false
			if (newS.charAt(i) != newS.charAt(n - i - 1)) { return false; }
		}
		return true;
	}
}
