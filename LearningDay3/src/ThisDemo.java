
class ThisDemo 

{
	
	//Instance variable number 
	int num =10;
	
	ThisDemo()
	{
		System.out.println("This is a example programme on keyword this");
	}
	
	ThisDemo(int num)
	{
		//invoking default constructor
		
		this();
		
		//Assigning the local variable num to the instance variable num
		
		this.num=num;
	}
	

public void greet()
{
	System.out.println("hi Welcome to java World");
	}
public void print()
{
	//Local variable num
int num =20;

//Printing the local variable

System.out.println("Value of local varibale num is "+num);


//Printing the instance variable
System .out.println("Value of instanc evariable num is" +this.num);

this.greet();

}


public class Test
{
//Instantiating the class
	
	public static void main(String args[])

	{

	ThisDemo obj1= new ThisDemo();
	
	//invoking the print method
	
	obj1.print();
	
	//Passing a new value to the num variable through parametriesded constructor
	
	ThisDemo obj2=new ThisDemo(30);
	
	
	//invoking the print method again
	
	obj2.print();
	
	}
	
	}

}


