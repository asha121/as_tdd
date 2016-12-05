package com.tdd.practices;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.tdd.practices.rps.Player;
import com.tdd.practices.rps.Rock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Game.class, loader = AnnotationConfigContextLoader.class)

public class GameTest {

	@Autowired
	Game game;
	

	@Test
	public void testRockCrushScissor() {
		Player rock= new Rock("Rock","rock crushes scissors -> rock wins");
		Assert.assertEquals(rock.getMsg(), (game.WinnerBetween("Rock", "Scissor")).getMsg());
		Assert.assertEquals(rock.getName(), (game.WinnerBetween("Rock", "Scissor")).getName());
		Assert.assertNotSame("Scissor", game.WinnerBetween("Rock", "Scissor").getName());
		Assert.assertNotSame("Scissor", game.WinnerBetween("Rock", "Scissor").getMsg());
		Assert.assertSame(rock.getClass(), game.WinnerBetween("Rock", "Scissor").getClass());
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
