package Friday.operators;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		if(a>=b){
			System.out.println("a is greater than b");
		}
	    if (a==b){
			System.out.println(" a is equals to b");
		}
	   if (a!=b){
			System.out.println(" a is not equal to b");
		}
		 if (a<=b){
			System.out.println("a is less than b");
		}
		 if (a<0 && b<0){
			System.out.println("both are less than 0");
			
		}
		else if (a>0 || b<0){
			System.out.println("atleast one is +ve");
		}
		
		else{
			System.out.println("i dont know about a and b");
		}
				
				int[] value = {1,2,3,4,5};
				for(int i: value){
					System.out.println(i);
				}
		
	}

}
