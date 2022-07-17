package TestPackage;

public class LoginStaticPolymorphism 
{

	public void login(String id)
	{
		System.out.println("Please create a login id " +id );
	}
	
	public void login(String id,String password)
	{
		System.out.println("Please create a login id " +id);
		System.out.println("Please create a password " +password);
	}
	
	public void login(String id, String password, String email, int mobile)
	{
		System.out.println("Please create a login id " +id);
		System.out.println("Please create a password " +password);
		System.out.println("Please enter an email id " + email);
		System.out.println("Please enter a mobile number " +mobile);
	}
	
	public static void main(String[] args) 
	{
	
		LoginStaticPolymorphism lg=new LoginStaticPolymorphism();
		lg.login("anurag","password");
	}
}
