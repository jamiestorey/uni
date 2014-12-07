
package com.jamiestorey.uni.java.labs.week12.christmasLecture;

/**
 * This is the basic present class.
 * 
 * @author Ian Braldey
 * @version 1.0
 */
public class Present
{

	private Label label;
	private String contents;
	private boolean wrapped;

	public Present(String contents)
	{
		this.contents = contents;
		wrapped = false;
	}

	public void wrapPresent(Label label)
	{
		this.label = label;
		wrapped = true;
	}

	public String readTo()
	{
		return label.getReceiver();
	}

	public String readFrom()
	{
		return label.getGiver();
	}

	public String readMessage()
	{
		return label.getMessage();
	}

	public void openPresent()
	{
		wrapped = false;
	}

	public String getDescription()
	{
		if (!wrapped)
			return contents;
		else
			return " present still wrapped";
	}

	public boolean isWrapped()
	{
		return wrapped;
	}
}
