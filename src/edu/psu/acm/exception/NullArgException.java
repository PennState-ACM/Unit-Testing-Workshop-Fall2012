package edu.psu.acm.exception;

@SuppressWarnings("serial")
public class NullArgException extends Exception
{
	public NullArgException(String message)
	{
		super(message);
	}
}
