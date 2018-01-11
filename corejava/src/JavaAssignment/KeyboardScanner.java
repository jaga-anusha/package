package JavaAssignment;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Marks");
		int Marks = scanner.nextInt();

		
		System.out.println("Enter your Average");
		double Average = scanner.nextDouble();
		
		System.out.println("Enter your name");
		String name = scanner.next();

		System.out.println(Marks );
		System.out.println(Average );
		System.out.println(name);
		//System.out.println(scanner.next());
	}

}
