

import java.io.*;

class Test1{
	void m()throws IOException
	{
		throw new IOException("Device error");//checked exception
	}
	
	void n()throws IOException
	{
		m();//calling method into another method
	}
	
	void p()
	{
		try{
			n();
		}catch(Exception e)
		{
			System.out.print("exception handled");
		}
	}
}

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		t.p();
		
		System.out.println("Normal flow...........");

	}

}
