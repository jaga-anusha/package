package JavaAssignment;

import java.io.FileWriter;
import java.util.Scanner;

public class FileScanner {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("FiletoRead.txt");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = scanner.nextInt();

		System.out.println("Enter your outcome");
		double outcome = scanner.nextDouble();

		System.out.println("Enter your name");
		String name = scanner.next();
		double sum = id + outcome;
		
		
		System.out.println("The integer read is "+ id );
		System.out.println("The floating point number read is"+ outcome );
		System.out.println("The String read is"+  name );
		//System.out.println("Hi!"+ name+ "the sum of"+ id+ "and"+ outcome+ "is"+ sum );
		
		file.write(id+"\n"+outcome+"\n"+name);
		file.close();
		
	}

	
}
