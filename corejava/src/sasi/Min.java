package sasi;

class Vehicle {
	public void drive(){
		System.out.println("I am driving");
	}

}
class Car extends Vehicle
{
	public void breaks(){
		System.out.println("breaks");
	}
	
}
class Subaru extends Car{
	public void engine(){
		System.out.println("engine");
	}
	
}
public class Min{
	public static void main(String[] args) {
		Subaru s = new Subaru();
		s.engine();
	}
}