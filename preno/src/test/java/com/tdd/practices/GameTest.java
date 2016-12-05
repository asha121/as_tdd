package com.tdd.practices;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GameTest {

	@Autowired
	Game game;

	@Test
	public void testRockCrushScissor() {
		Assert.assertEquals("Rock", game.WinnerBetween("Rock", "Scissor"));
	}

	@Test
	public void testScissorNeverCutRock() {
		Assert.assertNotSame("Scissor", game.WinnerBetween("Rock", "Scissor"));
	}

	@Test
	public void testPaperCoversRock() {
		Assert.assertEquals("paper", game.WinnerBetween("Rock", "Paper"));
	}

	@Test
	public void testScissorsCutPaper() {
		Assert.assertEquals("scissor", game.WinnerBetween("Scissor", "Paper"));
	}

	@Test
	public void testRockTie() {
		Assert.assertEquals("TIE", game.WinnerBetween("Rock", "Rock"));
	}

	@Test
	public void testPaperTie() {
		Assert.assertEquals("TIE", game.WinnerBetween("Paper", "Paper"));
	}

	@Test
	public void testScissorTie() {
		Assert.assertEquals("TIE", game.WinnerBetween("Scissor", "Scissor"));
	}

}
