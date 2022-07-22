package Loops;
//edureka.co/blog/30-pattern-programs-in-java/
public class AssignmentDay10
{

	public void firstX() 
	{

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void secondX() 
	{

		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void thirdX() 
	{

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void forthX() 
	{
		int count=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	public  void leftriangle(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) //outer loop for number of rows(n) 
        	{ 
        	for(j=2*(n-i); j>2; j--) // inner loop for spaces 
            	{           
                System.out.print(" "); // printing space
            	} 
            for(j=0; j<=i; j++) //  inner loop for columns
            	{       
                System.out.print("* "); // print star
            	}           
            System.out.println(); // ending line after each row
        } 
    }
	
	public  void pyramidPattern(int n) 
    {  
        for (int i=0; i<n; i++) //outer loop for number of rows(n) 
        	{ 
        	for (int j=n-i; j>1; j--) //inner loop for spaces
            	{ 
                System.out.print(" "); //print space
            	}  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            	{ 
                System.out.print("* "); //print star
            	} 
  
            System.out.println(); //ending line after each row
        } 
    }
	
	public static void main(String[] args) 
	{
	
		AssignmentDay10 ad=new AssignmentDay10();
		ad.firstX();
		System.out.println();
		ad.secondX();
		System.out.println();
		ad.thirdX();
		System.out.println();
		ad.forthX();
		System.out.println();
		ad.leftriangle(5);
		System.out.println();
		ad.pyramidPattern(5);
	}
}
