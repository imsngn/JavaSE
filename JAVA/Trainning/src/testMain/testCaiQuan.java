package testMain;

import java.util.ArrayList;
import day04.Player;
import java.util.Scanner;

import day04.CaiQuanGame;
import day04.Competition;

public class testCaiQuan {
	private String userName;
	
	
	public  static void main(String[] args){
		CaiQuanGame game = new CaiQuanGame();
		game.startGame();
		game.intilise();
			Player player02 = new Player(game.getRoles().get(game.getRoleNumber()-1));
			Player player01 = new Player(game.getUserName());
			Competition compt  = new Competition(player01,player02);
			compt.startGuest();
			while(game.nextRound()){
				compt.startGuest();
			}
			compt.competitionResult();
		
	}
	

}
