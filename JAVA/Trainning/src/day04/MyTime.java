package day04;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public MyTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	
	@Override
	public String toString() {
		return "MyTime [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	public void display(){
		System.out.println(this.hour + " :: " + this.minute + " :: " + this.second );
	}
	public MyTime addSecond(int sec){
		this.second += sec;
		this.minute += this.second/60;
		this.hour += this.minute/60;
		if (this.hour > 24){
			this.hour %= 24;
		}
		this.second %= 60;
		this.minute %=60;
		this.second %= 60;
		
		return this;
	}
	public MyTime addMinute(int min){
		this.minute += min;
		
		this.hour += this.minute/60;
		if (this.hour > 24){
			this.hour %= 24;
		}
		this.minute %= 60;
	
		return this;
	}
	public MyTime addHour(int hour){
		this.hour += hour;
		this.hour %= 24;
	
		return this;
	}
	
	public MyTime subSecond(int sec){
		if(this.second > sec){
			this.second -= sec;
			return this;
		}
		else{
			this.second -= sec;
			int adjMinutes = Math.abs(this.second/60) + 1;
			this.second = (this.second % 60 + 60)%60;
			if(this.minute > adjMinutes){
				this.minute -= adjMinutes;
				return this;
			}
			else{
				this.minute -= adjMinutes;
				int adjHours = Math.abs(this.minute/60) + 1;
				this.minute = (this.minute%60 + 60)%60;
				if(this.hour > adjHours){
					this.hour -= adjHours;
					return this;
				}
				else{
					this.hour -= this.hour - adjHours;
					this.hour -= (this.hour%24 + 24)%24;
					return this;
				}
			}
		}

	}
	public MyTime subMinute(int min){
		if(this.minute > min){
			this.minute -= min;
			return this;
		}
		else{
			this.minute -= min;
			int adjHours = Math.abs(this.minute/60) + 1;
			this.minute = (this.minute%60 + 60)%60;
			if(this.hour > adjHours){
				this.hour -= adjHours;
				return this;
			}
			else{
				this.hour -=  adjHours;
				this.hour = (this.hour%24 + 24)%24;
				return this;
			}
		}
		
	}
	public MyTime subHour(int hour){
		hour %= 24;
		if (this.hour >= hour){
			this.hour -= hour;
		}
		else{
			this.hour -= hour;
			this.hour = (this.hour  + 24)%24;
		}
		return this;
	}
}
