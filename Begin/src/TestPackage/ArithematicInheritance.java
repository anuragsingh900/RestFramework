package TestPackage;

public class ArithematicInheritance extends AssignmentDay2
{
	public int fraction(int a, int b)
	{
		int c=a/b;
		return c;
		
	}
	
	public static void main(String[] args) 
	{
	
		ArithematicInheritance ai=new ArithematicInheritance();
		ai.sum(1, 2);
	}
	
}
