

interface Printable{
	
	int min =5;
	void print();
}

interface showable
{
	void show();
	}


public class MultipleInterfaces implements Printable,showable {
	
	public void print()
	{
		System.out.println("Hello");
	}
	
	public void show()
	{
		System.out.println("Welcome");
	}
	
	public static void main (String[] args)
	{
		
		MultipleInterfaces obj = new MultipleInterfaces();
		
		obj.print();
		obj.show();
		
		System.out.println(obj.min);
		
	}

}
