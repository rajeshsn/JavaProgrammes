import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertNewValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num[]={23,45,4,4,5,6,6,7,9,45};
		
		int position=0;
		int value=77;
		
		for (int i =num.length-1;i>position;i--){
			
			num[i]=num[i-1];
			
		}
		num[position]=value;
		System.out.println("New Array values are:"+Arrays.toString(num));
	}

}
