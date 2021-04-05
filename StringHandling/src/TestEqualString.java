
public class TestEqualString {
	
	public static void main(String[] args){
		
		String s1="sachin";
		String s2="SACHIN";
		String s3="Sachin";
		
		//s1=s1.concat("Friends");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
		}


}
