
package com.jamiestorey.uni.java.homework.hw4;

/**
 * The Account driver runs the main method which creates a new instance of
 * AccountTUI and displays the menu.
 * 
 * @author Jamie Storey / w14017480
 * @version 17/11/2014
 */
public class AccountDriver
{

	public static void main(String[] args)
	{
		AccountTUI menu = new AccountTUI();
		menu.menu();
	}
}
