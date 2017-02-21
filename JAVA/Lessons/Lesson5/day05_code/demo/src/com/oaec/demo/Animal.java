package com.oaec.demo;

public class Animal {
	private String name;
	private String furColor;
	
	//alt+shift+s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	public void eat(){
		System.out.println("³Ô");
	}
	
	public void rest(){
		System.out.println("ÐÝÏ¢");
	}
}
