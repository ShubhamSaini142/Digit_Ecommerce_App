package Ecommerce;
import Ecommerce.Cart;
public class Customer extends User{
	private Cart cart;
	public String setPassword;
	public String setUserId;
	
	@Override
	public Boolean verifyUserId() {
		return true;
	}
	
	public void setCart(Cart cart)
	{
		this.cart = cart;
	}
	
	public Cart getCart()
	{
		return cart;
	}
	
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	
	public String getUserId()
	{
		return userId;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public Customer(Cart cart)
	{
		this.cart=cart;
	}
	public Customer( String userId,String password,String loginStatus)
	{
		super( userId, password, loginStatus);
	}
	public Customer()
	{
		
	}
	
}
