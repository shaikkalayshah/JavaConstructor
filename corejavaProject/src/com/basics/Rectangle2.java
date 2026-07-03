package com.basics;

public class Rectangle2 {
	void calculatePerimeter() {
		int length = 20;
		int breadth = 10;
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
