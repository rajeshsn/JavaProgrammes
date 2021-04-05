
public class StaticMethod {

	
	
		int rollno;
		String name;
static String college="Test";

static void change()
{
	college="DBIT";
	
	
			}
	
	
	StaticMethod(int r , String n)
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
		StaticMethod s1 = new StaticMethod(148881 , "Rajesh");
		
		StaticMethod s2 = new StaticMethod(1111 , "Tom");
		
		s1.display();
		s2.display();
		
		StaticMethod.change();
		s1.display();
		s2.display();
		
		
		
	}
}
