package TestPackage;

public class AssignmentDay6Child extends AssignmentDay6Parent
{

	public AssignmentDay6Child() 
	{
		super(1,1);
		System.out.println("Default Child Constructor");
	}
	
	public AssignmentDay6Child(int a) 
	{
		this(1,1);
		System.out.println("One Paramterized Child Constructor");
	}
	
	public AssignmentDay6Child(int a, int b) 
	{
		this(1,1,1);
		System.out.println("Two Paramterized Child Constructor");
	}
	
	public AssignmentDay6Child(int a, int b, int c) 
	{
		this();
		System.out.println("Three Paramterized Child Constructor");
	}
	
	public static void main(String[] args) 
	{
	
		AssignmentDay6Child adc=new AssignmentDay6Child(2);
	}
}
