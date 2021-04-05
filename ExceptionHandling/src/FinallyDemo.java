//exception occurs but is not handled then also finally block is executed
public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int data=25/0;
			
			System.out.println(data);
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally{
			
			System.out.println("Finally block is always executed");
		}
	}

}
