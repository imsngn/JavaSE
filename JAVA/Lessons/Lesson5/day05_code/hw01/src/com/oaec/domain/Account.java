package com.oaec.domain;

//账号，密码，用户名，性别，所在地，电话，余额
public class Account {
	private int id;
	private String password;
	private String username;
	private String gender;
	private String address;
	private String tel;
	private double balance;
	
	//无参的构造方法
	public Account(){}
	
	//全参的构造方法
	public Account(int id,String password, String username,
			String gender,String address,String tel,double balance){
		this.id = id;
		this.password = password;
		this.username = username;
		this.gender = gender;
		this.address = address;
		this.tel = tel;
		this.balance = balance;
	}
	
	//setters and getters
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	//setPassword  
	public void setPassword(String password){
		this.password = password;	
	}
	//getPassword
	public String getPassword(){
		return password;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return username;
	}
		
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	
	public void setTel(String tel){
		this.tel = tel;
	}
	public String getTel(){
		return tel;
	}
	
	public void setBalance(double balance){
		if(balance < 0){
			this.balance = 0;
		}else{
			
			this.balance = balance;			
		}
	}
	public double getBalance(){
		return balance;
	}
	
	//toString()
	/*@Override 
	public String toString(){
		
		return super.toString();
		return "Account [ id="+id+" password="+password+" username="+username+" "
				+ "gender="+gender+" address="+address+" tel="+tel+" balance="+balance+"]";
	}*/
	
	//存钱 要存多少？
	public double cunQian(double money){
		//余额 要加上存入的钱数
		//balance = balance + money;
		balance += money;
		
		return balance;
	}
	
	//取钱 要取多少？
	public void quQian(double money){
		if(money > balance){
			System.out.println("取钱失败");
		}else{
			balance  = balance - money;
		}
	}

}
