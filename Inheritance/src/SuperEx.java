class Super_class{
	
	int num =20;
	
	public void display()
	
	{
		
		System.out.println("This is the display method of Super class");
	}
}

 class Super1 extends Super_class
{
	int num =10;
	
	public void display()
	{
		System.out.println("This is the display method of Child class");
		}
	
	public void my_method(){
		
		//Super1 sub =new Super1();
		
		super.display();
		
		System.out.println("Value of the variable in child class"+num);
		System.out.println("Value of variable is parent class:"+super.num);
		
	}
}
public class SuperEx {
	
	public static void main (String[] args)
	{
		
		Super1 obj=new Super1();
		obj.my_method();
		obj.display();
	}

}
