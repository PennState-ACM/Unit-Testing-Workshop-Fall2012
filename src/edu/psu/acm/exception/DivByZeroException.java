package edu.psu.acm.exception;

@SuppressWarnings("serial")
public class DivByZeroException extends Exception
{
	public DivByZeroException(String message) 
	{
		super(message);
	}
}
