package TestPackage;

public class AssignmentDay6Parent2 
{

	public void a() 
	{
		System.out.println("Default Parent Method");
	}
	
	public void a(int a) 
	{
		System.out.println("One Paramterized Parent Method");
	}
	
	public void a(int a, int b) 
	{
		System.out.println("Two Paramterized Parent Method");
	}
	
	public void a(int a, int b, int c) 
	{
		System.out.println("Three Paramterized Parent Method");
		this.a();
		this.a(1);
		this.a(3, 3);
	}
}
