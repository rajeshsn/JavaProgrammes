


class Test{
	
	String str;
	Test()
	
	{
		str="Java";
	}
}

class Task extends Test
{
	
	Task()
	{
		str=str.concat(" World");
	}
	void display()
	{
		System.out.println(str);
	}
}
public class Inherit1 {
	
	public static void main (String[] args)
	
	{
		Task t = new Task();
		
		t.display();
	}

}
