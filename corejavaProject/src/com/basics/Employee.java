package com.basics;

public class Employee {
	
	static String companyname;
	static String location;
	
	String empname;
	int salary;
	
	static{
		companyname = "TCS";
		location = "HYD";
	}
	 
		public static void main(String[] args) { 
			Employee b = new Employee();
			b.empname = "Bittu";
			b.salary = 500000;
		    
			Employee s = new Employee();
			s.empname = "Shyam";
			s.salary = 500000;
			
		    System.out.println("Companay name:" + companyname);
			System.out.println("Location:" + location);
			System.out.println("Employee name:" + b.empname);
			System.out.println("Salary:" + b.salary);
			
			System.out.println("Companay name:" + companyname);
			System.out.println("Location:" + location);
			System.out.println("Employee name:" + s.empname);
			System.out.println("Salary:" + s.salary);

				 }

	}
		// TODO Auto-generated method stub

	


