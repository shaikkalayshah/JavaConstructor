package com.basics;

public class Rectangle {
	void calculatePerimeter() {
		
		int length = 10;
		int breadth = 5;
		int perimeter = 2*(length+breadth);
		
		System.out.println("Length:"+ length);
		System.out.println("Breadth:"+ breadth);
		System.out.println("Perimeter of rectangle:"+ perimeter);

	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.calculatePerimeter();

	}

}
