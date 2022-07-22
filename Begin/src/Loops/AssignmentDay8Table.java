package Loops;

public class AssignmentDay8Table 
{

	public void table()
	{
		int number=9;
		for (int i=1;i<=10;i++)
		{
			int tablevalue=number*i;
			System.out.println("Table value for " +number+"*" +i+ " is " +tablevalue);
		}
	}
	
	public static void main(String[] args) 
	{
	
		AssignmentDay8Table tab=new AssignmentDay8Table();
		tab.table();
	}
}
