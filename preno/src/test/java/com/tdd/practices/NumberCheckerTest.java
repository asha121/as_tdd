package com.tdd.practices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.junit.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = NumberChecker.class, loader = AnnotationConfigContextLoader.class)
public class NumberCheckerTest {
	@Autowired
	private INumberChecker numChecker;

	@Test
	public void testIs_6_PrefectNumber() {
		Assert.assertEquals(true, numChecker.isPrefectNumber(6).booleanValue());

	}

	@Test
	public void testIs_28_PrefectNumber() {
		Assert.assertEquals(true, numChecker.isPrefectNumber(28).booleanValue());

	}

	@Test
	public void testIs_496_PrefectNumber() {
		Assert.assertEquals(true, numChecker.isPrefectNumber(496).booleanValue());

	}

	@Test
	public void testIs_8128_PrefectNumber() {
		Assert.assertEquals(true, numChecker.isPrefectNumber(496).booleanValue());

	}

	@Test
	public void testIs_negative_NumberCheck() {
		Assert.assertNotSame(true, numChecker.isPrefectNumber(-28).booleanValue());
		Assert.assertSame(false, numChecker.isPrefectNumber(-28).booleanValue());

	}

	@Test
	public void test_to_check_fail_NumberCheck() {
		Assert.assertNotSame(true, numChecker.isPrefectNumber(10).booleanValue());
		Assert.assertSame(false, numChecker.isPrefectNumber(10).booleanValue());

	}

}
