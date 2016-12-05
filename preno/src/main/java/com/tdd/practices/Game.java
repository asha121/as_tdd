package com.tdd.practices;

import com.tdd.practices.rps.Paper;
import com.tdd.practices.rps.Player;
import com.tdd.practices.rps.Rock;

public class Game implements IGame {

	@Override
	public Player WinnerBetween(String fPlayer, String sPlayer) {
		Player player = null;
		if (fPlayer.equals(sPlayer)) {
			player = samePlayer(sPlayer, player);
		} else if ((fPlayer.equals("Rock") && sPlayer.equals("Scissor"))
				|| (sPlayer.equals("Rock") && fPlayer.equals("Scissor"))) {
			player = new Rock("Rock", "rock crushes scissors -> rock wins");
		} else if ((fPlayer.equals("Rock") && sPlayer.equals("Paper"))
				|| (sPlayer.equals("Rock") && fPlayer.equals("Paper"))) {
			player = new Paper("Paper", "paper covers rock -> paper wins");
		} else if ((fPlayer.equals("Scissor") && sPlayer.equals("Paper"))
				|| (sPlayer.equals("Scissor") && fPlayer.equals("Paper"))) {
			player = new Scissor("Scissor", "scissors cut paper -> scissors wins");
		}
		return player;

	}

	private Player samePlayer(String sPlayer, Player player) {
		if (sPlayer.equals("Rock")) {
			player = new Rock("Rock", "TIE");
		} else if (sPlayer.equals("Scissor")) {
			player = new Scissor("Scissor", "TIE");
		} else if (sPlayer.equals("Paper")) {
			player = new Paper("Paper", "TIE");
		}
		return player;
	}

}
