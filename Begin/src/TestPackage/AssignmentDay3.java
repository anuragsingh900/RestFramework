package TestPackage;

public class AssignmentDay3 
{

	public AssignmentDay3() 
	{
		this(1,2,3);
		System.out.println("Default parameterized");
	}
	
	public AssignmentDay3(int i) 
	{
		this(9,0);
		System.out.println("One parameterized");
	}
	
	public AssignmentDay3(int i,int j) 
	{
		this();
		System.out.println("Two parameterized");
	}
	public AssignmentDay3(int i,float j,int k) 
	{
		
		System.out.println("Three parameterized");
	}
	public AssignmentDay3(int i,String a,String b,int j) 
	{
		this(2);
		System.out.println("Four parameterized");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
	
		AssignmentDay3 ad=new AssignmentDay3(112,"Anu","OG",1);
	}
}
