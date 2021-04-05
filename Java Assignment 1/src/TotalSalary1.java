class Employee{
	
	String name;
	int emp_id;
	long salary;
	int emp_da;
	int emp_dra;
	
	Employee(String name,int emp_id,long salary,int emp_da,int emp_dra)
	{
		this.name =name;
		this.emp_id=emp_id;
		this.salary=salary;
		this.emp_da=emp_da;
		this.emp_dra=emp_dra;
		
	}
	
	void totalSal()
	{
		long totalsal;
		totalsal=salary+emp_dra+emp_da;
		
		System.out.println("Employee Details:"+name+" "+emp_id+" "+totalsal);
	}
}
public class TotalSalary1 {
	
	public static void main (String[] args)
	{
		Employee e =new Employee("Rajesh",148881,100000,10000,100000);
		
		e.totalSal();
		
	}

}
