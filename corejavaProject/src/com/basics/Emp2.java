package com.basics;

public class Emp2 {
	static String companyname;
	static String location;
	
	String empname;
	int salary;
	
	static {
		companyname = "TCS";
		location = "HYD";
	}
	
	void display() {
		System.out.println("company name:" + companyname);
		System.out.println("Location:" + location);
		System.out.println("Employee name:" + empname);
		System.out.println("Salary:" + salary);
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Garbage collector is called");
	}

	public static void main(String[] args) {
		Emp2 b = new Emp2();
		b.empname = "Bittu";
		b.salary = 500000;
		
		Emp2 s = new Emp2();
		s.empname = "Shyam";
		s.salary = 500000;
		
		b.display();
		s.display();
		
		System.out.println("---------------------------------------");
		
		b.empname = null;
		b.salary=0;
		b.display();
		
		System.out.println("Object is eligible");
		
		System.gc();
		

	}

}
