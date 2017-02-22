package day05;

public class Light extends ElectricDevice {
	
	

	@Override
	public void open() {
		if (this.isOnOff()){
			System.out.println("电灯已经开着的了");
		}
		else {
			System.out.println("打开电灯");
			setOnOff(true);
		}
		

	}

	@Override
	public void close() {
		if(this.isOnOff()){
			System.out.println("关掉电灯");
			setOnOff(false);
		}
		else {
			System.out.println("电灯已经关着的了");

		}


	}

}
