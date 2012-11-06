package edu.psu.acm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import edu.psu.acm.exception.DivByZeroException;
import edu.psu.acm.exception.NullArgException;
import edu.psu.acm.exception.SizeMismatchException;
import edu.psu.acm.math.ACMMath;

public class ACMMathTest
{
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

	@Test(expected = DivByZeroException.class)
	public void testDivide_4by0_throwsException() throws DivByZeroException
	{
		ACMMath.divide(4, 0);
	}

	@Test
	public void testDivide_4by2_2() throws DivByZeroException
	{
		assertEquals(2, ACMMath.divide(4, 2));
	}

	@Test
	public void testVectorAdd_1234plus4321_5555() throws NullArgException, SizeMismatchException
	{
		List<Integer> a = Arrays.asList(1, 2, 3, 4);
		List<Integer> b = Arrays.asList(4, 3, 2, 1);

		assertEquals(Arrays.asList(5, 5, 5, 5), ACMMath.vectorAdd(a, b));
	}

	@Test
	public void testVectorAdd_1234plus4321_notNull() throws NullArgException, SizeMismatchException
	{
		List<Integer> a = Arrays.asList(1, 2, 3, 4);
		List<Integer> b = Arrays.asList(4, 3, 2, 1);

		assertNotNull(ACMMath.vectorAdd(a, b));
	}

	@Test(expected = NullArgException.class)
	public void testVectorAdd_nullArg_throwsException() throws NullArgException, SizeMismatchException
	{
		List<Integer> a = Arrays.asList(1, 2, 3, 4);
		List<Integer> b = null;

		ACMMath.vectorAdd(a, b);
	}

	@Test(expected = SizeMismatchException.class)
	public void testVectorAdd_4444plus333_throwsException() throws NullArgException, SizeMismatchException
	{
		List<Integer> a = Arrays.asList(4, 4, 4, 4);
		List<Integer> b = Arrays.asList(3, 3, 3);

		ACMMath.vectorAdd(a, b);
	}
}
