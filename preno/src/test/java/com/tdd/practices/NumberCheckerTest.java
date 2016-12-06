package com.tdd.practices;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = NumberChecker.class, loader = AnnotationConfigContextLoader.class)
public class NumberCheckerTest {
	@Autowired
	private INumberChecker numChecker;

	@Test
	public void testIs_6_PrefectNumber() {
		assertEquals(true, numChecker.isPrefectNumber(6).booleanValue());

	}

	@Test
	public void testIs_28_PrefectNumber() {
		assertEquals(true, numChecker.isPrefectNumber(28).booleanValue());

	}

	@Test
	public void testIs_496_PrefectNumber() {
		assertEquals(true, numChecker.isPrefectNumber(496).booleanValue());

	}

	@Test
	public void testIs_8128_PrefectNumber() {
		assertEquals(true, numChecker.isPrefectNumber(496).booleanValue());

	}

	@Test
	public void testIs_negative_NumberCheck() {
		assertNotSame(true, numChecker.isPrefectNumber(-28).booleanValue());

	}
	@Test
	public void testIs_negative__integer_NumberCheck() {
		assertSame(false, numChecker.isPrefectNumber(-28).booleanValue());

	}

	@Test
	public void test_to_check_fail_NumberCheck() {
		assertNotSame(true, numChecker.isPrefectNumber(10).booleanValue());

	}

	@Test
	public void test_to_check_fail_with_false_NumberCheck() {
		assertSame(false, numChecker.isPrefectNumber(10).booleanValue());

	}
}
