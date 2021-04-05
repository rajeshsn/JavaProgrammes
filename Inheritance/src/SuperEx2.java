
class Student {
	String name;
	int roll_no;
	Student(String name, int roll_no)
	{
		this.name=name;
		this.roll_no=roll_no;
	}
}

public class SuperEx2 extends Student
{
	int marks;
	
	SuperEx2(String name,int roll_no, int marks)
	{
		super(name,roll_no);
		this.marks=marks;
	}
	
	public void display()
	{
		System.out.println("Student Results : ");
		
		System.out.println("Congratulations here are the toppers : "+name+" "+roll_no +" "+marks);
		
	}
	
	public static void main(String[] args)
	{
		SuperEx2 s= new SuperEx2("Sweta",786,100);
		
		s.display();
		
		
		
	}
	
}