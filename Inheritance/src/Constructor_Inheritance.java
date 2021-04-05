class Super2 {
	int age;
	
	Super2(int age)
	{
		this.age=age;
	}
}

public class Constructor_Inheritance extends Super2

{
	
	String name;
	Constructor_Inheritance(int age, String name)
	{
		super (age);
		this.name=name;
	}
	
	public void get_data()
	{
		System.out.println("Age is:"+age+ "Name is"+name);
	}
	
	public static void main(String[] args)
	{
		Constructor_Inheritance s = new Constructor_Inheritance(11,"Rajesh");
		
		s.get_data();
		
		
	}
}
	



