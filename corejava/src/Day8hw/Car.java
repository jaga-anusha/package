package Day8hw;

public class Car implements Comparable<Car> {

	private String  name;
	private String vin;
	 
	public Car(String name,String vin){
		this.name =name;
		this.vin =vin;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.vin;
		
	}


	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.vin.compareTo(o.vin);
	}
		
	
}
