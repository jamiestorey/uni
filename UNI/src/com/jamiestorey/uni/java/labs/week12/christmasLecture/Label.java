
package com.jamiestorey.uni.java.labs.week12.christmasLecture;

/**
 * A label for a present.
 * 
 * @author Ian bradley
 * @version 1.0
 */
public class Label
{

	private String giver;
	private String receiver;
	private String message;

	public Label(String message)
	{
		this.message = message;
		giver = "unknown";
		receiver = "anyone";
	}

	public Label(String giver, String receiver, String message)
	{
		this.giver = giver;
		this.receiver = receiver;
		this.message = message;
	}

	public String getGiver()
	{
		return giver;
	}

	public String getReceiver()
	{
		return receiver;
	}

	public String getMessage()
	{
		return message;
	}

}
