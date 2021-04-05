
class Emp{
	
	int emp_id;
	String e_name;
	void getdata(int a , String n)
	
	{
		emp_id =a;
		e_name=n;
	}
}

class Dept extends Emp


{
	
	int dept_id;
	String dept_name;
	
void getdept(int a , String n)
	
	{
		dept_id =a;
		dept_name=n;
	}

	void display()
	{
		System.out.println(emp_id+" "  +e_name+" "+  dept_id+"  "+  dept_name);
	}
}
public class inherit2 {
	
	public static void main (String[] args)
	
	{
		Dept d = new Dept();
		d.getdata(111, "Rajesh");
		
	d.getdept(1344, "JavaLearning");
		d.display();
	}

}