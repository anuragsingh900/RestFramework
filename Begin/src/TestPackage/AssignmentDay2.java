package TestPackage;

public class AssignmentDay2 
{

	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum of two numbers entered is " +c);
		return c;
	}
	
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("Difference of two numbers entered is " +c);
		return c;
	}
	
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("Multiplication result of two numbers entered is " +c);
		return c;
	}
	
	public  int div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("Division result of two numbers entered is " +c);
		return c;
	}
	
	public static void main(String[] args) 
	{
	
		AssignmentDay2 ob=new AssignmentDay2();
		int i=ob.sum(10, 2);
		int j=ob.sum(i, 2);
		int k=ob.sub(j, 2);
		int l=ob.mul(k, 2);
		int m=ob.div(l, 2);
		
		System.out.println("Result of the first section is " +m);
		
		int p=ob.sub(10, 2);
		int q=ob.sum(p, 2);
		int r=ob.sub(q, 2);
		int s=ob.mul(r, 2);
		int t=ob.div(s, 2);
		
		System.out.println("Result of the second section is " +t);
		
		AssignmentDay3 n=new AssignmentDay3(3,6);
	}
}
