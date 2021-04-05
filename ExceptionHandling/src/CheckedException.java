import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		
		File file=new File("demo.txt");
		FileReader fir = new FileReader(file);

	}

}
