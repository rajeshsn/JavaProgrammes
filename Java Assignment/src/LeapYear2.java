
class Test{
	
	int year;
	
	Test(int year){
		this.year=year;	
	}
	
	void Leap(){
		
		if (year%400==0)
			
		{
			
			System.out.println("Input year is leap year");
		}
		
		else if (year%100==0)
			
		{
			System.out.println("Input year is not leap year");
		}
		
		else if(year%4==0)
		{
			System.out.println("Input year is a leap year");
		}
	
		
		else
			System.out.println("Input year is not a leap year");
	}
}

public class LeapYear2 {
	
	public static void main (String[] args){
		
		Test t=new Test(2000);
		
		t.Leap();
	}
	
	

}
