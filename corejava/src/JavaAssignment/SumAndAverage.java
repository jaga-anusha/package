package JavaAssignment;

public class SumAndAverage {

	public static void main(String[] args) {

		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i% 2 == 0){
				System.out.println("Even Number");
			}
			else{
				System.out.println("Odd Number");
				sum += i;
			}
			

		}

		System.out.println("The sum is  " + sum);
		System.out.println("The Average is  " + sum/50); 
		/*	double x=100; 
		
		while (x <= 100) {
			sum += x;
		}	
		
		System.out.println("The sum is  " + sum);
		System.out.println("The Average is  " + sum/100);  */
	/*	do{
			sum += x;
		}while(x <= 100);
		System.out.println("The sum is  " + sum);
		System.out.println("The Average is  " + sum/100);  */
	}

}
