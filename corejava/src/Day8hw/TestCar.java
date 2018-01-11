package Day8hw;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestCar {
	
	
	public static void main(String[] args) {
		
		ArrayList<Car> cars = new ArrayList<Car>();

		cars.add(new Car("Bmw","KA01"));
		cars.add(new Car("Bmw","TS01"));
		cars.add(new Car("Audi","TN01"));
		cars.add(new Car("Maruti","MP01"));

		System.out.println(cars);

		Collections.sort(cars);

		System.out.println(cars);
		

		
	}

}
