class AppValue{
	int a;
	int b;
	
	AppValue(int a, int b)
	{
		this.a =a;
		this.b=b;
	}
}

class Add extends AppValue{
	Add(int a, int b){
	super(a,b);
	
}
	void add(){
		
		int c=a+b;
		System.out.println("Total value is :" +c);
	}
		
	
	}
public class Super11 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Add t=new Add(123,567);
		t.add();

	}

}
