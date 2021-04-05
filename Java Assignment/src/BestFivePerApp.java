class Percentage{

	int mark[];

	
Percentage(int mark[] ){
	
	this.mark=mark;
	
		}
	void calPer(){
		 int mark[] =new int[6];
	        int i;
	        float sum=0;
	        float  perc;
			
	        
	        for(i=0; i<mark.length; i++)
	        {
	            
	            sum = sum + mark[i];
	        }
			
	       
	        perc = (sum/600) * 100;
	        
	        System.out.print("Percentage Obtained in 6 Subjects :"+perc +"%");
		
		
	}
}

class Seventh extends Percentage{
	
	int mark[]={98,67,89,67,66,54};
	
	Seventh(int[] mark) {
		
		super(mark);
		this.mark = new int[6];
	
		// TODO Auto-generated constructor stub
	
super.calPer();
	}

	
	
	}
	
class Eighth extends Percentage{

	Eighth(int[] mark) {
		super(mark);
		// TODO Auto-generated constructor stub
	}
	
		
		
	
}

class Nineth extends Percentage{

	Nineth(int[] mark) {
		super(mark);
		int mark1[] = {98,67,89,67,66,54};
		
		// TODO Auto-generated constructor stub
	}

		}
		
	


class Tenth extends Percentage{
	Tenth(int[] mark) {
		super(mark);
		// TODO Auto-generated constructor stub
	}

	int mark[] = {98,67,89,67,66,54};
	int temp;
	int sum5=0;
	int percent;
	
		void calPer()throws ArrayIndexOutOfBoundsException{
			
			for (int i=0;i<mark.length;i++)
			{
				for (int j = i + 1; j <mark.length; j++) 
	            {
	                if (mark[i] < mark[j]) 
	                {
	                    temp = mark[i];
	                    mark[i] = mark[j];
	                    mark[j] = temp;
	                    }
	               }
			
				System.out.println("Descending Order :");
				
				for (i=0; i<mark.length-1;i++)
				{
					System.out.print(mark[i] + ",");
				}
				
				System.out.print(mark[i-1]);
			}
		
			 for(int i=0; i<mark.length; i++)
		        {
		            
		            sum5 = sum5 + mark[i];
		        }
				
			
				
				percent=((sum5*100)/500);
				
				System.out.println("10th class percentage out of best five subject :" +percent);
				
	}
}
	


 public class BestFivePerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 



Seventh s7=new Seventh(null);


s7.calPer();

	}

}
