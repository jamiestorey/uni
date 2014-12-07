
package com.jamiestorey.uni.java.labs.week12.christmasLecture;

/**
 * The driver for the Christmas application.
 * 
 * @author Ian Bradley
 * @version Decmeber 2010
 */
public class ChristmasDriver
{

	public static void main(String[] args)
	{
		Elf elf = new Elf();
		elf.elfMenu();
		Santa santa = new Santa(elf.passSack());
		santa.santaMenu();
	}

}
