package edu.psu.acm.math;

import edu.psu.acm.exception.DivByZeroException;

public class ACMMath {

	
	public static int add(int i, int j) 
	{
		return i + j;
	}
	
	public static int divide(int a, int b) throws DivByZeroException
	{
		if ( b == 0)
		{
			throw new DivByZeroException("Cannot divide by 0!!!!");
		}
		return a / b;
	}
}
