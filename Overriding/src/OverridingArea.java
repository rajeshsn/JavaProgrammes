class Shape
{
	String color;
	int length;
	int breadth;
	Shape(String color)
	{
		this.color=color;
		
	}
	public void Area()
		{
			System.out.println("Can not calculate area as shape not defined");
		}
		
	}


 class Triangle extends Shape{
	 

	
	Triangle(String color, int length,int breadth)
	
	{
		super(color);
		this.length=length;
		this.breadth=breadth;
	}
	 public void Area()
	
	{
		double area;
		area=0.5*length*breadth;
		System.out.println("Triangle Area is :"+area+" And color is "+super.color);
	}
}
class Rectangle extends Shape
 {

	 Rectangle(String color, int length, int breadth)
	 {
		 super(color);
		 this.length=length;
		 this.breadth=breadth;
	 }
	 
	 public void Area(){
		 
		 double area;
		 area=length*breadth; 
		 
		 System.out.println("Rectangle Area is "+area+ " And color is "+color);
		 
	 }
 }
public class OverridingArea
{
	
	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
        Shape s=new Shape("Pink");
		Triangle t =new Triangle("blue",4,3);
		Rectangle r =new Rectangle("Red",5,7);
		s.Area();
		t.Area();
	    r.Area();
		}

}
 
 
 
