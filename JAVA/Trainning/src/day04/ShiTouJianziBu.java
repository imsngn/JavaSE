package day04;

public class ShiTouJianziBu {
	private String stone = "石头";
	private String  scissor = "剪刀";
	private String cloth = "布";

	private String result;
	
	
	
	
	
	public String getResult() {
		return result;
	}

	public ShiTouJianziBu() {
		super();
	}
	
	public String compare(ShiTouJianziBu guessValue){
		if(this.equals(guessValue)){
			return "EQ";
		}
		else if(this.result.equals(stone) && (guessValue.result.equals(scissor))	 ) {
			return "BT";
		}
		else if(this.result.equals(stone) && (guessValue.result.equals(cloth))	 ) {
			return "LT";
		}
		else if(this.result.equals(scissor) && (guessValue.result.equals(stone))	 ) {
			return "LT";
		}
		else if(this.result.equals(scissor) && (guessValue.result.equals(cloth))	 ) {
			return "BT";
		}
		else if(this.result.equals(cloth) && (guessValue.result.equals(stone))	 ) {
			return "BT";
		}
		else if(this.result.equals(cloth) && (guessValue.result.equals(scissor))	 ) {
			return "LT";
		}
		else {
			return  "EQ";
		}


	}
	
	public ShiTouJianziBu(int number){
		if(number == 1) {
			this.result = "剪刀";
		}
		else if (number == 2){
			this.result = "石头";
		}
		else if(number == 3) {
			this.result = "布";
		}
		
	}
}
