//converting Integer object into int value

public class Demo1 {
public static void main(String[] args){
	
	int k=5;
	Integer obj1 =new Integer (k);
	int i=obj1.intValue();//returns integer value as in int
	
	System.out.println(obj1);
	System.out.println(i);
	System.out.println(i*i);
	
	Double d=new Double(2.0);
	double d1=d.intValue();
	
	System.out.println(d1*d1);
	
}
}
