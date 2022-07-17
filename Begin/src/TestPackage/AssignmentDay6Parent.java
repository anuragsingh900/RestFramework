package TestPackage;

public class AssignmentDay6Parent 
{

	public AssignmentDay6Parent() 
	{
		this(1,1,1);
		System.out.println("Default Parent Constructor");
	}
	
	public AssignmentDay6Parent(int a) 
	{
		this();
		System.out.println("One Paramterized Parent Constructor");
	}
	
	public AssignmentDay6Parent(int a, int b) 
	{
		this(1);
		System.out.println("Two Paramterized Parent Constructor");
	}
	
	public AssignmentDay6Parent(int a, int b, int c) 
	{
	
		System.out.println("Three Paramterized Parent Constructor");
	}
}
