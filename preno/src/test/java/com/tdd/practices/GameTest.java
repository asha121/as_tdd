package com.tdd.practices;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.tdd.practices.rps.Paper;
import com.tdd.practices.rps.Player;
import com.tdd.practices.rps.Rock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Game.class, loader = AnnotationConfigContextLoader.class)

public class GameTest {

	@Autowired
	Game game;

	@Test
	public void testRockCrushScissor() {
		Player rock = new Rock("Rock", "rock crushes scissors -> rock wins");
		Assert.assertEquals(rock.getMsg(), (game.WinnerBetween("Rock", "Scissor")).getMsg());
		Assert.assertEquals(rock.getName(), (game.WinnerBetween("Rock", "Scissor")).getName());
		Assert.assertNotSame("Scissor", game.WinnerBetween("Rock", "Scissor").getName());
		Assert.assertNotSame("Scissor", game.WinnerBetween("Rock", "Scissor").getMsg());
		Assert.assertSame(rock.getClass(), game.WinnerBetween("Rock", "Scissor").getClass());
	}

	@Test
	public void testPaperCoversRock() {
		Player paper = new Paper("Paper", "paper covers rock -> paper wins");
		Player testPlayer = game.WinnerBetween("Paper", "Rock");
		Assert.assertEquals(paper.getMsg(), testPlayer.getMsg());
		Assert.assertEquals(paper.getName(), testPlayer.getName());
		Assert.assertNotSame("Scissor", testPlayer.getName());
		Assert.assertNotSame("Scissor", testPlayer.getMsg());
		Assert.assertSame(paper.getClass(), testPlayer.getClass());
	}

	@Test
	public void testScissorsCutPaper() {

		Player scissor = new Scissor("Scissor", "scissors cut paper -> scissors wins");
		Player testPlayer = game.WinnerBetween("Scissor", "Paper");
		Assert.assertEquals(scissor.getMsg(), testPlayer.getMsg());
		Assert.assertEquals(scissor.getName(), testPlayer.getName());
		Assert.assertNotSame("Paper", testPlayer.getName());
		Assert.assertNotSame("Paper", testPlayer.getMsg());
		Assert.assertSame(scissor.getClass(), testPlayer.getClass());
	}

	@Test
	public void testScissorTie() {
		Player tieScissor = new Scissor("Scissor", "TIE");
		Player testPlayer = game.WinnerBetween("Scissor", "Scissor");
		Assert.assertEquals(tieScissor.getMsg(), testPlayer.getMsg());
		Assert.assertEquals(tieScissor.getName(), testPlayer.getName());
		Assert.assertNotSame("Paper", testPlayer.getName());
		Assert.assertNotSame("Rock", testPlayer.getName());
		Assert.assertNotSame("scissors cut paper -> scissors wins", testPlayer.getMsg());
	}

	@Test
	public void testPaperTie() {
		Player tieScissor = new Paper("Paper", "TIE");
		Player testPlayer = game.WinnerBetween("Paper", "Paper");
		Assert.assertEquals(tieScissor.getMsg(), testPlayer.getMsg());
		Assert.assertEquals(tieScissor.getName(), testPlayer.getName());
		Assert.assertNotSame("Scissor", testPlayer.getName());
		Assert.assertNotSame("Rock", testPlayer.getName());
		Assert.assertEquals("TIE", testPlayer.getMsg());
	}

	@Test
	public void testRockTie() {
		Player tieScissor = new Paper("Rock", "TIE");
		Player testPlayer = game.WinnerBetween("Rock", "Rock");
		Assert.assertEquals(tieScissor.getMsg(), testPlayer.getMsg());
		Assert.assertEquals(tieScissor.getName(), testPlayer.getName());
		Assert.assertNotSame("Scissor", testPlayer.getName());
		Assert.assertNotSame("Paper", testPlayer.getName());
		Assert.assertNotSame("scissors cut paper -> scissors wins", testPlayer.getMsg());
		Assert.assertEquals("TIE", testPlayer.getMsg());

	}

}
