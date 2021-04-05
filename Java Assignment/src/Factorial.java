class Facto{
	
	int num;
	int fact;
	
	Facto(int num){
		
		this.num=num;
		
	}
	
	void Test(){
		
		int i=1;
    while(i<=num){
	 
	 fact=fact*i;
	 i++;
		}
 System.out.println("Factorial of input number is :" +fact);
	}
}
public class Factorial {
	
	public static void main (String[] args){
		
		Facto f = new Facto(5);
		
		f.Test();
	}
	
	

}
