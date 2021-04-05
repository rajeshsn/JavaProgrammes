import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CopyArrayList4 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> array1=new ArrayList<Integer>();
		ArrayList <String> array2=new ArrayList<String>();
		
		array1.add(1);
		array1.add(2);
		array1.add(23);
		
		array2.add("one");
		array2.add("Two");
		array2.add("Three");
		
		//array1.addAll(array2);
		
		//System.out.println("Totla vlaues"+array1);
		
		Collections.copy(array2, array1);
		
		System.out.println("Now Array2 values are :"+array2);
		
		Iterator itr = array1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("For eachloop**************");
		for(String s:array2)
		{
			
		}
				
		
		
		
		
	}

}
