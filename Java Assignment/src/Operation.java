
class Value{
	int a;
	int b;
	int c;
	
	
	void test(int a,int b){
		
		this.a=a;
		this.b=b;
	}
	
}
 
 class Addition extends Value{
	 int c;
	  void addition(){
	 
	 c=a+b;
	 
	 System.out.println("Addition value:" +c);
 }
 }
 class Substraction extends Value{
	 
	 void substraction(){
	 
	 int d=a-b;
	 
	 System.out.println("substraction value :" +d);
 }
 }
 class Multiplication extends Value{
	 
	 void multiplication(){
	 
	 int m=a*b;
	 
	 System.out.println("Multiplication value:" +m);
 }
 }
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Multiplication m = new Multiplication();
     m.test(100,55);
     m.multiplication();
     
    Substraction s =new Substraction();
    s.test(112,34);
    s.substraction();
    
    Addition add =new Addition();
    add.test(89112,7834);
    add.addition();


	}

}
