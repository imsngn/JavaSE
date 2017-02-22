package day05;

public class TV extends ElectricDevice {

	@Override
	public void open() {
		if (this.isOnOff()){
			System.out.println("已经开着的了");
		}
		else {
			System.out.println("打开电视");
			setOnOff(true);
		}
		

	}

	@Override
	public void close() {
		if(this.isOnOff()){
			System.out.println("关掉电视");
			setOnOff(false);
		}
		else {
			System.out.println("电视已经关着的了");

		}


	}

}
