package day04;

import java.util.ArrayList;
public class CaiQuanGame {
	private  ArrayList<String> roles = new ArrayList<String>();
	private int roleNumber;
	private String userName;
	public String startButton;
	
	


	public ArrayList<String> getRoles() {
		return roles;
	}
	public void setRoles(ArrayList<String> roles) {
		this.roles = roles;
	}
	public int getRoleNumber() {
		return roleNumber;
	}
	public void setRoleNumber(int roleNumber) {
		this.roleNumber = roleNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStartButton() {
		return startButton;
	}
	public void setStartButton(String startButton) {
		this.startButton = startButton;
	}
	public   void startGame(){
		roles.add("刘备");
		roles.add("曹操");
		roles.add("孙权");
		
		System.out.println("**********************");
		System.out.println("**      猜拳，开始                 **");
		System.out.println("**********************");
		System.out.println("出拳规则：1。剪刀  2。 石头  3。 布"); 
		
		
		
	}
	
	
	public boolean needStart(){
		String str = InterActiveGet.getOneInputString("要开始吗 ？y/n :：");
		if(str.equals("y")){
			return true;
		}
		else{
			return  false;
		}
	}
	public void intilise() {
		this.roleNumber = InterActiveGet.getOneInterger("请选择对方角色(1.刘备 2：曹操 3：孙权");
		this.userName  = InterActiveGet.getOneInputString("请输入你的姓名：");
		System.out.println(this.userName  + " VS " + this.roles.get(roleNumber-1) );
		if(needStart()){
		}
		else{
			System.exit(1);
		}
	}
	
	public boolean nextRound(){
		String str = InterActiveGet.getOneInputString("是否进行下一轮 y/n :：");
		if(str.equals("y")){
			return true;
		}
		else{
			return  false;
		}
	}
	

}
