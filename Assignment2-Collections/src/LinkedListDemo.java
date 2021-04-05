
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> al=new LinkedList<String>();
		al.add("Ravi");
		al.add("Rahul");
		al.add("Rajesh");
		al.add("Sweta");
		al.add("Kamlesh");
		al.add("null");
		
		ListIterator itr=al.listIterator();

while(itr.hasNext()){
	
	System.out.println(itr.next());
}
int s=al.size();
System.out.println("The Size of linkedlist is :"+s);

int f =al.indexOf("Rajesh");
System.out.println("Index is "+f);

int f1 =al.lastIndexOf("Kamlesh");
System.out.println("Index is "+f1);

System.out.println("Element Replaced is place of : "+al.set(0, "MAA"));

Iterator itr1=al.iterator();

while(itr1.hasNext())
{
	System.out.println(itr1.next());
}

System.out.println("Traversing in backward direction  ");
while(itr.hasPrevious())
{
	System.out.println(itr.previous());
}



	}

}
