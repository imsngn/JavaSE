package day05;

public class TV extends ElectricDevice {

	@Override
	public void open() {
		if (this.isOnOff()){
			System.out.println("�Ѿ����ŵ���");
		}
		else {
			System.out.println("�򿪵���");
			setOnOff(true);
		}
		

	}

	@Override
	public void close() {
		if(this.isOnOff()){
			System.out.println("�ص�����");
			setOnOff(false);
		}
		else {
			System.out.println("�����Ѿ����ŵ���");

		}


	}

}
