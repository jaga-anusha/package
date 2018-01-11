package sasi;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("Dog eats biscuits");
	}

	public void eat(int i,String s) {
		
		System.out.println("Dog eats" + s + "biscuits");
	}
}