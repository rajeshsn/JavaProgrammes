
public class StringSplitMehod {
	
public static void main(String[] args){
		
		String s1="Java String split method by java";
		String [] words=s1.split("\\s");//splits the string based on whitespaces
		
		
		//using java foreach loop to print elements of string array
		for (String w:words)
		{
			System.out.println(w);	
			}
		
		System.out.println();	
		String[] limit=s1.split("\\s",2);
		
		for(String l :limit)
		{
			System.out.println(l);
			
			}
}

}
