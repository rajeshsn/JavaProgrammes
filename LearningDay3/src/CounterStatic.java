//This programme without static keyword So try with static keyword


public class CounterStatic {
	
	int count =0; //Will get memory when object is created
	
	CounterStatic()
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String args[])
	
	{
		CounterStatic c1= new CounterStatic();
		CounterStatic c2= new CounterStatic();
		CounterStatic c3= new CounterStatic();
	}
	

}
