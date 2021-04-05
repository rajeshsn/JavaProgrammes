

abstract class Bank{
	abstract void RateOfIntrest();
	
}

class Interest extends Bank{
	
	void RateOfIntrest()
	{
		System.out.println("SBI Rate of intrest is 7%");
	}
	
	
}

class IcInterest extends Bank{
	
	void RateOfIntrest()
	{
		System.out.println("Icici Rate of intrest is 5%");
	}
	
	
}
class PnbInterest extends Bank{
	
	void RateOfIntrest()
	{
		System.out.println("PNB Rate of intrest is 6%");
	}
	
	
}
public class AbstractClassBank {
	
	public static void main(String[] args)
	
	{
		Interest s = new Interest();
		s.RateOfIntrest();
		
		IcInterest i = new IcInterest();
		i.RateOfIntrest();
		
		PnbInterest p = new PnbInterest();
		p.RateOfIntrest();
	}
	
	

}
