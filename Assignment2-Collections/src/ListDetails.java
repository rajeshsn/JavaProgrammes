import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Test");
		al.add("The");
		al.add("Java");
		al.add("Code");
		al.add("Patiently");
		
		//al.clear();
		
		System.out.println(al);

		System.out.println(al.isEmpty());
		int index=0;
		for (int i=0;i<al.size();i++)
			
		{
			
			System.out.println((index++)+": "+al.get(i));
		}
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("M");
		ll.add("T");
		System.out.println(ll);
		ll.addLast("I am the Last");
		System.out.println(ll);	
		
		
		
		ListIterator itr =ll.listIterator();
		
		System.out.println("Linked List in reverse order ****");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		
		ll.add(1, "Added element");
		
		System.out.println(ll);
		
		//ll.removeAll(ll);
		
		//System.out.println(ll);
		
		
		System.out.println(ll.getFirst());
	}

}
