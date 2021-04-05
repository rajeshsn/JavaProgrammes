
class Vehicle3 {
	
	void run()
	{
		System.out.println("Vechile is running");
	}
}

class Bike extends Vehicle3{
	
	void run()
	{
		System.out.println("Bike is flying");
	}
}
public class DyanamicMethodDispatch {
	
	
	public static void main (String[] args)
	{
	Vehicle3 v=new Vehicle3();

	v.run();
	v= new Bike();
	v.run();
	}

}
