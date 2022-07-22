package Loops;

public class AssignmentDay8PrimeNumber 
{

	public AssignmentDay8PrimeNumber(int a) 
	{
	int half=a/2;
	int yes=0;
	
	for(int i=2;i<=half;i++)
	{
		if(a%i==0)
		{
			System.out.println("Not a prime number " + a);
			yes=1;
			break;
		}
	}
	if(yes==0)
	{
		System.out.println("Prime number " +a);
	}
	}
	
	public static void main(String[] args) 
	{
		AssignmentDay8PrimeNumber ad=new AssignmentDay8PrimeNumber(1073);	
	}
}
