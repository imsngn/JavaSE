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
		roles.add("����");
		roles.add("�ܲ�");
		roles.add("��Ȩ");
		
		System.out.println("**********************");
		System.out.println("**      ��ȭ����ʼ                 **");
		System.out.println("**********************");
		System.out.println("��ȭ����1������  2�� ʯͷ  3�� ��"); 
		
		
		
	}
	
	
	public boolean needStart(){
		String str = InterActiveGet.getOneInputString("Ҫ��ʼ�� ��y/n :��");
		if(str.equals("y")){
			return true;
		}
		else{
			return  false;
		}
	}
	public void intilise() {
		this.roleNumber = InterActiveGet.getOneInterger("��ѡ��Է���ɫ(1.���� 2���ܲ� 3����Ȩ");
		this.userName  = InterActiveGet.getOneInputString("���������������");
		System.out.println(this.userName  + " VS " + this.roles.get(roleNumber-1) );
		if(needStart()){
		}
		else{
			System.exit(1);
		}
	}
	
	public boolean nextRound(){
		String str = InterActiveGet.getOneInputString("�Ƿ������һ�� y/n :��");
		if(str.equals("y")){
			return true;
		}
		else{
			return  false;
		}
	}
	

}