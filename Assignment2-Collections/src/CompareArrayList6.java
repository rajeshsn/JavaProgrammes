import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1= new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		
	ArrayList<String> a3= new ArrayList<String>();
		
		a1.add("23");
		a1.add("55");
		a1.add("67");
		
		System.out.println(a1);
		
		a1.clear();
	
	a2.add("33");
	a2.add("56");
	a2.add("67");
	
	/*if (a1.equals(a2))
			
		System.out.println("Same");
	
	else
		System.out.println("Not Same");*/
	
	for (int i=0; i<=a1.size();i++)
	{
		for (int j=0;j<=a2.size();j++)
		{
			if (a1.contains(a2.get(j)))
			{
				System.out.println("YES");
		}else
			System.out.println("NO");
		}		
			
	}
	

	
	}

}
