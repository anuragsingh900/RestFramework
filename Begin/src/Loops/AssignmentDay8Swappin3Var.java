package Loops;

public class AssignmentDay8Swappin3Var 
{

	public AssignmentDay8Swappin3Var(int a, int b)
	{
		int c=a;
		a=b;
		b=c;
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
	}
	
	public static void main(String[] args) 
	{
		AssignmentDay8Swappin3Var ad=new AssignmentDay8Swappin3Var(12,15);
	}
}
