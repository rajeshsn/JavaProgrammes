	
class Details{
	
	String name;
	int emp_id;
	int base_sal;
	
	int hra;
	int da;
	
	 Details(String name,int emp_id,int base_sal){
		
		this.name=name;
		this.emp_id=emp_id;
		this.base_sal=base_sal;
		
	}
	

	void showDetails(){
		System.out.println("Employee Details are :"+name+" " +emp_id+" "+base_sal);
		
		
	}
	
	void calGrossSal(){
	
		int gross_sal;
		
		gross_sal=base_sal+da+hra;
		
		System.out.println(""+gross_sal);
		
		
	}
	void setData(int da){
		this.da=da;
		
		
	}	
	
	void setHra(int hra){
		this.hra=hra;
		
	}


}

	
public class Employee {
	
	String name;
	int emp_id;
	int base_sal;
	
	int hra;
	int da;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Details d= new Details("Rajesh",148881,1000);
	
		d.showDetails();
		d.setData(10000);
		d.setHra(20000);
		d.calGrossSal();

	}

}
