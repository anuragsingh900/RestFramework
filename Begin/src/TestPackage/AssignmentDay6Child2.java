package TestPackage;

public class AssignmentDay6Child2 extends AssignmentDay6Parent2
{

	public void w() 
	{
		System.out.println("Default Child Method");
	}
	
	public void w(int a) 
	{
		System.out.println("One Paramterized Child Method");
	}
	
	public void w(int a, int b) 
	{
		super.a(1,2,3);
		System.out.println("Two Paramterized Child Method");
		this.w();
		this.w(3);
		this.w(2, 22, 222);
	}
	
	public void w(int a, int b, int c) 
	{
		System.out.println("Three Paramterized Child Method");
	}
	
	public static void main(String[] args) 
	{
	
		AssignmentDay6Child2 adc=new AssignmentDay6Child2();
		adc.w(1, 1);
	}
}
