package sasi;

public class Premetive {
public static void main(String[] args) {
	
	int a=3;
	long l= a;
	System.out.println(l);
	long g =67;
	int d=(int) g;
	System.out.println(d);
	Layout lo = new Layout();
	lo.doStuff();
	
	Integer it = 10;
	System.out.println(it.compareTo(a));
	
	
	Runtime t = Runtime.getRuntime();
	System.out.println(t.totalMemory());
	System.out.println(t.freeMemory());
	System.gc();
	System.out.println(t.freeMemory());
}
}
