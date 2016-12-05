package com.tdd.practices;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.tdd.practices.rpc.Rock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Game.class, loader = AnnotationConfigContextLoader.class)

public class GameTest {

	@Autowired
	Game game;
	

	@Test
	public void testRockCrushScissor() {
		Rock rock= new Rock("Rock","rock crushes scissors -> rock wins");
		Assert.assertEquals(rock.getMsg(), ((Rock) game.WinnerBetween("Rock", "Scissor")).getMsg());
		Assert.assertEquals(rock.getName(), ((Rock) game.WinnerBetween("Rock", "Scissor")).getName());
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
