package TestPackage;

public class AssignmentDay4 
{

	public void zero()
	{
		System.out.println("Default method");
		this.first(44);
	}
	
	public void first(int a)
	{
		System.out.println("One Parameterized method");
		this.second(900, 12);
	}
	
	public void second(int a,int b)
	{
		System.out.println("Two Parameterized method");
		this.four(1, 2, 3, 4);
	}
	
	public void third(int a,int b, int c)
	{
		System.out.println("Three Parameterized method");
		this.zero();
	}
	
	public void four(int a,int b, int c, int d)
	{
		System.out.println("Four Parameterized method");
	}
	
	public static void main(String[] args) 
	{
	
		AssignmentDay4 ad=new AssignmentDay4();
		ad.third(2, 987, 12);
	}
}
