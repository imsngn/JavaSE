package day03;

public class CatLoverWithTwoCats extends CatLover {
	private Cat cat01 = new Cat();
	private Cat cat02 = new Cat();
	
	public CatLoverWithTwoCats(Cat c1, Cat c2){
		cat01 = c1;
		cat02 = c2;
	}
	
	public void queryCat(String owner,String name) {
		if (name.equals(cat01.getCatName())) {
			System.out.println( owner +" 拥有这只猫  "+ cat01.toString());
		}else if (name.equals(cat02.getCatName())) {
			System.out.println( owner +" 拥有这只猫  "+ cat02.toString());
		}else {
			System.out.println( owner+" 没有养这只猫");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
