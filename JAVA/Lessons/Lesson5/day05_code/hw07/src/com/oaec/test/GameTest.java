package com.oaec.test;

import java.util.Random;

import com.oaec.domain.Computer;
import com.oaec.domain.Game;
import com.oaec.domain.Person;

public class GameTest {

	public static void main(String[] args) {
		Game game = new Game();
		game.init();
		game.start();
	}

}
