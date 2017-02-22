package day05;

public class Fan extends ElectricDevice {
	
	@Override
	public void open() {
		if (this.isOnOff()){
			System.out.println("电扇已经开着的了");
		}
		else {
			System.out.println("打开电扇");
			setOnOff(true);
		}
		

	}

	@Override
	public void close() {
		if(this.isOnOff()){
			System.out.println("关掉电扇");
			setOnOff(false);
		}
		else {
			System.out.println("电扇已经关着的了");

		}


	}

}
