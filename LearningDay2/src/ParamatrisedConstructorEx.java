

class Day2
{
	
	int roll_number;
	String emp_name;
	Day2(int i , String n)
	{
		roll_number=i;
	    emp_name=n;
	}
	void display()
	{
		System.out.println("Rollnumber is:"+ roll_number + "Name is :" +emp_name);
	}


public class ParamatrisedConstructorEx 

{
	
	public static void main (String args[])
	
	Day2 r1 =new Day2(1111, "Sweta");
	r1.display();
}



}