
class Sweta
{
	
	int emp_id;
	String emp_name;
	
	void insertRecord(int r , String n)
	
	{
		emp_id=r;
		emp_name=n;
	}
	void display()
	
	{
		System.out.println("Employee id is :"+emp_id+" and Name is:"+emp_name);
	}
}


public class ObjectExample 
{
	
	public static void main (String args[])
	
	{
		Sweta r1=new Sweta();
		
		r1.insertRecord(148881,"Rajesh" );
		
	    r1.display();
		
		
	}
	
	
}
