package day04;

import day04.ShiTouJianziBu;

public class Competition {
	private Player player01 = new Player();
	private Player player02 = new Player();
	private int times;
	
	public Player getPlayer01() {
		return player01;
	}
	public void setPlayer01(Player player01) {
		this.player01 = player01;
	}
	public Player getPlayer02() {
		return player02;
	}
	public void setPlayer02(Player player02) {
		this.player02 = player02;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	
	public Competition(Player player01, Player player02) {
		super();
		this.player01 = player01;
		this.player02 = player02;
	}
	
	public void startGuest(){
		ShiTouJianziBu stjzb01 = player01.showHandInteractive();
		ShiTouJianziBu stjzb02 = player02.showHand();
		this.times++;
		System.out.println(player02.getName()+ " 出拳： " + stjzb02.getResult());

		String result = stjzb01.compare(stjzb02);
		if(result.equals("LT")){
			player02.addScore();
		}
		else if(result.equals("BT")){
			player01.addScore();
		}
		else{
			startGuest();
		}
	}
	public void competitionResult() {
		System.out.println("-----------------------------------------------------");
		System.out.println(player01.getName() + " VS " + player02.getName());
		System.out.println("对战次数  " + times);
		System.out.println("姓名                       "+"得分");
		System.out.println(player01.getName() + "      " + player01.getScore());
		System.out.println(player02.getName() + "      " + player02.getScore());
		System.out.println("平局: " +  (times - player01.getScore()- player02.getScore()));
		if(player01.getScore() < player02.getScore()){
			System.out.println("结果：呵呵，笨蛋，下次加油啊！");
		}
		System.out.println("-----------------------------------------------------");
		

	}
	
	
	
	
	
	

}
