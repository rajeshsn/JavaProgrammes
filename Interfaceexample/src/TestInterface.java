
interface Drawable
{
	
static void display()

{
	System.out.println("Drawing Circle");
}
	
void draw();//abstract method	
	
}

class Rectangle implements Drawable

{
	public void draw()
	
{
	System.out.println("Drawing Rectangle");	}
	
}




 class TestInterface {
	 
	 public static void main (String[] args)
	 {
		 Rectangle r= new Rectangle();
		 
		 r.draw();
	 }

}
