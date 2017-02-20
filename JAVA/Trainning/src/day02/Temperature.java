package day02;

import java.util.ArrayList;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public double toCelsius(double fah) {
		return (fah-32)*50/9;
	}
	public double toFahrenhelt(double cel) {
		return cel*9/50 + 32;
	}
	public ArrayList<Double> createTemperatureTable(int start, int end, int step) {
		ArrayList<Double> arrayList = new ArrayList<Double>();
		for (int i = start; i < end; i=i+step) {
			arrayList.add((double)i);
		}
		return arrayList;
		
	}
	public ArrayList<Double> cel2FahTable(int start, int end, int step) {
		ArrayList<Double> arrayList = new ArrayList<Double>();
		for (int i = start; i < end; i=i+step) {
			arrayList.add(toFahrenhelt(i));
		}
		return arrayList;
		
	}
	public ArrayList<Double> fah2CelTable(int start, int end, int step) {
		ArrayList<Double> arrayList = new ArrayList<Double>();
		for (int i = start; i < end; i=i+step) {
			arrayList.add(toCelsius(i));
		}
		return arrayList;
	}
}
