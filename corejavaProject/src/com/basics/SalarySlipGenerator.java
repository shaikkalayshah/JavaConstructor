package com.basics;

import java.util.Scanner;

public class SalarySlipGenerator {
	
	void salarySlip(String employeeName, double basicSalary) {
		
		double hra = basicSalary*20/100;
		double da = basicSalary*10/100;
		double grossSalary = basicSalary+hra+da;
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Basic Salary : " +basicSalary);
		System.out.println("HRA 20% : "+ hra);
		System.out.println("DA 10% : "+ da);
		System.out.println("Gross salary : "+grossSalary);


	}

	 void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee name:");
		String employeeName = sc.next();
//				String();
		System.out.println("Enter Basic salary:");
		double basicSalary = sc.nextDouble();
		
		SalarySlipGenerator obj = new SalarySlipGenerator();
		obj.salarySlip(employeeName, basicSalary);
		sc.close();
		

	}

}
