

class Cost{
	
	double pur_cost;
    double sell_cost;
    
    Cost (double pur_cost, double sell_cost)
    {
    	this.pur_cost=pur_cost;
    	this.sell_cost=sell_cost;
    }
    
	
	public void profit()
	{
		double profit;
		
		profit=sell_cost-pur_cost;
		
		System.out.println("Profit is:"+profit);
		
	}
}
public class ProfitLoss1 {
	
	public static void main(String[] args)
	
	{
		Cost c =new Cost(80.9988,90.78787);
		
		c.profit();
	}
		
		
	}

