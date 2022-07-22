package Loops;

import java.util.Scanner;

public class AssignmentDay8Palindrome 
{

	public AssignmentDay8Palindrome() 
	{
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int sum=0;
		int oldnumber=number;
		
		while(number>0)
		{
			int r=number%10;
			sum=sum*10+r;
			number=number/10;
		}
		
		if(oldnumber==sum)
		{
			System.out.println("Number is palindrome "+oldnumber);
		}
		else
		{
			System.out.println("Number is not a palindrome "+oldnumber);
		}
	}
	
	public static void main(String[] args) 
	{
	
		AssignmentDay8Palindrome pal=new AssignmentDay8Palindrome();
		
	}
}
