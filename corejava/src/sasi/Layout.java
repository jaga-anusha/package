package sasi;

public class Layout {
	static int s = 343; 
	int x; 
	{
		System.out.println("hi");
		x = 7;
		int x2 = 5;
	} 

	Layout() {
		x += 8;
		int x3 = 6;
		System.out.println("hello");
	} 

	void doStuff() { 
		int y = 0; 
		for (int z = 0; z < 4; z++) { 
		System.out.println(y += z + x);
		}
	}

}
