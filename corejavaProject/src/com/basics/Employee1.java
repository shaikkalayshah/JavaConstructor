package com.basics;

public class Employee1 {
	
	@Override
	protected void  finalize() throws Throwable {
		System.out.println("Garbage collector is called");
	}
	public static void main(String[] args) {
		Employee1 bittu = new Employee1();
		System.out.println(bittu);
		
		bittu = null;
		System.out.println(bittu);
		System.out.println("Object is eligible for grabage collection");

		System.gc();
		

	}

}
