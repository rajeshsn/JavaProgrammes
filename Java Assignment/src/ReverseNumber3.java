class Number{
	
	int a;
	int rev;
	
	Number(int a){
		
		this.a=a;
		
	}
	void revnum(){
		
		while(a!=0){
			
			int digit=a%10;
			rev=rev*10+digit;
			a= a/10;
		}
		
		System.out.println("Reversal of input number is:"+rev);
		
	}
	
	
}
public class ReverseNumber3 {
	
	public static void main (String[] args){
		
		Number n = new Number(1234);
		
		n.revnum();
	}

}
