package Day7hw;

import java.io.File;
import java.io.IOException;

public class BmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File ("student1.txt");
		try {
			file.createNewFile();
			file.exists();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
