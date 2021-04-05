
class Min
{
int a, b;
double p,q;
void getMin(int x, int y)
{

a=x;
b=y;

if (a<b)
	System.out.println("a is minimal");
	
	else
		System.out.println("b is minimal");
}
void getMin(double s, double t)
{

			
p=s;
q=t;

if (p<q)
	System.out.println("p is minimal");

else
	System.out.println("q is minimal");}

}




public class OverloadingEx3 {
	
	public static void main (String[] args)
	{
		Min m1 =new Min();
		
		m1.getMin(20,30);
		m1.getMin(14.5,12.3);
	}		

}
