package com.assignment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.setPname("Ram");
		obj.setAddress("Punjab");
		obj.setAge(20);
		obj.setRollno(5);
		obj.setStd(12);
		obj.setPer(75);
		obj.getAge();
		obj.getAddress();
		obj.getPer();
		obj.getPname();
		obj.getRollno();
		obj.getStd();
		obj.display();
		
		Employee obj1 = new Employee();
		obj1.setPname("Shyam");
		obj1.setAddress("Pune");
		obj1.setAge(22);
		obj1.setEid(101);
		obj1.setCompany("Bhavna");
		obj1.setSalary(15000.00);
		obj1.getPname();
		obj1.getAddress();
		obj1.getAge();
		obj1.getEid();
		obj1.getCompany();
		obj1.getSalary();
		obj1.display();
	}

}
