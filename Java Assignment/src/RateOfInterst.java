class Bank{
	
	void getRateOfInterest(int i){
		
		
		System.out.println("**********Bank Interest Rate**********");
	}
}

class Sbi extends Bank{
	
	void getRateOfInterest(int i){
		
		System.out.println("SBI rate of Interest is :" +i);
	}
}
class Icici extends Bank{
	
	void getRateOfInterest(int i){
		
		System.out.println("ICICI rate of Interest is :" +i);
	}
}
class Axis extends Bank{
	
	void getRateOfInterest(int i){
		
		System.out.println("AXIS rate of Interest is :" +i);
	}
}
public class RateOfInterst {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Bank b =new Bank();
b.getRateOfInterest(7);

b=new Sbi();
b.getRateOfInterest(9);

b=new Icici();
b.getRateOfInterest(10);
b=new Axis();
b.getRateOfInterest(11);
	}

}
