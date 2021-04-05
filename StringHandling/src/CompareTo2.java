
public class CompareTo2 {

	public static void main(String[] args){
		
		String s1="hello";
		String s2="hello";
		String s3="mekIo";
		String s4="hemlo";
		String s5="HELLO";
		
		//s1=s1.concat("Friends");
//CompareTo() example****************************	
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));//h is 5 times lower than m
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));
		System.out.println(s1.compareToIgnoreCase(s5));
		
		String t1="Sachin";
		String t2="Sachin";
		String t3=new String("Sachin");
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);//false because s3 refer to instance created in the heap memory
		
//Substring() method example**********************	
		String a="Sachin Tendulkar";
		System.out.println(a.substring(6));//here start index inclusive means the character at the index will be included in the substring
		System.out.println(a.substring(0,6));//the end index is exclusive means the character at that index will not be included in the substring

//indexOf() method and lastIndexof() Example*********************	
		System.out.println(a.indexOf("c"));
		System.out.println(a.lastIndexOf("a"));
		System.out.println(a.lastIndexOf("Tendulkar"));
		
//charAt() method example*************
		
		System.out.println(a.charAt(5));
		System.out.println(a.charAt(13));

		
//toCharArray() Method
		
		System.out.println(a.toCharArray());
		
		char[] ch=a.toCharArray();
		
		for(int i =0;i<ch.length;i++)
		{
		System.out.println(ch[i]);
		}
//replace() method example
		
		System.out.println(a.replace("Sachin", "Ramesh"));
		
//trim() method
String b="  Hello Java   ";

System.out.println(b+" Java");
System.out.println(b.trim()+" Java");
		

		}
	}



