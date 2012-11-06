package edu.psu.acm.test;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.psu.acm.exception.DivByZeroException;
import edu.psu.acm.math.ACMMath;

public class ACMMathTest {
	
	@Test
	public void testAdd_2plus3_5()
	{
			assertEquals(5, ACMMath.add(2, 3));		

	}
	
	@Test
	public void testAdd_0plus0_0()
	{		
		assertEquals(0, ACMMath.add(0, 0));		
	}
	
	@Test (expected=DivByZeroException.class)
	public void testDivide_4by0_throwsException() throws DivByZeroException
	{
		ACMMath.divide(4,0);
	}
	
	@Test
	public void testDivide_4by2_2() throws DivByZeroException
	{
		assertEquals(2, ACMMath.divide(4,2));
}

}
