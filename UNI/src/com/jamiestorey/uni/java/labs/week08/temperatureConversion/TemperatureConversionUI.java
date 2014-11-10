
package com.jamiestorey.uni.java.labs.week08.temperatureConversion;

import java.util.Scanner;

/**
 * Write a description of class TemperatureConversionUI here.
 * 
 * @author Jamie Storey
 * @version 10/11/2014
 */
public class TemperatureConversionUI
{

	private CentigradeTemperature c;
	private FahrenheitTemperature f;
	private Scanner myScanner;

	public TemperatureConversionUI()
	{
		c = new CentigradeTemperature();
		f = new FahrenheitTemperature();
		myScanner = new Scanner(System.in);

	}

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

	private void displayMenu()
	{
		System.out.println("Options are ");
		System.out.println("   Convert from Fahrenheit to Centigrade enter 1");
		System.out.println("   Convert from Centigrade to Fahrenheit enter 2");
		System.out.println("   To end program enter 0");

	}

	private int getCommand()
	{
		System.out.print("Enter command: ");
		int command = myScanner.nextInt();
		myScanner.nextLine(); // handle eol
		return command;
	}

	private void execute(int command)
	{
		switch (command)
		{
			case 1:
				doFToC();
				break;

			case 2:
				doCToF();
				break;

			case 0:
				System.exit(0);
				break;

			default:
				System.err.println("Unkown command");
		}
	}

	private void doFToC()
	{
		System.out.print("Enter F temperature: ");
		double ft = myScanner.nextDouble();
		f.setFTemperature(ft);
		System.out.println("\n" + ft + "F equals " + f.convertToCentigrade()
				+ "C\n");

	}

	private void doCToF()
	{
		System.out.print("Enter C temperature: ");
		double ct = myScanner.nextDouble();
		c.setCTemperature(ct);
		System.out.println("\n" + ct + "C equals " + c.convertToFahrenheit()
				+ "F\n");

	}

}
