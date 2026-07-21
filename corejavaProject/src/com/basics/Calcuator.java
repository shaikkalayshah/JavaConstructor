package com.basics;

import java.util.Scanner;

public class Calcuator {
	
	void add(int a, int b, int c) {
		System.out.println("Addition ="+(a+b+c));
	}
	
	void sub(int a, int b, int c) {
		System.out.println("Subtraction ="+(a-b-c));
	}
	
	void multiply(int a, int b, int c) {
		System.out.println("Multiplication ="+(a*b*c));
	}
	
	void div(double a, double b, double c) {
		System.out.println("Division ="+ (a/b/c));
	}
	
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter frist number:");
	int a = sc.nextInt();
	
	System.out.println("Enter Second number:");
	int b = sc.nextInt();
	
	System.out.println("Enter Third number:");
	int c = sc.nextInt();
	
	Calcuator obj = new Calcuator();
	
	obj.add(a, b,c);
	obj.sub(a, b,c);
	obj.multiply(a, b,c);
	obj.div(a, b,c);
	
	sc.close();
	}

}
