
public class MultiDimensionalArray {
	
	public static void main(String args[])
	{
		int a[][]=new int [3][3];
		int b[][]=new int[3][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		b[0][0]=1;
		b[0][1]=2;
		b[0][2]=3;
		b[1][0]=4;
		b[1][1]=5;
		b[1][2]=6;
		int sum[][]=new int [3][3];
		int i;
		int j;
		
		for (i=0;i<=a.length;i++)
		{ 
			for (j=0;j<=a[0].length;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
				
		}
		
		for (i=0;i<=sum[0].length;i++)
		{
			for(j=0;j<=sum[i].length;j++)
				
				System.out.println("Sum of Arrays :"+sum[i][j] + " | ");
		}
		}
		
		
				
	
}