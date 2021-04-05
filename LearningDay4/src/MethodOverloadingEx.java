
 class Example 
{
static int getsum(int a, int b)
{
	int sum = a+b;
	return(sum);

	}

static int getsum(int a, int b, int c)

{
	return(a+b+c);
	}
}
public class MethodOverloadingEx{
	
	public static void main(String[] args)
	{
		System.out.println( Example.getsum(10,20));
		
		System.out.println(Example.getsum(10,20,30));
	}
}

