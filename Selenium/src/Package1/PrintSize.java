package Package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PrintSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list = new ArrayList<String>();
		
		ArrayList<String> list1= new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list.size());
		boolean flag = list.contains("b");
				
				System.out.println(flag);
			for (int i=0;i<list.size();i++)
			{
				if (list.get(i).contains("b")){
					
					System.out.println("Expected is present");
					break;
				}
			}
			
			for (int i=0;i<list.size();i++)
{
  System.out.println(list.get(i));
  
  if(list.get(i).contains("a")){
	  
	  System.out.println("Expected is present");
	 }else
		 
		 System.out.println("Expected is not present");
  
  break;
}
			
for(int i=0;i<list.size();i++)
{
	list1.add(list.get(i));
	}

System.out.println(list1);

	}
}


