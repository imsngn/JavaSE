package day05;

public interface HotPlugAble {
	boolean plug(Integer slotNumber, PciDevice device);
	boolean unplug(Integer slotNumber, PciDevice device);

}
