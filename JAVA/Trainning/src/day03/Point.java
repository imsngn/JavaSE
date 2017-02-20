package day03;

public class Point {
	private double xAxisValue=0;
	private double yAxixValue=0;
	
	
	public Point(double x,double y){
		xAxisValue = x;
		yAxixValue = y;
	}
	public Point(){
	
	}
	public String toString(){
		return "(" + xAxisValue + ", " + yAxixValue + ")";
	}
	
	public double getX() {
		return xAxisValue;
	}
	public double getY() {
		return yAxixValue;
	}
	public void setX(double x) {
		xAxisValue = x;
	}
	public void setY(double y){
		yAxixValue = y;
	}


}
