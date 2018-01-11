package Day7hw;

import java.io.File;
import java.io.IOException;

public class BmiCalculator2 {
	public static void main(String[] args) {
		
		File f = new File("student2.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("file is created sucessfully");
		
		
	}

}
