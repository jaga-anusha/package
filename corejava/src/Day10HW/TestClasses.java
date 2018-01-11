package Day10HW;

public class TestClasses {
	public static void main(String[] args) {
		
		Truck t = new Truck();
		t.setName("Benz");
		System.out.println(t.getName());
		Truck.Breaks b = new Truck().new Breaks();
		MyOuter m = new MyOuter();
		m.makeInner();
		System.out.println(Truck.Engine.name);
		
	}

}

class Truck{
	private String name;
    private String work = "working properly";
    
    static class Engine{
    	public static String name = "new model";
    	
    }
	class Breaks{
		Breaks(){
			System.out.println(work);
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class MyOuter {
private int x = 7;
public void makeInner() {
MyInner in = new MyInner(); // make an inner instance
in.seeOuter();
}
class MyInner {
public void seeOuter() {
System.out.println("Outer x is " + x);
}}}

