package TestPackage;

import java.util.Scanner;

public class AssignmentDay4Part3 
{
	
	public static void main(String[] args) 
	{
		AssignmentDay2 ad=new AssignmentDay2();
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter value of x1");
		int x1=s.nextInt();
		System.out.println("Please enter value of x2");
		int x2=s.nextInt();
		int mult=ad.mul(x1, x2);
		System.out.println("Please enter value of x3");
		int x3=s.nextInt();
		int subt=ad.sub(mult, x3);
		System.out.println("Please enter value of x4");
		int x4=s.nextInt();
		int mult2=ad.mul(subt, x4);
		System.out.println("Please enter value of x5");
		int x5=s.nextInt();
		int sum1=ad.sum(mult2, x5);
		System.out.println("Please enter value of x6");
		int x6=s.nextInt();
		int divd=ad.div(sum1, x6);
	}
}
