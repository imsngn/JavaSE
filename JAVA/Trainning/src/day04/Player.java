package day04;

public class Player {
	private String name;
	private int Score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public void addScore() {
		Score++;
	}
	public Player(String name, int score) {
		super();
		this.name = name;
		Score = score;
	}
	public Player() {
		super();
	}
	
	public Player(String name) {
		super();
		this.name = name;
	}
	public ShiTouJianziBu showHand() {
		java.util.Random r = new java.util.Random();
		int max = 3;
		int min = 1;
		
		int choice = r.nextInt(max)%(max-min+1)+min;
		ShiTouJianziBu stjzb01 = new ShiTouJianziBu(choice);

		return stjzb01;
	}
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
	public ShiTouJianziBu showHandInteractive() {
		int yourChoice = day04.InterActiveGet.getOneInterger("���ȭ��1������  2��ʯͷ  3����  ���������֣� ");
		ShiTouJianziBu stjzb02 = new ShiTouJianziBu(yourChoice);
		System.out.println("���ȭ�� " + stjzb02.getResult());
		return stjzb02;

	}
	
}
