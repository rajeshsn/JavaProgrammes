
public class ArrayExample {
	
	public static void main (String args[])
	
	{
		
    int a[]= new int [5];//declaration and instantiation

		 a[0]=10;    //initialization
         a[1]=20;
         a[2]=30;
         a[3]=40;
         a[4]=50;
        //int sum[]= new int[2];
       int  sum=0;
        int i;
        int large=a[0];
        
        //for(i=0;i<a.length;i++)
        for (int i:a)
        	{
        	sum =sum + a[i];
        	}
        
	System.out.println(sum);
	
	
	for(i=0;i<a.length;i++)
	{
		if(large<a[i])
		{
			large=a[i];
		
		}
		
	}	
	System.out.println(large);
}
}
