package Loops;

public class AssignmentDay8Swapping2Var 
{

	public AssignmentDay8Swapping2Var(int a, int b) 
	{
	a=a+b;
	System.out.println("Value of a is "+a);
	b=a-b;
	System.out.println("Value of swapped b is "+b);
	a=a-b;
	System.out.println("Value of swapped a is "+a);
	}
	
	public static void main(String[] args) 
	{
		AssignmentDay8Swapping2Var ad=new AssignmentDay8Swapping2Var(100,-39);
		
	}
}
