 class ThisDemo7 {
	
	 int emp_id =1488;
	
	ThisDemo7()
	{
		
		this(30);
		System.out.println("Thius is default Constructor");
	}
	
	ThisDemo7(int emp_id)
	{
		
		this.emp_id=emp_id;
		System.out.println(this.emp_id);
		
		System.out.println("This is parametried construct");
		
	}
	
	public void print()
	{
		//Local variable num
	int emp_id=20;

	//Printing the local variable

	System.out.println("Value of local varibale num is "+emp_id);


	//Printing the instance variable
	System .out.println("Value of instanse variable num is" +this.emp_id);

	

	}
}
 
 
	public class This_Example2
	{
	//Instantiating the class
		
		public static void main(String args[])
		{
		
		ThisDemo7 obj1= new ThisDemo7();
		
		//invoking the print method
		
		obj1.print();
		
		//Passing a new value to the num variable through parametriesded constructor
		
		//This_Example2 obj2=new This_Example2();
		
		
		//invoking the print method again
		
		//obj2.print();
		
		}
	}




