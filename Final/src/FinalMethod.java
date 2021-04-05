class Bike{
	
	final void run()
	{
		System.out.println("Running");
	}
}

class Honda extends Bike{
	void run()
	{
		System.out.println("running safly with 100kmph");
	}
	
}
public class FinalMethod {
	
	public static void main(String[] args)
	{
		Honda b = new Honda();
		
		b.run();
	}

	
}


