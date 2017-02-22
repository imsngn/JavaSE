package day05;


public abstract class ElectricDevice {
	private boolean onOff;
	
	public boolean isOnOff() {
		return onOff;
	}
	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}
	public abstract void open();
	public abstract void close();
}
