package Package1;

import Package2.AddressClass;

public class Mainclass {

	public static void main(String[] args) {
		
		StudentClass student = new StudentClass();
		
		student.setName("sasi");	
		
		AddressClass address = new AddressClass();
		address.setLine1("virginia");
		
		student.setAddress(address);
		
	
		System.out.println(student.getAddress().getLine1());
		
	
	}
}
