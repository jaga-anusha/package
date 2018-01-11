package corejava;

import java.util.Scanner;

public class EmiCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your p"); 
		  int p = scanner.nextInt();
		  System.out.println("Enter your n"); 
		  int n = scanner.nextInt();
		  System.out.println("Enter your r"); 
		  double r = scanner.nextDouble();
		
			
		double emi = (p*r*(Math.pow((1+r),n)))/(Math.pow(1+r, n-1));
		
		System.out.println(emi);
		
		
	}

}
