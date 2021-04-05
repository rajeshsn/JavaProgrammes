
public class ThrowDemo1 {
	
	static void age(int age)
	{
		if (age<18)
			throw new NullPointerException("Not valid age to vote");
		else
			System.out.println("Valid age to vote");
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		age(21);

	}

}
