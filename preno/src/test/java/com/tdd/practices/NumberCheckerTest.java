package com.tdd.practices;

import static org.junit.Assert.fail;

import org.junit.Test;

import junit.framework.Assert;

public class NumberCheckerTest {

	@Test
	public void testIs_6_PrefectNumber() {
		Assert.assertEquals(true, new NumberChecker().isPrefectNumber(6).booleanValue());

	}

}
