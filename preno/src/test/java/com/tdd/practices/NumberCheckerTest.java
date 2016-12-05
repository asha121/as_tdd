package com.tdd.practices;

import static org.junit.Assert.fail;

import org.junit.Test;

import junit.framework.Assert;

public class NumberCheckerTest {

	@Test
	public void testIs_6_PrefectNumber() {
		Assert.assertEquals(true, new NumberChecker().isPrefectNumber(6).booleanValue());

	}
	@Test
	public void testIs_28_PrefectNumber() {
		Assert.assertEquals(true, new NumberChecker().isPrefectNumber(28).booleanValue());

	}
	@Test
	public void testIs_496_PrefectNumber() {
		Assert.assertEquals(true, new NumberChecker().isPrefectNumber(496).booleanValue());

	}
	@Test
	public void testIs_8128_PrefectNumber() {
		Assert.assertEquals(true, new NumberChecker().isPrefectNumber(496).booleanValue());

	}
	
	@Test
	public void testIs_negative_NumberCheck() {
		Assert.assertNotSame(true, new NumberChecker().isPrefectNumber(-28).booleanValue());

	}
	@Test
	public void test_to_check_fail_NumberCheck() {
		Assert.assertNotSame(true, new NumberChecker().isPrefectNumber(10).booleanValue());

	}

}
