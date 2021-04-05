
public class MultipleCatchDemo1 {

	public static void main(String[] args) {
		
		try{
			
			int a[]= new int [5];
			a[6]=30/2;
			String s="Rajesh";
			int a1=s.length();
			
			System.out.println(a1);
		}catch(ArithmeticException e){
			
			System.out.println("Arithmatic exception has been occured");
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("ArrayIndexOutofBound exception has been occured");
		}
		
		catch(Exception e){
			
			System.out.println("Rest of the exception handled here");
		}
		
		
		// TODO Auto-generated method stub
		System.out.println("Rest of the code executed");
	}
	
	

}
