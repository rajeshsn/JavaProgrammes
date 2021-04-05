

class Example2
{
float getarea(int a)
{

float area=(float)3.14*(a*a);

return(area);


}
float getarea(int h, int b)
{
			
return (float)(0.5*h*b);
}



}



public class Overloading2 {
	
	public static void main (String[] args)
	
	{
		Example2 e= new Example2();
		
		System.out.println("Area of Circle:"+ e.getarea(5));
		System.out.println("Aera of Triangle:"+e.getarea(4,3));
		
		}
	

}
