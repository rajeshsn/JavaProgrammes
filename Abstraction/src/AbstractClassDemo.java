

abstract class Shape{
	
	abstract void draw();
}

class Rectangle extends Shape{
	
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
public class AbstractClassDemo {
	
	public static void main(String[] args) {
		
		  Rectangle  s= new Rectangle();
		
		s.draw();
	}

}
