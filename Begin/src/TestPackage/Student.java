package TestPackage;

public class Student 
{

	static int a; static String ne;
	public void In()
	{
		System.out.println("Integer number is " + a);
	}
	public void Out()
	{
		System.out.println("String provided is " +ne);
	}
	
	public static void main(String[] args) 
	{
	a=234;
	ne="Anurag";	
	Student m1=new Student();
	m1.In();
	m1.Out();
	m1.a=111;
	m1.In();	
	}
}
