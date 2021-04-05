
public class ThrowDemo2 {
	
	static int product(int num1, int num2)
	{
		if (num1==0)
			throw new ArithmeticException("First parameter should not be Zero");
		else
			System.out.println("Both parameter are correct");
		
		return num1*num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res=product(0,12);
	System.out.println(res);
System.out.println("Continue next statement");
	
	}

}
