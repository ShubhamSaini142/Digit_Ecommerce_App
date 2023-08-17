package Ecommerce;

public abstract class User{
	String userId;
	String password;
	String loginStatus = " ";
	abstract Boolean verifyUserId();
	public User(String userId,String password,String loginStatus) {
		this.userId = userId;
		this.password= password;
		this.loginStatus = loginStatus;
	}
	public User() {
	}
}


