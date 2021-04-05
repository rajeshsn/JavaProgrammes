

class Area{
	int length;
	int width;
	
	
	void setValue(){
		
		length=12;
		width=13;
		
	}
	
	void calArea(){
		
		int area;
		
		area=length*width;
		
		System.out.println("Area of Rectangle is :"+area);
	}
}
public class RectangleArea7 {
	
	public static void main(String[] args){
		
		Area a= new Area();
		a.setValue();
		a.calArea();
		
		
	}

}
