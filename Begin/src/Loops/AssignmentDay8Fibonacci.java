package Loops;

public class AssignmentDay8Fibonacci 
{

	public AssignmentDay8Fibonacci() 
	{

		int a=0;
		int b=1;
		int sum;
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=10;i++)
		{
			
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}
	
	public static void main(String[] args) 
	{
		AssignmentDay8Fibonacci fib=new AssignmentDay8Fibonacci();
		
	}
}
