
public class StaticVariableDemo {
	
	
		int rollno;
		String name;
static String college="Test";
	
	
	StaticVariableDemo(int r , String n)
	{
		rollno=r;
		name=n;
		
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	
	
	public static void main (String args[])
	
	{
		StaticVariableDemo s1 = new StaticVariableDemo(148881 , "Rajesh");
		
		StaticVariableDemo s2 = new StaticVariableDemo(1111 , "Tom");
	}
}
