package day04;

public class NetUser {
	private String userId;
	private String password;
	private String mailAddress;
	public NetUser(String userId, String password, String mailAddress) {
		super();
		this.userId = userId;
		this.password = password;
		this.mailAddress = mailAddress;
	}
	
	public NetUser(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
		this.mailAddress  = userId+"@gameschool.com";
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	@Override
	public String toString() {
		return "NetUser [userId=" + userId + ", mailAddress=" + mailAddress + "]";
	}
	
	

}
