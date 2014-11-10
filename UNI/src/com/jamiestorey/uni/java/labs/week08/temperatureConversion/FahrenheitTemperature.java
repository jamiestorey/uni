
package com.jamiestorey.uni.java.labs.week08.temperatureConversion;

/**
 * Write a description of class FarhenheitTemperature here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class FahrenheitTemperature
{

	private double fTemperature; // The Fahrenheit temperature

	public FahrenheitTemperature()
	{
		fTemperature = 32.0; // freezing point of water
	}

	public double getFTemperature()
	{
		return fTemperature;
	}

	public double convertToCentigrade()
	{
		double centigrade = 5.0 * (fTemperature - 32.0) / 9.0;
		return centigrade;
	}

	public void setFTemperature(double newFTemperature)
	{
		fTemperature = newFTemperature;
	}

}
