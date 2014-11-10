
package com.jamiestorey.uni.java.labs.week08.temperatureConversion;

/**
 * Write a description of class CentigradeTemperature here.
 * 
 * @author Jamie Storey
 * @version 10/11/2014
 */
public class CentigradeTemperature
{

	private double cTemperature; // The Centigrade temperature

	public CentigradeTemperature()
	{
		cTemperature = 0.0; // freezing point of water
	}

	public double getCTemperature()
	{
		return cTemperature;
	}

	public double convertToFahrenheit()
	{
		double fahrenheit = 9.0 * cTemperature / 5.0 + 32.0;

		return fahrenheit;
	}

	public void setCTemperature(double newCTemperature)
	{
		cTemperature = newCTemperature;
	}

}
