package Loops;

public class AssignmentDay8Factorial 
{

	public AssignmentDay8Factorial(int factorial) 
	{
		
		for(int i=5;i>=1;i--)
		{
			factorial=factorial*i;
			
		}
		System.out.println("Factorial is "+factorial);
	}
	
	public static void main(String[] args) 
	{
		AssignmentDay8Factorial fac=new AssignmentDay8Factorial(1);
		
	}
}
