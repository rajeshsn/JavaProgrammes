import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("Tester");
		hs.add("need");
		hs.add("to");
		hs.add("learn");
		hs.add("Automation");
		
		System.out.println(hs);
			
		
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(hs.size());
		
		System.out.println(hs.isEmpty());
		
		//hs.removeAll(hs);
		//System.out.println(hs);
		
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Tester");
		hs1.add("need");
		hs1.add("Zeal");
		
		for (String element:hs1){
			
			if(hs.contains(element))
				
			{
				System.out.println("Below elements are same "+element);
			}
			
			TreeSet<E>
			
			
		}

	}

}
