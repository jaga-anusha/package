package Thrusday_work;

public class MainClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Horse h = new Horse("horse");
		
		System.out.println("h object is ready to use witha all methodsclass");
		
		int i = 10;
		Integer Itype =10;
		System.out.println(Itype.toString());
		double d = 0.5;
		Double Dtype = 0.5;
		System.out.println(Dtype.compareTo(d));
		short s = 0;
		Short Stype = 12;
		System.out.println(Stype.compareTo(s));
		boolean b = true;
		Boolean Btype =false;
		System.out.println(Btype.equals(b));
		byte by = -128;
		Byte BYtype = 16;
		System.out.println(BYtype.intValue());
		char c = 'S';
		Character Ctype = 'Y';
		System.out.println(Ctype.toString());
		
		
		
		
		
		Runtime  t = Runtime.getRuntime();
		System.out.println(t.totalMemory());
		System.out.println(t.freeMemory());
		System.gc();
		System.out.println(t.freeMemory());
		
		
	}

}
