

class Account{
	
	int acc_no;
	String acc_name;
	
	void accDetails(int a, String n)
	{
		acc_no=a;
		acc_name =n;
	}
	
}

class SavingAcc extends Account{
	
	double sav_bal;
	
	
	void minbal(double s)
	{
		
	sav_bal =s;
	
	System.out.println("Min balance of customer is :" +sav_bal);
	
	}
	
}

class Transaction extends SavingAcc{
	
	double withdrawal_amt;
	double deposit_amt;
	double updated_bal;
	
	void deposit(double d)
	{
		
		deposit_amt=d;
		
		updated_bal=deposit_amt+sav_bal;
		
		System.out.println("Updated blance of Customer is:"+updated_bal);
		
	}
	
	void withdrwal(double w)
	{
		
		withdrawal_amt =w;
		
		updated_bal = updated_bal-withdrawal_amt;
		System.out.println("Updated blance of Customer is:"+updated_bal);
	
	
	if (updated_bal<withdrawal_amt)
	
		System.out.println("You dont have enough balance"+updated_bal);
	
	else
		System.out.println("Please proceed with you transaction"+withdrawal_amt);
		
		
}
}
		

public class Multilevel {
	
	public static void main (String[] args)
			{
		
		Transaction T = new Transaction();
		
		T.accDetails(111, "Rajesh");
		T.minbal(1500.40);
		T.deposit(1000);
		T.withdrwal(2000);
		
			}

}
