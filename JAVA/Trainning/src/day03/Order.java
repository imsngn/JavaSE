package day03;
public class Order {
	private String LT = "LT";
	private String BT = "BT";
	private String EQ = "EQ";
	
	
	public String compare(int number01,int number02){
		if(number01 > number02){
			return BT;
		}else if (number01 < number02) {
			return LT;
		}else {
			return EQ;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}