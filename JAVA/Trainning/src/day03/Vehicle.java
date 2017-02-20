package day03;

public class Vehicle {
	private double speed = 0.0;
	private double size = 0.0;
	
	public Vehicle(double spd,double sz){
		speed = spd;
		size = sz;
	}
	public void setSpeed(double spd){
		speed = spd;
	}
	public void speedUp(){
		if (speed == 0) {           //从静止状态加速，设定初始速度为25
			setSpeed(15.0);
		}else if(speed == 120.0){ //如果当前速度120， 禁止加速
			System.out.println("too dangerous! speed reach 120km/s already, speedUP denied!!!");
		}else if(speed > 120) { //如果当前速度大于120，禁止加速，强制将为120
			System.out.println("ALARM!!! current speed exceed 120km/s, speedUP denied!!! speendown to 120km/s  ");
			setSpeed(120.0);
			System.out.println("your speed has been speed down to " + speed +" now");
			System.out.println();
		} else if(speed >100 && speed < 120) { //如果当前速度    100 < v < 120,  一次加速速度增加10%
			speed = speed + speed * 0.1;
			if(speed > 120) {
				speed = 120;
				System.out.println("cannot exceed 120km/s, stop speedUP, your current speed is 120km/s");
			}
		} else if(speed >60 && speed <= 100) { //如果当前速度  60< v <=100, 一次加速，速度增加 20%
			speed = speed + speed * 0.2;
			System.out.println("speed up! your current speed is "+ speed);
		}else{ //如果当前速度小等于60， 一次加速，速度增加25% 
			speed = speed + speed * 0.25;
			System.out.println("speed up! your current speed is "+ speed);
		}
	}
	public String toString() {
		return "speed is " + speed + " size is "+size;
	}
	public double getSpeed() {
		return speed;
	}
	public double getSize() {
		return size;
	}
	public void speedDown(){
		speed = speed - speed*0.25;
		if (speed < 5.0) {
			speed = 0.0;
		}
		System.out.println("speed down, your current speed is "+ speed);

	}
	public void move() {
		setSpeed(2.0);
		System.out.println("you start to move and the initial speed is "+ speed);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
