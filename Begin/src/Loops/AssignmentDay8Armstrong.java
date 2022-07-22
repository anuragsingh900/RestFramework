package Loops;

import java.util.Scanner;

public class AssignmentDay8Armstrong 
{

	public AssignmentDay8Armstrong() 
	{
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int sum=0;
		int oldnumber=number;
		
		while(number>0)
		{
			int r=number%10;
			sum=sum+r*r*r;
			number=number/10;
		}
		
		if(oldnumber==sum)
		{
			System.out.println("Number is armstrong "+oldnumber);
		}
		else
		{
			System.out.println("Number is not a armstrong "+oldnumber);
		}
	}
	
	public static void main(String[] args) 
	{
	
		AssignmentDay8Armstrong arm=new AssignmentDay8Armstrong();
		
	}
}
