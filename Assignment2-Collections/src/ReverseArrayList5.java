import java.util.ArrayList;


public class ReverseArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1=new ArrayList<String>();
		//ArrayList a2= new ArrayList<>();
		
		a1.add("12");
		a1.add("34");
		a1.add("45");
		
		/*Collections.reverse(a1);
		System.out.println("Reverse values are :"+a1);
		
		ListIterator<String> itr = a1.listIterator();
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
			
		}*/
		
		for(int i=a1.size()-1;i>=0;i--)
		{
			System.out.println(a1.get(i));
		}
		
		
	}

}
